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
package org.eclipse.persistence.testing.models.conversion;

import java.util.*;

/**
 * TopLink generated Project class.
 * <b>WARNING</b>: This code was generated by an automated tool.
 * Any changes will be lost when the code is re-generated
 */
public class ConversionManagerProject extends org.eclipse.persistence.sessions.Project {

    /**
     * <b>WARNING</b>: This code was generated by an automated tool.
     * Any changes will be lost when the code is re-generated
     */
    public ConversionManagerProject() {
        applyPROJECT();
        applyLOGIN();
        buildConversionDataObjectDescriptor();
    }

    /**
     * TopLink generated method.
     * <b>WARNING</b>: This code was generated by an automated tool.
     * Any changes will be lost when the code is re-generated
     */
    protected void applyLOGIN() {
        setDatasourceLogin(new org.eclipse.persistence.sessions.DatabaseLogin());
    }

    /**
     * TopLink generated method.
     * <b>WARNING</b>: This code was generated by an automated tool.
     * Any changes will be lost when the code is re-generated
     */
    protected void applyPROJECT() {
        setName("ConversionManagerSystem");
    }

    /**
     * TopLink generated method.
     * <b>WARNING</b>: This code was generated by an automated tool.
     * Any changes will be lost when the code is re-generated
     */
    protected void buildConversionDataObjectDescriptor() {
        org.eclipse.persistence.descriptors.RelationalDescriptor descriptor = new org.eclipse.persistence.descriptors.RelationalDescriptor();

        // SECTION: DESCRIPTOR
        descriptor.setJavaClass(org.eclipse.persistence.testing.models.conversion.ConversionDataObject.class);
        Vector vector = new Vector();
        vector.addElement("CM_OBJ");
        descriptor.setTableNames(vector);
        descriptor.addPrimaryKeyFieldName("CM_OBJ.ID");

        // SECTION: PROPERTIES
        descriptor.setIdentityMapClass(org.eclipse.persistence.internal.identitymaps.FullIdentityMap.class);
        descriptor.setSequenceNumberName("SEQ");
        descriptor.setSequenceNumberFieldName("ID");
        descriptor.getQueryManager().setExistenceCheck("Check cache");
        descriptor.setIdentityMapSize(100);

        // SECTION: COPY POLICY
        descriptor.createCopyPolicy("constructor");

        // SECTION: INSTANTIATION POLICY
        descriptor.createInstantiationPolicy("constructor");

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping.setAttributeName("aBigDecimal");
        directtofieldmapping.setIsReadOnly(false);
        directtofieldmapping.setFieldName("CM_OBJ.A_BIGDEC");
        descriptor.addMapping(directtofieldmapping);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping1 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping1.setAttributeName("aBigInteger");
        directtofieldmapping1.setIsReadOnly(false);
        directtofieldmapping1.setFieldName("CM_OBJ.A_BIGINT");
        descriptor.addMapping(directtofieldmapping1);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping2 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping2.setAttributeName("aBoolean");
        directtofieldmapping2.setIsReadOnly(false);
        directtofieldmapping2.setFieldName("CM_OBJ.A_BOOLEAN");
        descriptor.addMapping(directtofieldmapping2);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping3 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping3.setAttributeName("aByte");
        directtofieldmapping3.setIsReadOnly(false);
        directtofieldmapping3.setFieldName("CM_OBJ.A_BYTE");
        descriptor.addMapping(directtofieldmapping3);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping4 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping4.setAttributeName("aCalendar");
        directtofieldmapping4.setIsReadOnly(false);
        directtofieldmapping4.setFieldName("CM_OBJ.A_CALNDR");
        descriptor.addMapping(directtofieldmapping4);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping5 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping5.setAttributeName("aCharacter");
        directtofieldmapping5.setIsReadOnly(false);
        directtofieldmapping5.setFieldName("CM_OBJ.A_CHAR");
        descriptor.addMapping(directtofieldmapping5);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping6 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping6.setAttributeName("aDouble");
        directtofieldmapping6.setIsReadOnly(false);
        directtofieldmapping6.setFieldName("CM_OBJ.A_DOUBLE");
        descriptor.addMapping(directtofieldmapping6);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping7 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping7.setAttributeName("aFloat");
        directtofieldmapping7.setIsReadOnly(false);
        directtofieldmapping7.setFieldName("CM_OBJ.A_FLOAT");
        descriptor.addMapping(directtofieldmapping7);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping8 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping8.setAttributeName("aJavaDate");
        directtofieldmapping8.setIsReadOnly(false);
        directtofieldmapping8.setFieldName("CM_OBJ.A_JAVADATE");
        descriptor.addMapping(directtofieldmapping8);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping9 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping9.setAttributeName("aLong");
        directtofieldmapping9.setIsReadOnly(false);
        directtofieldmapping9.setFieldName("CM_OBJ.A_LONG");
        descriptor.addMapping(directtofieldmapping9);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping10 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping10.setAttributeName("anInteger");
        directtofieldmapping10.setIsReadOnly(false);
        directtofieldmapping10.setFieldName("CM_OBJ.AN_INTEGER");
        descriptor.addMapping(directtofieldmapping10);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping11 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping11.setAttributeName("anSQLDate");
        directtofieldmapping11.setIsReadOnly(false);
        directtofieldmapping11.setFieldName("CM_OBJ.AN_SQLDATE");
        descriptor.addMapping(directtofieldmapping11);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping12 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping12.setAttributeName("aNumber");
        directtofieldmapping12.setIsReadOnly(false);
        directtofieldmapping12.setFieldName("CM_OBJ.A_NUMBER");
        descriptor.addMapping(directtofieldmapping12);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping13 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping13.setAttributeName("aPBoolean");
        directtofieldmapping13.setIsReadOnly(false);
        directtofieldmapping13.setFieldName("CM_OBJ.A_PBOOLEAN");
        descriptor.addMapping(directtofieldmapping13);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping14 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping14.setAttributeName("aPByte");
        directtofieldmapping14.setIsReadOnly(false);
        directtofieldmapping14.setFieldName("CM_OBJ.A_PBYTE");
        descriptor.addMapping(directtofieldmapping14);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping15 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping15.setAttributeName("aPByteArray");
        directtofieldmapping15.setIsReadOnly(false);
        directtofieldmapping15.setGetMethodName("getAPByteArray");
        directtofieldmapping15.setSetMethodName("setAPByteArray");
        directtofieldmapping15.setFieldName("CM_OBJ.A_PBYTE_A");
        descriptor.addMapping(directtofieldmapping15);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping16 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping16.setAttributeName("aPChar");
        directtofieldmapping16.setIsReadOnly(false);
        directtofieldmapping16.setFieldName("CM_OBJ.A_PCHAR");
        descriptor.addMapping(directtofieldmapping16);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping17 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping17.setAttributeName("aPDouble");
        directtofieldmapping17.setIsReadOnly(false);
        directtofieldmapping17.setFieldName("CM_OBJ.A_PDOUBLE");
        descriptor.addMapping(directtofieldmapping17);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping18 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping18.setAttributeName("aPFloat");
        directtofieldmapping18.setIsReadOnly(false);
        directtofieldmapping18.setFieldName("CM_OBJ.A_PFLOAT");
        descriptor.addMapping(directtofieldmapping18);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping19 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping19.setAttributeName("aPInt");
        directtofieldmapping19.setIsReadOnly(false);
        directtofieldmapping19.setFieldName("CM_OBJ.A_PINT");
        descriptor.addMapping(directtofieldmapping19);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping20 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping20.setAttributeName("aPLong");
        directtofieldmapping20.setIsReadOnly(false);
        directtofieldmapping20.setFieldName("CM_OBJ.A_PLONG");
        descriptor.addMapping(directtofieldmapping20);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping21 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping21.setAttributeName("aPShort");
        directtofieldmapping21.setIsReadOnly(false);
        directtofieldmapping21.setFieldName("CM_OBJ.A_PSHORT");
        descriptor.addMapping(directtofieldmapping21);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping22 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping22.setAttributeName("aShort");
        directtofieldmapping22.setIsReadOnly(false);
        directtofieldmapping22.setFieldName("CM_OBJ.A_SHORT");
        descriptor.addMapping(directtofieldmapping22);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping23 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping23.setAttributeName("aString");
        directtofieldmapping23.setIsReadOnly(false);
        directtofieldmapping23.setFieldName("CM_OBJ.A_STRING");
        descriptor.addMapping(directtofieldmapping23);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping24 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping24.setAttributeName("aTime");
        directtofieldmapping24.setIsReadOnly(false);
        directtofieldmapping24.setFieldName("CM_OBJ.A_TIME");
        descriptor.addMapping(directtofieldmapping24);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping25 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping25.setAttributeName("aTimestamp");
        directtofieldmapping25.setIsReadOnly(false);
        directtofieldmapping25.setFieldName("CM_OBJ.A_TIMESTMP");
        descriptor.addMapping(directtofieldmapping25);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping26 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping26.setAttributeName("id");
        directtofieldmapping26.setIsReadOnly(false);
        directtofieldmapping26.setFieldName("CM_OBJ.ID");
        descriptor.addMapping(directtofieldmapping26);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping27 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping27.setAttributeName("aPCharArray");
        directtofieldmapping27.setIsReadOnly(false);
        directtofieldmapping27.setGetMethodName("getAPCharArray");
        directtofieldmapping27.setSetMethodName("setAPCharArray");
        directtofieldmapping27.setFieldName("CM_OBJ.A_PCHAR_A");
        descriptor.addMapping(directtofieldmapping27);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping.setConverter(typeconversionconverter);
        typeconversionmapping.setAttributeName("floatToByte");
        typeconversionmapping.setIsReadOnly(false);
        typeconversionmapping.setFieldName("CM_OBJ.FLT2BYTE");
        typeconversionconverter.setObjectClass(java.lang.Float.class);
        typeconversionconverter.setDataClass(java.lang.Byte.class);
        descriptor.addMapping(typeconversionmapping);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping1 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter1 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping1.setConverter(typeconversionconverter1);
        typeconversionmapping1.setAttributeName("floatToDouble");
        typeconversionmapping1.setIsReadOnly(false);
        typeconversionmapping1.setFieldName("CM_OBJ.FLT2DBL");
        typeconversionconverter1.setObjectClass(java.lang.Float.class);
        typeconversionconverter1.setDataClass(java.lang.Double.class);
        descriptor.addMapping(typeconversionmapping1);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping2 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter2 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping2.setConverter(typeconversionconverter2);
        typeconversionmapping2.setAttributeName("floatToInt");
        typeconversionmapping2.setIsReadOnly(false);
        typeconversionmapping2.setFieldName("CM_OBJ.FLT2INT");
        typeconversionconverter2.setObjectClass(java.lang.Float.class);
        typeconversionconverter2.setDataClass(java.lang.Integer.class);
        descriptor.addMapping(typeconversionmapping2);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping3 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter3 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping3.setConverter(typeconversionconverter3);
        typeconversionmapping3.setAttributeName("floatToLong");
        typeconversionmapping3.setIsReadOnly(false);
        typeconversionmapping3.setFieldName("CM_OBJ.FLT2LNG");
        typeconversionconverter3.setObjectClass(java.lang.Float.class);
        typeconversionconverter3.setDataClass(java.lang.Long.class);
        descriptor.addMapping(typeconversionmapping3);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping4 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter4 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping4.setConverter(typeconversionconverter4);
        typeconversionmapping4.setAttributeName("floatToShort");
        typeconversionmapping4.setIsReadOnly(false);
        typeconversionmapping4.setFieldName("CM_OBJ.FLT2SHORT");
        typeconversionconverter4.setObjectClass(java.lang.Float.class);
        typeconversionconverter4.setDataClass(java.lang.Short.class);
        descriptor.addMapping(typeconversionmapping4);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping5 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter5 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping5.setConverter(typeconversionconverter5);
        typeconversionmapping5.setAttributeName("floatToString");
        typeconversionmapping5.setIsReadOnly(false);
        typeconversionmapping5.setFieldName("CM_OBJ.FLT2STR");
        typeconversionconverter5.setObjectClass(java.lang.Float.class);
        typeconversionconverter5.setDataClass(java.lang.String.class);
        descriptor.addMapping(typeconversionmapping5);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping6 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter6 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping6.setConverter(typeconversionconverter6);
        typeconversionmapping6.setAttributeName("intToByte");
        typeconversionmapping6.setIsReadOnly(false);
        typeconversionmapping6.setFieldName("CM_OBJ.INT2BYTE");
        typeconversionconverter6.setObjectClass(java.lang.Integer.class);
        typeconversionconverter6.setDataClass(java.lang.Byte.class);
        descriptor.addMapping(typeconversionmapping6);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping7 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter7 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping7.setConverter(typeconversionconverter7);
        typeconversionmapping7.setAttributeName("intToDouble");
        typeconversionmapping7.setIsReadOnly(false);
        typeconversionmapping7.setFieldName("CM_OBJ.INT2DBL");
        typeconversionconverter7.setObjectClass(java.lang.Integer.class);
        typeconversionconverter7.setDataClass(java.lang.Double.class);
        descriptor.addMapping(typeconversionmapping7);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping8 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter8 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping8.setConverter(typeconversionconverter8);
        typeconversionmapping8.setAttributeName("intToFloat");
        typeconversionmapping8.setIsReadOnly(false);
        typeconversionmapping8.setFieldName("CM_OBJ.INT2FLT");
        typeconversionconverter8.setObjectClass(java.lang.Integer.class);
        typeconversionconverter8.setDataClass(java.lang.Float.class);
        descriptor.addMapping(typeconversionmapping8);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping9 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter9 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping9.setConverter(typeconversionconverter9);
        typeconversionmapping9.setAttributeName("intToLong");
        typeconversionmapping9.setIsReadOnly(false);
        typeconversionmapping9.setFieldName("CM_OBJ.INT2LNG");
        typeconversionconverter9.setObjectClass(java.lang.Integer.class);
        typeconversionconverter9.setDataClass(java.lang.Long.class);
        descriptor.addMapping(typeconversionmapping9);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping10 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter10 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping10.setConverter(typeconversionconverter10);
        typeconversionmapping10.setAttributeName("intToShort");
        typeconversionmapping10.setIsReadOnly(false);
        typeconversionmapping10.setFieldName("CM_OBJ.INT2SHORT");
        typeconversionconverter10.setObjectClass(java.lang.Integer.class);
        typeconversionconverter10.setDataClass(java.lang.Short.class);
        descriptor.addMapping(typeconversionmapping10);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping11 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter11 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping11.setConverter(typeconversionconverter11);
        typeconversionmapping11.setAttributeName("intToString");
        typeconversionmapping11.setIsReadOnly(false);
        typeconversionmapping11.setFieldName("CM_OBJ.INT2STR");
        typeconversionconverter11.setObjectClass(java.lang.Integer.class);
        typeconversionconverter11.setDataClass(java.lang.String.class);
        descriptor.addMapping(typeconversionmapping11);

        // SECTION: TYPECONVERSIONMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping12 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter12 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping12.setConverter(typeconversionconverter12);
        typeconversionmapping12.setAttributeName("timestamp2Long");
        typeconversionmapping12.setIsReadOnly(false);
        typeconversionmapping12.setFieldName("CM_OBJ.TIMESP2LNG");
        typeconversionconverter12.setObjectClass(java.lang.Long.class);
        typeconversionconverter12.setDataClass(java.sql.Timestamp.class);
        descriptor.addMapping(typeconversionmapping12);
        addDescriptor(descriptor);

        // SECTION: TYPECONVERSIONMAPPING
        // This mapping has been added to test cr 2293.
        org.eclipse.persistence.mappings.DirectToFieldMapping typeconversionmapping13 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        org.eclipse.persistence.mappings.converters.TypeConversionConverter typeconversionconverter13 = new org.eclipse.persistence.mappings.converters.TypeConversionConverter();
        typeconversionmapping13.setConverter(typeconversionconverter13);
        typeconversionmapping13.setAttributeName("stringToInt");
        typeconversionmapping13.setIsReadOnly(false);
        typeconversionmapping13.setFieldName("CM_OBJ.STR2INT");
        typeconversionconverter13.setObjectClass(java.lang.String.class);
        typeconversionconverter13.setDataClass(java.lang.Integer.class);
        descriptor.addMapping(typeconversionmapping13);
    }
}
