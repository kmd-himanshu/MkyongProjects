/*
 * 
*/
package org.impetus.TCMS.common.db;
import java.io.Serializable;

import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

/**
 * This class is used to Generate the Unique numbers
 */
public class IdGenerator implements IdentifierGenerator{
    
    public IdGenerator() {        
    }
    
    public Serializable generate(SessionImplementor session, Object object) {
        return UUIDGenerator.generateUUID();
    }
}
