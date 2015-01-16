package keygeneration;

import java.math.BigInteger;

public abstract class Key {

	protected BigInteger number; 
	protected BigInteger totient; 
	
	public Key(BigInteger t, BigInteger n){
		totient = t; 
		number = n; 
	}
	 
}
