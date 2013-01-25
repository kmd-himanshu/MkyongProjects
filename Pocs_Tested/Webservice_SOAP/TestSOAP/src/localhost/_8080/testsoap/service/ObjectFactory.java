
package localhost._8080.testsoap.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost._8080.testsoap.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost._8080.testsoap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOpRequest }
     * 
     */
    public AddOpRequest createAddOpRequest() {
        return new AddOpRequest();
    }

    /**
     * Create an instance of {@link MultiplyOpResponse }
     * 
     */
    public MultiplyOpResponse createMultiplyOpResponse() {
        return new MultiplyOpResponse();
    }

    /**
     * Create an instance of {@link MultiplyOpRequest }
     * 
     */
    public MultiplyOpRequest createMultiplyOpRequest() {
        return new MultiplyOpRequest();
    }

    /**
     * Create an instance of {@link AddOpResponse }
     * 
     */
    public AddOpResponse createAddOpResponse() {
        return new AddOpResponse();
    }

}
