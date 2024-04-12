/*
 * Copyright (c)  Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made
 * available under the terms of the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

targetConfigurations = [
        'x64Mac'      : [
                'temurin'
        ],
        'x64Linux'    : [
                'temurin'
        ],
        'x64AlpineLinux' : [
                'temurin'
        ],
        'x64Windows'  : [
                'temurin'
        ],
        'x32Windows'  : [
                'temurin'
        ],
        'ppc64Aix'    : [
                'temurin'
        ],
        'ppc64leLinux': [
                'temurin'
        ],
        's390xLinux'  : [
                'temurin'
        ],
        'aarch64Linux': [
                'temurin'
        ],
        'aarch64AlpineLinux' : [
                'temurin'
        ],
        'aarch64Mac': [
                'temurin'
        ],
        'arm32Linux'  : [
                'temurin'
        ]
]

// 23:30 Mon, Wed, Fri
triggerSchedule_nightly = 'TZ=UTC\n30 23 * * 1,3,5'
// 23:30 Sat
triggerSchedule_weekly = 'TZ=UTC\n30 23 * * 6'

// scmReferences to use for weekly release build
weekly_release_scmReferences = [
        'temurin'        : '',
        'openj9'         : '',
        'corretto'       : '',
        'dragonwell'     : ''
]

disableJob = true

return this
