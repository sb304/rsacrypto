package keygeneration;

import java.math.BigInteger;

public class PublicKey extends Key{

	
	public PublicKey(BigInteger totient, BigInteger number) {
		super(totient, number);
		findExponent(); 
	}
	
	@Override
	protected void findExponent(){
		exponent = new BigInteger("65537");
		while (totient.remainder(exponent)==BigInteger.ZERO){
			exponent.nextProbablePrime();
		}
	}
	
	public void print(){
		System.out.println(exponent);
	}
	

}
