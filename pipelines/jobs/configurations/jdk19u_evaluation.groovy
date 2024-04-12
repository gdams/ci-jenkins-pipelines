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
        ]
        // 'aarch64Windows': [
        //        'temurin'
        //]
]

// if set to empty string then it wont get triggered
triggerSchedule_evaluation = 'TZ=UTC\n30 03 * * 2,4,6'
// if set to empty string then it wont get triggered
triggerSchedule_weekly_evaluation= 'TZ=UTC\n05 17 * * 7'

// scmReferences to use for weekly evaluation build
weekly_evaluation_scmReferences = [
        'temurin'        : ''
]
return this
