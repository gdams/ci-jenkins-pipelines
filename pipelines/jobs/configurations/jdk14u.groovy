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
                'hotspot',
                'openj9'
        ],
        'x64MacXL'    : [
                'openj9'
        ],
        'x64Linux'    : [
                'hotspot',
                'openj9'
        ],
        'x64LinuxXL'  : [
                'openj9'
        ],
        'x64Windows'  : [
                'hotspot',
                'openj9'
        ],
        'x64WindowsXL': [
                'openj9'
        ],
        'x32Windows'  : [
                'hotspot'
        ],
        'ppc64Aix'    : [
                'hotspot',
                'openj9'
        ],
        'ppc64leLinux': [
                'hotspot',
                'openj9'
        ],
        'ppc64leLinuxXL': [
                'openj9'
        ],
        's390xLinux'  : [
                'hotspot',
                'openj9'
        ],
        's390xLinuxXL': [
                'openj9'
        ],
        'aarch64Linux': [
                'hotspot'
        ],
        'arm32Linux'  : [
                'hotspot'
        ]
]

disableJob = true

return this
