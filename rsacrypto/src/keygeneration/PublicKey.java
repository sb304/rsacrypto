package keygeneration;

import java.math.BigInteger;

public class PublicKey extends Key{

	private BigInteger d; 
	private BigInteger e; 
	
	public PublicKey(BigInteger totient, BigInteger number) {
		super(totient, number);
		findE(); 
	}
	
	private void findE(){
		e = new BigInteger("65537");
	}

}
