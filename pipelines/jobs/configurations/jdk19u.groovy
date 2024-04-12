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
        'aarch64Mac': [
                'temurin'
        ],
        'arm32Linux'  : [
                'temurin'
        ]

]

// 03:30 Tue, Thur, Sat
triggerSchedule_nightly = 'TZ=UTC\n30 03 * * 2,4,6'
// 17:05 Sun
triggerSchedule_weekly = 'TZ=UTC\n05 17 * * 7'

// scmReferences to use for weekly release build
weekly_release_scmReferences = [
        'hotspot'        : '',
        'temurin'        : '',
        'openj9'         : '',
        'corretto'       : '',
        'dragonwell'     : ''
]

disableJob = true

return this
