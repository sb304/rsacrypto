package keygeneration;

import java.math.BigInteger;

public abstract class Key {

	protected BigInteger number; 
	protected BigInteger totient; 
	protected BigInteger exponent; 

	
	public Key(BigInteger t, BigInteger n){
		totient = t; 
		number = n; 
	}
	 
	public BigInteger getExponent(){
		return exponent; 
	}
	
	protected abstract void findExponent();
}
