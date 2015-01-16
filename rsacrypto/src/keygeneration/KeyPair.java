package keygeneration;

import java.math.BigInteger;

public class KeyPair {

	private PrivateKey myPrivateKey;
	private PublicKey myPublicKey; 
	private BigInteger totient; 
	private BigInteger number;
	
	public KeyPair(BigInteger t, BigInteger n){
		totient = t; 
		number = n; 
		myPublicKey = new PublicKey(totient, number);
		
		
	}
	
	private static void generatePublicKey(BigInteger t){
		
	}
	
}
