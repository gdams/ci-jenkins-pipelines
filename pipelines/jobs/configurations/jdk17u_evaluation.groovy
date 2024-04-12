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
        'aarch64AlpineLinux' : [
                'temurin'
        ],
        'aarch64Windows': [
                'temurin'
        ],
        'riscv64Linux': [
                'temurin'
        ]
        // 'x64Mac'      : [
        //         'openj9'
        // ],
        // 'x64Linux'    : [
        //         'openj9',
        //         'bisheng'
        // ],
        // 'x64Windows'  : [
        //         'openj9'
        // ],
        // 'ppc64Aix'    : [
        //         'openj9'
        // ],
        // 'ppc64leLinux': [
        //         'openj9'
        // ],
        // 's390xLinux'  : [
        //         'openj9'
        // ],
        // 'aarch64Linux': [
        //         'openj9',
        //         'bisheng'
        // ]
]

// scmReferences to use for weekly evaluation build
weekly_evaluation_scmReferences = [
        'temurin'        : '',
        'openj9'         : '',
        'bisheng'        : ''
]
return this
