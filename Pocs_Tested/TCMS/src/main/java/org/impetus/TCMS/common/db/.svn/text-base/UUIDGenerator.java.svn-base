/*
 * 
 */
package org.impetus.TCMS.common.db;
import java.net.InetAddress;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;

/**
 * A utility class to generate 32 byte long UUID.
 * Didn't make use Java's UUID class as by default its toString(0 representation 
 * puts '-' as a separator between different uuid sections. We may end up using this 
 * later when we get more clarity on this class structure and assoicated algorithm  
 */  
public class UUIDGenerator {
    
    private static Logger logger = Logger.getLogger(UUIDGenerator.class);
    
    public static String generateUUID() {
        UUIDGenerator uuidGen = new UUIDGenerator();
        return uuidGen.getUUID();
    }
    
    private String getUUID() {
        String strRetVal = "";
        String strTemp = "";
        try {
            // Get IPAddress Segment
            InetAddress addr = InetAddress.getLocalHost();
            byte[] ipaddr = addr.getAddress();
            for (int i = 0; i < ipaddr.length; i++) {
                Byte b = new Byte(ipaddr[i]);
                strTemp = Integer.toHexString(b.intValue() & 0x000000ff);
                while (strTemp.length() < 2) {
                    strTemp = '0' + strTemp;
                }
                strRetVal += strTemp;
            }

            //Get CurrentTimeMillis() segment
            strTemp = Long.toHexString(System.currentTimeMillis());
            while (strTemp.length() < 12) {
                strTemp = '0' + strTemp;
            }
            strRetVal += strTemp;
          
            //Get Random Segment
            SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");

            strTemp = Integer.toHexString(prng.nextInt());
            while (strTemp.length() < 8) {
                strTemp = '0' + strTemp;
            }

            //strRetVal += strTemp.substring(4) + ':';
            strRetVal += strTemp.substring(4);

            //Get IdentityHash() segment
            strTemp = Long.toHexString(System.identityHashCode((Object) this));
            while (strTemp.length() < 8) {
                strTemp = '0' + strTemp;
            }
            strRetVal += strTemp;
        }
        catch (java.net.UnknownHostException ex) {
            logger.error("Unknown Host Exception Caught: " + ex.getMessage());
        }
        catch (java.security.NoSuchAlgorithmException ex) {
            logger.error("No Such Algorithm Exception Caught: " + ex.getMessage());
        }
        return strRetVal.toUpperCase();
    }
    
    public static String generatePassword() {
    	String password = "";
    	
    	//Get CurrentTimeMillis() segment
    	password = Long.toHexString(System.currentTimeMillis());
              
        password += new RandomStringUtils().randomAlphanumeric(6);
              
    	return password.toUpperCase();
    }
}