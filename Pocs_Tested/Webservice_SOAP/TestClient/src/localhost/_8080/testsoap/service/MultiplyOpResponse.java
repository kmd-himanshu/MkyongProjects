
package localhost._8080.testsoap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multiplyOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "multiplyOut"
})
@XmlRootElement(name = "MultiplyOpResponse")
public class MultiplyOpResponse {

    @XmlElement(required = true)
    protected String multiplyOut;

    /**
     * Gets the value of the multiplyOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplyOut() {
        return multiplyOut;
    }

    /**
     * Sets the value of the multiplyOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplyOut(String value) {
        this.multiplyOut = value;
    }

}
