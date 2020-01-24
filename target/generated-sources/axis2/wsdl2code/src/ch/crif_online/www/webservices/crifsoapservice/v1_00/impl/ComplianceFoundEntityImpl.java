/*
 * XML Type:  ComplianceFoundEntity
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ComplianceFoundEntity(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ComplianceFoundEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity
{
    private static final long serialVersionUID = 1L;
    
    public ComplianceFoundEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "listDescription");
    private static final javax.xml.namespace.QName MATCHINFORMATION$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "matchInformation");
    private static final javax.xml.namespace.QName CRIFREFID$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "crifRefId");
    private static final javax.xml.namespace.QName PRIMARYNAME$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "primaryName");
    private static final javax.xml.namespace.QName FURTHERNAMES$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "furtherNames");
    private static final javax.xml.namespace.QName BIRTHDATES$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "birthdates");
    private static final javax.xml.namespace.QName AGE$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "age");
    private static final javax.xml.namespace.QName TITLES$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "titles");
    private static final javax.xml.namespace.QName COUNTRY$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "country");
    private static final javax.xml.namespace.QName FURTHERCOUNTRIES$18 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "furtherCountries");
    private static final javax.xml.namespace.QName BIRTHPLACES$20 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "birthplaces");
    private static final javax.xml.namespace.QName PASSPORTSORIDS$22 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "passportsOrIds");
    private static final javax.xml.namespace.QName KNOWNADDRESSES$24 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "knownAddresses");
    private static final javax.xml.namespace.QName KEYWORDS$26 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "keywords");
    private static final javax.xml.namespace.QName ADDITIONALINFORMATIONS$28 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalInformations");
    
    
    /**
     * Gets the "listDescription" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription getListDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription)get_store().find_element_user(LISTDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "listDescription" element
     */
    public void setListDescription(ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription listDescription)
    {
        generatedSetterHelperImpl(listDescription, LISTDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "listDescription" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription addNewListDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription)get_store().add_element_user(LISTDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Gets the "matchInformation" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceMatchInformation getMatchInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceMatchInformation target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceMatchInformation)get_store().find_element_user(MATCHINFORMATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "matchInformation" element
     */
    public void setMatchInformation(ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceMatchInformation matchInformation)
    {
        generatedSetterHelperImpl(matchInformation, MATCHINFORMATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "matchInformation" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceMatchInformation addNewMatchInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceMatchInformation target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceMatchInformation)get_store().add_element_user(MATCHINFORMATION$2);
            return target;
        }
    }
    
    /**
     * Gets the "crifRefId" element
     */
    public int getCrifRefId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRIFREFID$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "crifRefId" element
     */
    public org.apache.xmlbeans.XmlInt xgetCrifRefId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CRIFREFID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "crifRefId" element
     */
    public void setCrifRefId(int crifRefId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRIFREFID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRIFREFID$4);
            }
            target.setIntValue(crifRefId);
        }
    }
    
    /**
     * Sets (as xml) the "crifRefId" element
     */
    public void xsetCrifRefId(org.apache.xmlbeans.XmlInt crifRefId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CRIFREFID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CRIFREFID$4);
            }
            target.set(crifRefId);
        }
    }
    
    /**
     * Gets the "primaryName" element
     */
    public java.lang.String getPrimaryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "primaryName" element
     */
    public org.apache.xmlbeans.XmlString xgetPrimaryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYNAME$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "primaryName" element
     */
    public void setPrimaryName(java.lang.String primaryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYNAME$6);
            }
            target.setStringValue(primaryName);
        }
    }
    
    /**
     * Sets (as xml) the "primaryName" element
     */
    public void xsetPrimaryName(org.apache.xmlbeans.XmlString primaryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYNAME$6);
            }
            target.set(primaryName);
        }
    }
    
    /**
     * Gets array of all "furtherNames" elements
     */
    public java.lang.String[] getFurtherNamesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FURTHERNAMES$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "furtherNames" element
     */
    public java.lang.String getFurtherNamesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FURTHERNAMES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "furtherNames" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetFurtherNamesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FURTHERNAMES$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "furtherNames" element
     */
    public org.apache.xmlbeans.XmlString xgetFurtherNamesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FURTHERNAMES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "furtherNames" element
     */
    public int sizeOfFurtherNamesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FURTHERNAMES$8);
        }
    }
    
    /**
     * Sets array of all "furtherNames" element
     */
    public void setFurtherNamesArray(java.lang.String[] furtherNamesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(furtherNamesArray, FURTHERNAMES$8);
        }
    }
    
    /**
     * Sets ith "furtherNames" element
     */
    public void setFurtherNamesArray(int i, java.lang.String furtherNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FURTHERNAMES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(furtherNames);
        }
    }
    
    /**
     * Sets (as xml) array of all "furtherNames" element
     */
    public void xsetFurtherNamesArray(org.apache.xmlbeans.XmlString[]furtherNamesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(furtherNamesArray, FURTHERNAMES$8);
        }
    }
    
    /**
     * Sets (as xml) ith "furtherNames" element
     */
    public void xsetFurtherNamesArray(int i, org.apache.xmlbeans.XmlString furtherNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FURTHERNAMES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(furtherNames);
        }
    }
    
    /**
     * Inserts the value as the ith "furtherNames" element
     */
    public void insertFurtherNames(int i, java.lang.String furtherNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FURTHERNAMES$8, i);
            target.setStringValue(furtherNames);
        }
    }
    
    /**
     * Appends the value as the last "furtherNames" element
     */
    public void addFurtherNames(java.lang.String furtherNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FURTHERNAMES$8);
            target.setStringValue(furtherNames);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "furtherNames" element
     */
    public org.apache.xmlbeans.XmlString insertNewFurtherNames(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FURTHERNAMES$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "furtherNames" element
     */
    public org.apache.xmlbeans.XmlString addNewFurtherNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FURTHERNAMES$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "furtherNames" element
     */
    public void removeFurtherNames(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FURTHERNAMES$8, i);
        }
    }
    
    /**
     * Gets array of all "birthdates" elements
     */
    public java.lang.String[] getBirthdatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BIRTHDATES$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "birthdates" element
     */
    public java.lang.String getBirthdatesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHDATES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "birthdates" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetBirthdatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BIRTHDATES$10, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "birthdates" element
     */
    public org.apache.xmlbeans.XmlString xgetBirthdatesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIRTHDATES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "birthdates" element
     */
    public int sizeOfBirthdatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHDATES$10);
        }
    }
    
    /**
     * Sets array of all "birthdates" element
     */
    public void setBirthdatesArray(java.lang.String[] birthdatesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(birthdatesArray, BIRTHDATES$10);
        }
    }
    
    /**
     * Sets ith "birthdates" element
     */
    public void setBirthdatesArray(int i, java.lang.String birthdates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHDATES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(birthdates);
        }
    }
    
    /**
     * Sets (as xml) array of all "birthdates" element
     */
    public void xsetBirthdatesArray(org.apache.xmlbeans.XmlString[]birthdatesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(birthdatesArray, BIRTHDATES$10);
        }
    }
    
    /**
     * Sets (as xml) ith "birthdates" element
     */
    public void xsetBirthdatesArray(int i, org.apache.xmlbeans.XmlString birthdates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIRTHDATES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(birthdates);
        }
    }
    
    /**
     * Inserts the value as the ith "birthdates" element
     */
    public void insertBirthdates(int i, java.lang.String birthdates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BIRTHDATES$10, i);
            target.setStringValue(birthdates);
        }
    }
    
    /**
     * Appends the value as the last "birthdates" element
     */
    public void addBirthdates(java.lang.String birthdates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIRTHDATES$10);
            target.setStringValue(birthdates);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "birthdates" element
     */
    public org.apache.xmlbeans.XmlString insertNewBirthdates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(BIRTHDATES$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "birthdates" element
     */
    public org.apache.xmlbeans.XmlString addNewBirthdates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BIRTHDATES$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "birthdates" element
     */
    public void removeBirthdates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHDATES$10, i);
        }
    }
    
    /**
     * Gets the "age" element
     */
    public java.lang.String getAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "age" element
     */
    public org.apache.xmlbeans.XmlString xgetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "age" element
     */
    public boolean isSetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGE$12) != 0;
        }
    }
    
    /**
     * Sets the "age" element
     */
    public void setAge(java.lang.String age)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGE$12);
            }
            target.setStringValue(age);
        }
    }
    
    /**
     * Sets (as xml) the "age" element
     */
    public void xsetAge(org.apache.xmlbeans.XmlString age)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGE$12);
            }
            target.set(age);
        }
    }
    
    /**
     * Unsets the "age" element
     */
    public void unsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGE$12, 0);
        }
    }
    
    /**
     * Gets array of all "titles" elements
     */
    public java.lang.String[] getTitlesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TITLES$14, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "titles" element
     */
    public java.lang.String getTitlesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLES$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "titles" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetTitlesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TITLES$14, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "titles" element
     */
    public org.apache.xmlbeans.XmlString xgetTitlesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLES$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "titles" element
     */
    public int sizeOfTitlesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLES$14);
        }
    }
    
    /**
     * Sets array of all "titles" element
     */
    public void setTitlesArray(java.lang.String[] titlesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(titlesArray, TITLES$14);
        }
    }
    
    /**
     * Sets ith "titles" element
     */
    public void setTitlesArray(int i, java.lang.String titles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLES$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(titles);
        }
    }
    
    /**
     * Sets (as xml) array of all "titles" element
     */
    public void xsetTitlesArray(org.apache.xmlbeans.XmlString[]titlesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(titlesArray, TITLES$14);
        }
    }
    
    /**
     * Sets (as xml) ith "titles" element
     */
    public void xsetTitlesArray(int i, org.apache.xmlbeans.XmlString titles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLES$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(titles);
        }
    }
    
    /**
     * Inserts the value as the ith "titles" element
     */
    public void insertTitles(int i, java.lang.String titles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TITLES$14, i);
            target.setStringValue(titles);
        }
    }
    
    /**
     * Appends the value as the last "titles" element
     */
    public void addTitles(java.lang.String titles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLES$14);
            target.setStringValue(titles);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "titles" element
     */
    public org.apache.xmlbeans.XmlString insertNewTitles(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TITLES$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "titles" element
     */
    public org.apache.xmlbeans.XmlString addNewTitles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLES$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "titles" element
     */
    public void removeTitles(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLES$14, i);
        }
    }
    
    /**
     * Gets the "country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$16) != 0;
        }
    }
    
    /**
     * Sets the "country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$16);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$16);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$16, 0);
        }
    }
    
    /**
     * Gets array of all "furtherCountries" elements
     */
    public java.lang.String[] getFurtherCountriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FURTHERCOUNTRIES$18, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "furtherCountries" element
     */
    public java.lang.String getFurtherCountriesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FURTHERCOUNTRIES$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "furtherCountries" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetFurtherCountriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FURTHERCOUNTRIES$18, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "furtherCountries" element
     */
    public org.apache.xmlbeans.XmlString xgetFurtherCountriesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FURTHERCOUNTRIES$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "furtherCountries" element
     */
    public int sizeOfFurtherCountriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FURTHERCOUNTRIES$18);
        }
    }
    
    /**
     * Sets array of all "furtherCountries" element
     */
    public void setFurtherCountriesArray(java.lang.String[] furtherCountriesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(furtherCountriesArray, FURTHERCOUNTRIES$18);
        }
    }
    
    /**
     * Sets ith "furtherCountries" element
     */
    public void setFurtherCountriesArray(int i, java.lang.String furtherCountries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FURTHERCOUNTRIES$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(furtherCountries);
        }
    }
    
    /**
     * Sets (as xml) array of all "furtherCountries" element
     */
    public void xsetFurtherCountriesArray(org.apache.xmlbeans.XmlString[]furtherCountriesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(furtherCountriesArray, FURTHERCOUNTRIES$18);
        }
    }
    
    /**
     * Sets (as xml) ith "furtherCountries" element
     */
    public void xsetFurtherCountriesArray(int i, org.apache.xmlbeans.XmlString furtherCountries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FURTHERCOUNTRIES$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(furtherCountries);
        }
    }
    
    /**
     * Inserts the value as the ith "furtherCountries" element
     */
    public void insertFurtherCountries(int i, java.lang.String furtherCountries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FURTHERCOUNTRIES$18, i);
            target.setStringValue(furtherCountries);
        }
    }
    
    /**
     * Appends the value as the last "furtherCountries" element
     */
    public void addFurtherCountries(java.lang.String furtherCountries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FURTHERCOUNTRIES$18);
            target.setStringValue(furtherCountries);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "furtherCountries" element
     */
    public org.apache.xmlbeans.XmlString insertNewFurtherCountries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FURTHERCOUNTRIES$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "furtherCountries" element
     */
    public org.apache.xmlbeans.XmlString addNewFurtherCountries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FURTHERCOUNTRIES$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "furtherCountries" element
     */
    public void removeFurtherCountries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FURTHERCOUNTRIES$18, i);
        }
    }
    
    /**
     * Gets array of all "birthplaces" elements
     */
    public java.lang.String[] getBirthplacesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BIRTHPLACES$20, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "birthplaces" element
     */
    public java.lang.String getBirthplacesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHPLACES$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "birthplaces" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetBirthplacesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BIRTHPLACES$20, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "birthplaces" element
     */
    public org.apache.xmlbeans.XmlString xgetBirthplacesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIRTHPLACES$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "birthplaces" element
     */
    public int sizeOfBirthplacesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHPLACES$20);
        }
    }
    
    /**
     * Sets array of all "birthplaces" element
     */
    public void setBirthplacesArray(java.lang.String[] birthplacesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(birthplacesArray, BIRTHPLACES$20);
        }
    }
    
    /**
     * Sets ith "birthplaces" element
     */
    public void setBirthplacesArray(int i, java.lang.String birthplaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHPLACES$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(birthplaces);
        }
    }
    
    /**
     * Sets (as xml) array of all "birthplaces" element
     */
    public void xsetBirthplacesArray(org.apache.xmlbeans.XmlString[]birthplacesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(birthplacesArray, BIRTHPLACES$20);
        }
    }
    
    /**
     * Sets (as xml) ith "birthplaces" element
     */
    public void xsetBirthplacesArray(int i, org.apache.xmlbeans.XmlString birthplaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIRTHPLACES$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(birthplaces);
        }
    }
    
    /**
     * Inserts the value as the ith "birthplaces" element
     */
    public void insertBirthplaces(int i, java.lang.String birthplaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BIRTHPLACES$20, i);
            target.setStringValue(birthplaces);
        }
    }
    
    /**
     * Appends the value as the last "birthplaces" element
     */
    public void addBirthplaces(java.lang.String birthplaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIRTHPLACES$20);
            target.setStringValue(birthplaces);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "birthplaces" element
     */
    public org.apache.xmlbeans.XmlString insertNewBirthplaces(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(BIRTHPLACES$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "birthplaces" element
     */
    public org.apache.xmlbeans.XmlString addNewBirthplaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BIRTHPLACES$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "birthplaces" element
     */
    public void removeBirthplaces(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHPLACES$20, i);
        }
    }
    
    /**
     * Gets array of all "passportsOrIds" elements
     */
    public java.lang.String[] getPassportsOrIdsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PASSPORTSORIDS$22, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "passportsOrIds" element
     */
    public java.lang.String getPassportsOrIdsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSPORTSORIDS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "passportsOrIds" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetPassportsOrIdsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PASSPORTSORIDS$22, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "passportsOrIds" element
     */
    public org.apache.xmlbeans.XmlString xgetPassportsOrIdsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSPORTSORIDS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "passportsOrIds" element
     */
    public int sizeOfPassportsOrIdsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PASSPORTSORIDS$22);
        }
    }
    
    /**
     * Sets array of all "passportsOrIds" element
     */
    public void setPassportsOrIdsArray(java.lang.String[] passportsOrIdsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(passportsOrIdsArray, PASSPORTSORIDS$22);
        }
    }
    
    /**
     * Sets ith "passportsOrIds" element
     */
    public void setPassportsOrIdsArray(int i, java.lang.String passportsOrIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSPORTSORIDS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(passportsOrIds);
        }
    }
    
    /**
     * Sets (as xml) array of all "passportsOrIds" element
     */
    public void xsetPassportsOrIdsArray(org.apache.xmlbeans.XmlString[]passportsOrIdsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(passportsOrIdsArray, PASSPORTSORIDS$22);
        }
    }
    
    /**
     * Sets (as xml) ith "passportsOrIds" element
     */
    public void xsetPassportsOrIdsArray(int i, org.apache.xmlbeans.XmlString passportsOrIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSPORTSORIDS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(passportsOrIds);
        }
    }
    
    /**
     * Inserts the value as the ith "passportsOrIds" element
     */
    public void insertPassportsOrIds(int i, java.lang.String passportsOrIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PASSPORTSORIDS$22, i);
            target.setStringValue(passportsOrIds);
        }
    }
    
    /**
     * Appends the value as the last "passportsOrIds" element
     */
    public void addPassportsOrIds(java.lang.String passportsOrIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSPORTSORIDS$22);
            target.setStringValue(passportsOrIds);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "passportsOrIds" element
     */
    public org.apache.xmlbeans.XmlString insertNewPassportsOrIds(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PASSPORTSORIDS$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "passportsOrIds" element
     */
    public org.apache.xmlbeans.XmlString addNewPassportsOrIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSPORTSORIDS$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "passportsOrIds" element
     */
    public void removePassportsOrIds(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PASSPORTSORIDS$22, i);
        }
    }
    
    /**
     * Gets array of all "knownAddresses" elements
     */
    public java.lang.String[] getKnownAddressesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KNOWNADDRESSES$24, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "knownAddresses" element
     */
    public java.lang.String getKnownAddressesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KNOWNADDRESSES$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "knownAddresses" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetKnownAddressesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KNOWNADDRESSES$24, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "knownAddresses" element
     */
    public org.apache.xmlbeans.XmlString xgetKnownAddressesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KNOWNADDRESSES$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "knownAddresses" element
     */
    public int sizeOfKnownAddressesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KNOWNADDRESSES$24);
        }
    }
    
    /**
     * Sets array of all "knownAddresses" element
     */
    public void setKnownAddressesArray(java.lang.String[] knownAddressesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(knownAddressesArray, KNOWNADDRESSES$24);
        }
    }
    
    /**
     * Sets ith "knownAddresses" element
     */
    public void setKnownAddressesArray(int i, java.lang.String knownAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KNOWNADDRESSES$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(knownAddresses);
        }
    }
    
    /**
     * Sets (as xml) array of all "knownAddresses" element
     */
    public void xsetKnownAddressesArray(org.apache.xmlbeans.XmlString[]knownAddressesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(knownAddressesArray, KNOWNADDRESSES$24);
        }
    }
    
    /**
     * Sets (as xml) ith "knownAddresses" element
     */
    public void xsetKnownAddressesArray(int i, org.apache.xmlbeans.XmlString knownAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KNOWNADDRESSES$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(knownAddresses);
        }
    }
    
    /**
     * Inserts the value as the ith "knownAddresses" element
     */
    public void insertKnownAddresses(int i, java.lang.String knownAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KNOWNADDRESSES$24, i);
            target.setStringValue(knownAddresses);
        }
    }
    
    /**
     * Appends the value as the last "knownAddresses" element
     */
    public void addKnownAddresses(java.lang.String knownAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KNOWNADDRESSES$24);
            target.setStringValue(knownAddresses);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "knownAddresses" element
     */
    public org.apache.xmlbeans.XmlString insertNewKnownAddresses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KNOWNADDRESSES$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "knownAddresses" element
     */
    public org.apache.xmlbeans.XmlString addNewKnownAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KNOWNADDRESSES$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "knownAddresses" element
     */
    public void removeKnownAddresses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KNOWNADDRESSES$24, i);
        }
    }
    
    /**
     * Gets array of all "keywords" elements
     */
    public java.lang.String[] getKeywordsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYWORDS$26, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "keywords" element
     */
    public java.lang.String getKeywordsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "keywords" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetKeywordsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYWORDS$26, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "keywords" element
     */
    public org.apache.xmlbeans.XmlString xgetKeywordsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "keywords" element
     */
    public int sizeOfKeywordsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORDS$26);
        }
    }
    
    /**
     * Sets array of all "keywords" element
     */
    public void setKeywordsArray(java.lang.String[] keywordsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keywordsArray, KEYWORDS$26);
        }
    }
    
    /**
     * Sets ith "keywords" element
     */
    public void setKeywordsArray(int i, java.lang.String keywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(keywords);
        }
    }
    
    /**
     * Sets (as xml) array of all "keywords" element
     */
    public void xsetKeywordsArray(org.apache.xmlbeans.XmlString[]keywordsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keywordsArray, KEYWORDS$26);
        }
    }
    
    /**
     * Sets (as xml) ith "keywords" element
     */
    public void xsetKeywordsArray(int i, org.apache.xmlbeans.XmlString keywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keywords);
        }
    }
    
    /**
     * Inserts the value as the ith "keywords" element
     */
    public void insertKeywords(int i, java.lang.String keywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYWORDS$26, i);
            target.setStringValue(keywords);
        }
    }
    
    /**
     * Appends the value as the last "keywords" element
     */
    public void addKeywords(java.lang.String keywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDS$26);
            target.setStringValue(keywords);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "keywords" element
     */
    public org.apache.xmlbeans.XmlString insertNewKeywords(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYWORDS$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "keywords" element
     */
    public org.apache.xmlbeans.XmlString addNewKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORDS$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "keywords" element
     */
    public void removeKeywords(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORDS$26, i);
        }
    }
    
    /**
     * Gets array of all "additionalInformations" elements
     */
    public java.lang.String[] getAdditionalInformationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALINFORMATIONS$28, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "additionalInformations" element
     */
    public java.lang.String getAdditionalInformationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALINFORMATIONS$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "additionalInformations" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetAdditionalInformationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALINFORMATIONS$28, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "additionalInformations" element
     */
    public org.apache.xmlbeans.XmlString xgetAdditionalInformationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALINFORMATIONS$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additionalInformations" element
     */
    public int sizeOfAdditionalInformationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALINFORMATIONS$28);
        }
    }
    
    /**
     * Sets array of all "additionalInformations" element
     */
    public void setAdditionalInformationsArray(java.lang.String[] additionalInformationsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(additionalInformationsArray, ADDITIONALINFORMATIONS$28);
        }
    }
    
    /**
     * Sets ith "additionalInformations" element
     */
    public void setAdditionalInformationsArray(int i, java.lang.String additionalInformations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALINFORMATIONS$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(additionalInformations);
        }
    }
    
    /**
     * Sets (as xml) array of all "additionalInformations" element
     */
    public void xsetAdditionalInformationsArray(org.apache.xmlbeans.XmlString[]additionalInformationsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(additionalInformationsArray, ADDITIONALINFORMATIONS$28);
        }
    }
    
    /**
     * Sets (as xml) ith "additionalInformations" element
     */
    public void xsetAdditionalInformationsArray(int i, org.apache.xmlbeans.XmlString additionalInformations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALINFORMATIONS$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additionalInformations);
        }
    }
    
    /**
     * Inserts the value as the ith "additionalInformations" element
     */
    public void insertAdditionalInformations(int i, java.lang.String additionalInformations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ADDITIONALINFORMATIONS$28, i);
            target.setStringValue(additionalInformations);
        }
    }
    
    /**
     * Appends the value as the last "additionalInformations" element
     */
    public void addAdditionalInformations(java.lang.String additionalInformations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALINFORMATIONS$28);
            target.setStringValue(additionalInformations);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalInformations" element
     */
    public org.apache.xmlbeans.XmlString insertNewAdditionalInformations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ADDITIONALINFORMATIONS$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalInformations" element
     */
    public org.apache.xmlbeans.XmlString addNewAdditionalInformations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONALINFORMATIONS$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "additionalInformations" element
     */
    public void removeAdditionalInformations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALINFORMATIONS$28, i);
        }
    }
}
