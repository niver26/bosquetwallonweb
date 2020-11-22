package be.niver.service;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5hash implements Md5hashInterface {
	
	@Override
	public String getMd5(String password) throws NoSuchAlgorithmException {
        // Get the algorithm:
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        // Calculate Message Digest as bytes:
        byte[] digest = md5.digest(password.getBytes(Charset.forName("UTF8")));
        // Convert to 32-char long String:
        return String.format("%032x%n", new BigInteger(1, digest));
    }
}
