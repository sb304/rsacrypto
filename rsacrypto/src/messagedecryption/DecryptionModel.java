package messagedecryption;

import java.math.BigInteger;

public class DecryptionModel {

	private DecryptionView myView; 
	private BigInteger myMessage; 
	
	public DecryptionModel(){
		myView = new DecryptionView(this); 
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
		myMessage = new BigInteger(s); 
		myView.keyView();
	}
	
	public void decrypt(String exp, String num){
		BigInteger e = new BigInteger(exp);
		BigInteger n = new BigInteger(num);
		BigInteger decrypted = myMessage.modPow(e, n);
		String output = convertInttoString(decrypted);
		myView.pop(output);
		
	}
	
	private String convertInttoString(BigInteger big){
		byte[] iter = big.toByteArray();
		String output = "";
		for (int i=0; i<iter.length; i++){
			Byte b = iter[i];
			char c = (char) b.intValue();
			output += c; 
		}
		return output;
	}
	
}
