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
        'riscv64Linux': [
                'temurin'
        ],
        'aarch64Windows' : [
                'temurin'
        ]
]

// scmReferences to use for weekly evaluation release build
weekly_evaluation_scmReferences = [
        'hotspot'        : '',
        'temurin'        : ''
]

return this
