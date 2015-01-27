package messageencryption;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class EncryptionModel {

	private EncryptionView myView; 
	
	public EncryptionModel(){
		myView = new EncryptionView(this); 
	}
	
	public void initializeView(){
		myView.initialize(); 
	}
	
	public BigInteger encrypt(String s){
		byte[] arr = new byte[s.length()];
		for (int i=0; i<s.length(); i++){
			char c= s.charAt(i);
			Byte b = (byte) c;
			arr[i] = b;
		}
		System.out.println(s);
		return new BigInteger(arr);
		
	}
}
