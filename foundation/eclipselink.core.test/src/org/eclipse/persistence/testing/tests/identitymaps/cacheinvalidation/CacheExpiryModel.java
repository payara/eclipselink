/*
 * Copyright (c) 1998, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.tests.identitymaps.cacheinvalidation;

import org.eclipse.persistence.testing.framework.TestModel;

public class CacheExpiryModel extends TestModel {
    public CacheExpiryModel() {
        setDescription("This model tests the EclipseLink Cache Expiry feature.");
    }

    public void addRequiredSystems() {
        addRequiredSystem(new org.eclipse.persistence.testing.models.employee.relational.EmployeeSystem());
        addRequiredSystem(new org.eclipse.persistence.testing.models.insurance.InsuranceSystem());
    }

    public void addTests() {
        addTest(new CacheExpiryTestSuite());
    }
}
