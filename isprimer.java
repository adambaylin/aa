package thuatToanQuayLui;

import java.math.BigInteger;
import java.util.LinkedList;

import javax.sound.midi.Soundbank;

public class Isprimer extends Thread{
	static BigInteger n = BigInteger.valueOf(1000);
	static BigInteger two = BigInteger.valueOf(2);
	public static LinkedList<BigInteger> fs= new LinkedList<BigInteger>();
	public static synchronized BigInteger getN() {
		if(fs.size()!=0  && n.mod(getFs()).equals(BigInteger.ZERO)) {
			n=n.divide(getFs());
			System.out.println("so n" + n);
		}
		return n;
	}
	public static synchronized BigInteger getFs() {
		BigInteger a = fs.getFirst();
		return a;
	}
	public void run() {
		if(n.compareTo(two)<0) {
			throw new IllegalArgumentException("must be greater than one");
		}
		while(getN().mod(two).equals(BigInteger.ZERO)) {
			fs.add(two);
		}
		if(getN().compareTo(BigInteger.ONE)>0) {
			BigInteger f = BigInteger.valueOf(3);
			while (f.multiply(f).compareTo(getN())<=0) {
				if(getN().mod(f).equals(BigInteger.ZERO)) {
					fs.add(f);
					System.out.println(getN());
				}
				else {
					f = f.add(two);
				}
				
			}
		}
	}
}
