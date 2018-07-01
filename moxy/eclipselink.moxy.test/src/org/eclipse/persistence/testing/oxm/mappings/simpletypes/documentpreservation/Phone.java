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
package org.eclipse.persistence.testing.oxm.mappings.simpletypes.documentpreservation;

public class Phone  {
    private String number;

    public Phone() {}

    public Phone(String newNumber) {
        number = newNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String newNumber) {
        number = newNumber;
    }

    public String toString() {
        return "Phone(number=" + number + ")";
    }

    public boolean equals(Object object) {
        if(!(object instanceof Phone)) {
            return false;
        }

        if (!((Phone)object).getNumber().equals(this.getNumber())) {
            return false;
        }

        return true;
    }
}
