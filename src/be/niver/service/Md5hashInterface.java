package be.niver.service;

import java.security.NoSuchAlgorithmException;

public interface Md5hashInterface {
	public String getMd5(String password)  throws NoSuchAlgorithmException;
}
