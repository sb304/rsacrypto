package keygeneration;

import java.math.BigInteger;
import java.util.Random;

public class KeyGenerator {

	private BigInteger myFirstPrime; 
	private BigInteger mySecondPrime; 
	private BigInteger number; 
	private BigInteger totientN; 
	private Random myRandom; 
	
	public KeyGenerator(){
		myRandom = new Random();
	}
	
	public void generateKeyPair(){
		myFirstPrime = new BigInteger(1024, 100, myRandom);
		mySecondPrime = new BigInteger(1024, 100, myRandom);
		number = myFirstPrime.multiply(mySecondPrime);
		totientN = (myFirstPrime.subtract(BigInteger.ONE)).multiply(mySecondPrime.subtract(BigInteger.ONE));
		KeyPair kp = new KeyPair(totientN, number);
		
	}
	
}
