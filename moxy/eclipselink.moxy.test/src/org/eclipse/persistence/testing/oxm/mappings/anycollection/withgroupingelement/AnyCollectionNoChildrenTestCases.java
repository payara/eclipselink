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
package org.eclipse.persistence.testing.oxm.mappings.anycollection.withgroupingelement;

/**
 *  @version $Header: AnyCollectionNoChildrenTestCases.java 29-jun-2007.13:21:25 dmahar Exp $
 *  @author  mmacivor
 *  @since   release specific (what release of product did this appear in)
 */

import org.eclipse.persistence.testing.oxm.mappings.XMLWithJSONMappingTestCases;

public class AnyCollectionNoChildrenTestCases extends XMLWithJSONMappingTestCases {
    public AnyCollectionNoChildrenTestCases(String name) throws Exception {
        super(name);
        setProject(new AnyCollectionWithGroupingElementProject());
        setControlDocument("org/eclipse/persistence/testing/oxm/mappings/anycollection/withgroupingelement/no_children.xml");
        setControlJSON("org/eclipse/persistence/testing/oxm/mappings/anycollection/withgroupingelement/no_children.json");
    }

    public Object getControlObject() {
        Root root = new Root();
        return root;
    }
}

