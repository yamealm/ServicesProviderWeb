package com.alodiga.services.provider.commons.utils;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
 
public class Encrypter
{
	private Cipher ecipher;
	private Cipher dcipher;
	private static Encrypter encrypter;

	
	
	public static synchronized Encrypter getInstance()
	{
		if(encrypter==null)
			encrypter = new Encrypter();
		return encrypter;
	}
	
	private Encrypter()
	{
		byte[] raw = {-33, -102, -3, 64, -110, -17, 17, -37, -17, -71, 105, -25, 16, -82, -52, 74};

		SecretKeySpec key = new SecretKeySpec(raw, "AES");
		
		// Create an 8-byte initialization vector
		byte[] iv = new byte[]
		{
			0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f
		};
		
		AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
		try
		{
			ecipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			dcipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			
			// CBC requires an initialization vector
			ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
			dcipher.init(Cipher.DECRYPT_MODE, key, paramSpec);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public byte[] encrypt(byte[] inpBytes) throws Exception 
	{
		return ecipher.doFinal(inpBytes);
	}

	public byte[] decrypt(byte[] inpBytes) throws Exception 
	{
	    return dcipher.doFinal(inpBytes);
	}
		  
	public void encrypt(InputStream in, OutputStream out)
	{
		try
		{
			// Bytes written to out will be encrypted
			out = new CipherOutputStream(out, ecipher);
			
			// Read in the cleartext bytes and write to out to encrypt
			int numRead = 0;
			byte[] buf = new byte[1024];
			while ((numRead = in.read(buf)) >= 0)
			{
				out.write(buf, 0, numRead);
			}
			out.close();
		}
		catch (java.io.IOException e)
		{
		}
	}
	
	public void decrypt(InputStream in, OutputStream out)
	{
		try
		{
			// Bytes read from in will be decrypted
			in = new CipherInputStream(in, dcipher);
			
			// Read in the decrypted bytes and write the cleartext to out
			int numRead = 0;
			byte[] buf = new byte[1024];
			while ((numRead = in.read(buf)) >= 0)
			{
				out.write(buf, 0, numRead);
			}
			out.close();
		}
		catch (java.io.IOException e)
		{
		}
	}
	/*
	public static void main(String args[])
	{
		try
		{
			// Generate a temporary key. In practice, you would save this key.
			// See also e464 Encrypting with DES Using a Pass Phrase.
			
			//KeyGenerator	kgen	=	KeyGenerator.getInstance("AES");
			//SecretKey key			=	kgen.generateKey();
			
			// Create encrypter/decrypter class
			Connection connection = getConnection();
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM creditcard WHERE id=21");
			String number = "";
			byte[] fromDB = null;
			while (resultSet.next()) {
				number = resultSet.getString("number");
				fromDB = resultSet.getBytes("number");
				System.out.println("DB="+number);
				
			}
			Encrypter encrypter = new Encrypter();
		
			String charset = "UTF-8";
			String plainText = "5433-3333-3333-3333";
			//encriptado y guardado [50, 87, 57, 63, 63, 63, 11, 108, 63, 63, 63, 99, 63, 47, 63, 63, 114, 86, 81, 63, 93, 42, 95, 74, 63, 86, 45, 25]
			//encriptado            [50, 87, 57, -12, -5, -30, -87, 11, 108, -60, -79, -20, -47, 99, -20, -82, -66, 47, -99, -67, 114, 86, 81, -34, 93, 42, 95, 74, -98, 86, 45, 25]
			
			System.out.println("Plain text="+plainText);
			byte[] bytes = plainText.getBytes(charset);
			byte[] encryptedBytes = encrypter.encrypt(bytes);
			
			System.out.println("Encrypted="+new String(encryptedBytes,charset));
			
			byte[] decryptedBytes = encrypter.decrypt(encryptedBytes);
			System.out.println("Decrypted="+new String(decryptedBytes,charset));

			decryptedBytes = encrypter.decrypt(fromDB);
			System.out.println("Decrypted="+new String(decryptedBytes,charset));

			
			// Encrypt
			encrypter.encrypt(new FileInputStream("/root/Desktop/prueba.txt"),new FileOutputStream("/root/Desktop/Encrypted.txt"));
			// Decrypt
			encrypter.decrypt(new FileInputStream("/root/Desktop/Encrypted.txt"),new FileOutputStream("/root/Desktop/Decrypted.txt"));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection connection = null;
		//String url = "jdbc:mysql://192.168.3.25:3306/SG123";//
		String url = "jdbc:mysql://localhost:3306/plv";//
		//String user = "cdr";
		String user = "root";
		//String pass = "123c0mv3";
		String pass = "";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	 */
}