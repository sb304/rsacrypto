package keygeneration;

import java.math.BigInteger;

public class PrivateKey extends Key{

	private PublicKey myPublicKey; 
	
	public PrivateKey(BigInteger t, BigInteger n, PublicKey key) {
		super(t, n);
		myPublicKey = key; 
		findExponent(); 
		
	
	}

	@Override
	protected void findExponent() {
		exponent = myPublicKey.getExponent().modInverse(totient);
	}
	
	public void print(){
		System.out.println(exponent);
		
	}

}
