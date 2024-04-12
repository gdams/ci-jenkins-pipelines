/*
 * Copyright (c)  Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made
 * available under the terms of the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

import org.codehaus.groovy.transform.stc.GroovyTypeCheckingExtensionSupport

class JenkinsTypeCheckHelperExtension extends GroovyTypeCheckingExtensionSupport.TypeCheckingDSL {

    Object run() {
        unresolvedProperty {
            pexp ->
                if (pexp.propertyAsString.equals('scmVars')) {
                storeType(var, classNodeFor(ScmVarsStub))
                handled = true
                }
        }

        unresolvedVariable {
            var ->
                if (var.name.equals('JobHelper')) {
                storeType(var, classNodeFor(JobHelper))
                handled = true
                } else if (var.name.equals('NodeHelper')) {
                storeType(var, classNodeFor(NodeHelper))
                handled = true
                }
        }

        methodNotFound { receiver, name, argList, argTypes, call ->
            if (receiver == classNodeFor(Date)
                    && name == 'format') {
                handled = true
                return newMethod('format', classNodeFor(Date))
                    }
        }
    }

}
