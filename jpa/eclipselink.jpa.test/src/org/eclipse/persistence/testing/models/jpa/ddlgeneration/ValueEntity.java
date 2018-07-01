/*
 * Copyright (c) 2008, 2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2008, 2015 Daryl Davis. All rights reserved.
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
//     09/10/2008-2.4.1 Daryl Davis
//       - 386939: @ManyToMany Map<Entity,Entity> unidirectional reverses Key and Value fields on Update
package org.eclipse.persistence.testing.models.jpa.ddlgeneration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ValueEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="VALUE_ENTITY_ID")
    public String id;
    public String name;

    public ValueEntity () {
    }

    public ValueEntity (String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Value Entity [" + id + ", " + name + "]";
    }
}
