/*
 * Copyright (c)  Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made
 * available under the terms of the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

// when no target for evaluation, set it to null and disable scheduler below
targetConfigurations = [
        'aarch64Windows': [
                'temurin'
        ],
        'riscv64Linux': [
                'temurin'
        ]
        // 'x64Mac'        : [
        //         'openj9'
        // ],
        // 'x64Linux'      : [
        //         'openj9',
        //         'dragonwell',
        //         'corretto',
        //         'bisheng',
        //         'fast_startup'
        // ],
        // 'x64Windows'    : [
        //         'openj9',
        //         'dragonwell'
        // ],
        // 'ppc64Aix'      : [
        //         'openj9'
        // ],
        // 'ppc64leLinux'  : [
        //         'openj9'
        // ],
        // 's390xLinux'    : [
        //         'openj9'
        // ],
        // 'aarch64Linux'  : [
        //         'openj9',
        //         'dragonwell',
        //         'bisheng'
        // ]
]

// scmReferences to use for weekly evaluation build
weekly_evaluation_scmReferences = [
        'hotspot'        : '',
        'temurin'        : '',
        'openj9'         : '',
        'corretto'       : '',
        'dragonwell'     : '',
        'fast_startup'   : '',
        'bisheng'        : ''
]
return this
