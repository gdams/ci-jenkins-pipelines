/*
 * Copyright (c)  Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made
 * available under the terms of the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

class Config9 {

    final Map<String, Map<String, ?>> buildConfigurations = [
        x64Mac    : [
                os                  : 'mac',
                arch                : 'x64',
                additionalNodeLabels: 'build-macstadium-macos1010-1',
                test                : [
                        nightly: ['sanity.openjdk', 'sanity.system'],
                        weekly : []
                ],
                configureArgs       : '--enable-dtrace=auto'
        ],

        x64Linux  : [
                os                  : 'linux',
                arch                : 'x64',
                additionalNodeLabels: 'centos6',
                test                : [
                        nightly: ['sanity.openjdk', 'sanity.system', 'sanity.external'],
                        weekly : []
                ],
                configureArgs       : '--enable-dtrace=auto'
        ],

        // Currently we have to be quite specific about which windows to use as not all of them have freetype installed
        x64Windows: [
                os                  : 'windows',
                arch                : 'x64',
                additionalNodeLabels: [
                        hotspot: 'win2012',
                        openj9:  'win2012&&mingw-cygwin'
                ],
                test                : [
                        nightly: ['sanity.openjdk'],
                        weekly : []
                ]
        ],

        ppc64Aix    : [
                os                  : 'aix',
                arch                : 'ppc64',
                test                : false
        ],

        s390xLinux    : [
                os                  : 'linux',
                arch                : 's390x',
                additionalNodeLabels: 'rhel7',
                test                : [
                        nightly: ['sanity.openjdk', 'sanity.system'],
                        weekly : []
                ],
                configureArgs       : '--enable-dtrace=auto'
        ],

        sparcv9Solaris    : [
                os                  : 'solaris',
                arch                : 'sparcv9',
                test                : false,
                configureArgs       : '--enable-dtrace=auto'
        ],

        ppc64leLinux    : [
                os                  : 'linux',
                arch                : 'ppc64le',
                additionalNodeLabels: 'centos7',
                test                : [
                        nightly: ['sanity.openjdk', 'sanity.system'],
                        weekly : []
                ],
                configureArgs       : '--enable-dtrace=auto'
        ],

        arm32Linux    : [
                os                  : 'linux',
                arch                : 'arm',
                test                : [
                        nightly: ['sanity.openjdk'],
                        weekly : []
                ],
                configureArgs       : '--enable-dtrace=auto'
        ],

        aarch64Linux    : [
                os                  : 'linux',
                arch                : 'aarch64',
                additionalNodeLabels: 'centos7',
                test                : [
                        nightly: ['sanity.openjdk'],
                        weekly : []
                ],
                configureArgs       : '--enable-dtrace=auto'
        ],

        x64LinuxXL    : [
                os                   : 'linux',
                additionalNodeLabels : 'centos6',
                arch                 : 'x64',
                test                 : false,
                additionalFileNameTag: 'linuxXL',
                configureArgs        : '--with-noncompressedrefs --enable-dtrace=auto'
        ],
  ]

}

Config9 config = new Config9()
return config.buildConfigurations
