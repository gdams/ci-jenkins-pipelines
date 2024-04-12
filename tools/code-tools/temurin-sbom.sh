#!/bin/bash
# Copyright (c)  Contributors to the Eclipse Foundation
#
# This program and the accompanying materials are made
# available under the terms of the Apache Software License 2.0
# which is available at https://www.apache.org/licenses/LICENSE-2.0.
#
# SPDX-License-Identifier: Apache-2.0

set -eu

echo 'Starting build process...'
export WORKSPACE="$WORKSPACE/temurin-sbom/cyclonedx-lib"
cd "$WORKSPACE"
export JAVA_HOME=/usr/lib/jvm/jdk-17
ant -f build.xml clean
ant -f build.xml build-sign-sbom
ant -f build.xml build
