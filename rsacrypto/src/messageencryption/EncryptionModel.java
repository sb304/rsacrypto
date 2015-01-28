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
		System.out.println(1);
		BigInteger encrypted = myMessage.modPow(e, n);
		myView.pop(encrypted.toString());
	}
	
}
