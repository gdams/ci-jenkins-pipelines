/*
 * Copyright (c)  Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made
 * available under the terms of the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

import groovy.json.JsonSlurper

// Need to set PR's original commit and repo url into downstream job's USER_REMOTE_CONFIGS
String branch = "${ghprbActualCommit}"
String gitRemoteConfigs = "${ghprbAuthorRepoGitUrl}"
String DEFAULTS_FILE_URL = "https://raw.githubusercontent.com/adoptium/ci-jenkins-pipelines/${branch}/pipelines/defaults.json"

// Retrieve User defaults
def getUser = new URL(DEFAULTS_FILE_URL).openConnection()
Map<String, ?> DEFAULTS_JSON = new JsonSlurper().parseText(getUser.getInputStream().getText()) as Map
if (!DEFAULTS_JSON) {
    throw new Exception("[ERROR] No DEFAULTS_JSON found at ${DEFAULTS_FILE_URL}. Please ensure this path is correct and it leads to a JSON or Map object file.")
}

String url = gitRemoteConfigs // DEFAULTS_JSON['repository']['pipeline_url']
String helperRef = DEFAULTS_JSON['repository']['helper_ref']
Closure prTest

// Switch to controller node to load library groovy definitions
node('worker') {
    checkout([
        $class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[
            refspec: ' +refs/pull/*/head:refs/remotes/origin/pr/*/head +refs/heads/master:refs/remotes/origin/master +refs/heads/*:refs/remotes/origin/*',
            url: url
        ]]
    ])

    library(identifier: "openjdk-jenkins-helper@${helperRef}")
    prTest = load DEFAULTS_JSON['scriptDirectories']['tester']
}

// Run tests outside node context
prTest(
        branch,
        currentBuild,
        this,
        url,
        DEFAULTS_JSON
).runTests()
