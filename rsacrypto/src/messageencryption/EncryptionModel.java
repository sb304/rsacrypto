package messageencryption;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import keygeneration.Key;

public class EncryptionModel {

	private EncryptionView myView; 
	private BigInteger myMessage; 
	
	public EncryptionModel(){
		myView = new EncryptionView(this); 
	}
	
	public void initializeView(){
		myView.initialize(); 
	}
	
	public void setMessage(String s){
		System.out.println(s);
		byte[] arr = new byte[s.length()];
		for (int i=0; i<s.length(); i++){
			char c= s.charAt(i);
			Byte b = (byte) c;
			arr[i] = b;
		}
		myMessage = new BigInteger(arr); 
		myView.getKeyView(); 	
	}
	
	public void encrypt(String exp, String num){
		BigInteger e = new BigInteger(exp);
		BigInteger n = new BigInteger(num); 
		BigInteger encrypted = myMessage.modPow(e, n);
		String output = convertInttoString(encrypted);
		myView.pop(encrypted.toString());
	}
	
	private String convertInttoString(BigInteger big){
		byte[] iter = big.toByteArray();
		String output = "";
		for (int i=0; i<iter.length; i++){
			byte b = iter[i];
			char c = (char) b;
			output += c; 
		}
		System.out.println(output);
		return output;
	}
	
}
