package keygeneration;

import java.math.BigInteger;

public class PrivateKey extends Key{

	private BigInteger e; 
	
	public PrivateKey(BigInteger t, BigInteger n) {
		super(t, n);
	
	}

}
