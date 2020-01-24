/*
 * XML Type:  AddressMatchResult
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML AddressMatchResult(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class AddressMatchResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult
{
    private static final long serialVersionUID = 1L;
    
    public AddressMatchResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSMATCHRESULTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "addressMatchResultType");
    private static final javax.xml.namespace.QName LOCATIONIDENTIFICATION$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "locationIdentification");
    private static final javax.xml.namespace.QName NAMEHINT$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "nameHint");
    private static final javax.xml.namespace.QName FOUNDADDRESS$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "foundAddress");
    private static final javax.xml.namespace.QName CANDIDATES$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "candidates");
    private static final javax.xml.namespace.QName CHARACTER$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "character");
    
    
    /**
     * Gets the "addressMatchResultType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType.Enum getAddressMatchResultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSMATCHRESULTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "addressMatchResultType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType xgetAddressMatchResultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType)get_store().find_element_user(ADDRESSMATCHRESULTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addressMatchResultType" element
     */
    public void setAddressMatchResultType(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType.Enum addressMatchResultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSMATCHRESULTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSMATCHRESULTTYPE$0);
            }
            target.setEnumValue(addressMatchResultType);
        }
    }
    
    /**
     * Sets (as xml) the "addressMatchResultType" element
     */
    public void xsetAddressMatchResultType(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType addressMatchResultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType)get_store().find_element_user(ADDRESSMATCHRESULTTYPE$0, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType)get_store().add_element_user(ADDRESSMATCHRESULTTYPE$0);
            }
            target.set(addressMatchResultType);
        }
    }
    
    /**
     * Gets the "locationIdentification" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification getLocationIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification)get_store().find_element_user(LOCATIONIDENTIFICATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "locationIdentification" element
     */
    public boolean isSetLocationIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONIDENTIFICATION$2) != 0;
        }
    }
    
    /**
     * Sets the "locationIdentification" element
     */
    public void setLocationIdentification(ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification locationIdentification)
    {
        generatedSetterHelperImpl(locationIdentification, LOCATIONIDENTIFICATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locationIdentification" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification addNewLocationIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification)get_store().add_element_user(LOCATIONIDENTIFICATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "locationIdentification" element
     */
    public void unsetLocationIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONIDENTIFICATION$2, 0);
        }
    }
    
    /**
     * Gets the "nameHint" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint.Enum getNameHint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEHINT$4, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "nameHint" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint xgetNameHint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint)get_store().find_element_user(NAMEHINT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "nameHint" element
     */
    public boolean isSetNameHint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEHINT$4) != 0;
        }
    }
    
    /**
     * Sets the "nameHint" element
     */
    public void setNameHint(ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint.Enum nameHint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEHINT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMEHINT$4);
            }
            target.setEnumValue(nameHint);
        }
    }
    
    /**
     * Sets (as xml) the "nameHint" element
     */
    public void xsetNameHint(ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint nameHint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint)get_store().find_element_user(NAMEHINT$4, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint)get_store().add_element_user(NAMEHINT$4);
            }
            target.set(nameHint);
        }
    }
    
    /**
     * Unsets the "nameHint" element
     */
    public void unsetNameHint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEHINT$4, 0);
        }
    }
    
    /**
     * Gets the "foundAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress getFoundAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress)get_store().find_element_user(FOUNDADDRESS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "foundAddress" element
     */
    public boolean isSetFoundAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOUNDADDRESS$6) != 0;
        }
    }
    
    /**
     * Sets the "foundAddress" element
     */
    public void setFoundAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress foundAddress)
    {
        generatedSetterHelperImpl(foundAddress, FOUNDADDRESS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "foundAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress addNewFoundAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress)get_store().add_element_user(FOUNDADDRESS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "foundAddress" element
     */
    public void unsetFoundAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOUNDADDRESS$6, 0);
        }
    }
    
    /**
     * Gets array of all "candidates" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate[] getCandidatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CANDIDATES$8, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "candidates" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate getCandidatesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate)get_store().find_element_user(CANDIDATES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "candidates" element
     */
    public int sizeOfCandidatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANDIDATES$8);
        }
    }
    
    /**
     * Sets array of all "candidates" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCandidatesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate[] candidatesArray)
    {
        check_orphaned();
        arraySetterHelper(candidatesArray, CANDIDATES$8);
    }
    
    /**
     * Sets ith "candidates" element
     */
    public void setCandidatesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate candidates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate)get_store().find_element_user(CANDIDATES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(candidates);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "candidates" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate insertNewCandidates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate)get_store().insert_element_user(CANDIDATES$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "candidates" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate addNewCandidates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate)get_store().add_element_user(CANDIDATES$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "candidates" element
     */
    public void removeCandidates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANDIDATES$8, i);
        }
    }
    
    /**
     * Gets the "character" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType.Enum getCharacter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARACTER$10, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "character" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType xgetCharacter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType)get_store().find_element_user(CHARACTER$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "character" element
     */
    public boolean isSetCharacter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTER$10) != 0;
        }
    }
    
    /**
     * Sets the "character" element
     */
    public void setCharacter(ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType.Enum character)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARACTER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARACTER$10);
            }
            target.setEnumValue(character);
        }
    }
    
    /**
     * Sets (as xml) the "character" element
     */
    public void xsetCharacter(ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType character)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType)get_store().find_element_user(CHARACTER$10, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType)get_store().add_element_user(CHARACTER$10);
            }
            target.set(character);
        }
    }
    
    /**
     * Unsets the "character" element
     */
    public void unsetCharacter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTER$10, 0);
        }
    }
}
