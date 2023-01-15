package com.thread.coordination;

import java.math.BigInteger;

import com.thread.coordination.BaseToThePowerInterruption.LongComputationalTask;

//This program is example of thread Interruption, where
//we are calculating base to the power result.

public class BaseToThePowerInterruption {

	public static void main(String[] args) {
		Thread thread = new Thread
				(new LongComputationalTask(new BigInteger("20000"),new BigInteger("1000000")));
		thread.start();
		thread.interrupt();
		
	}
	public static class LongComputationalTask implements Runnable{

		private BigInteger base;
		private BigInteger power;
		
		public LongComputationalTask(BigInteger base,BigInteger power) {
			this.base = base;
			this.power = power;
		}

		@Override
		public void run() {
			System.out.println(base +"^" +power+" = " + pow(base,power));
		}

		private BigInteger pow(BigInteger base, BigInteger power) {
			BigInteger result = BigInteger.ONE;
			
			for(BigInteger i = BigInteger.ZERO; i.compareTo(power) !=0; i = i.add(BigInteger.ONE)) {
				if(Thread.currentThread().isInterrupted()) {
					System.out.println("Prematuraly Interrupted Computation");
					return BigInteger.ZERO;
				}
				result = result.multiply(base);
			}
 			return result;
		}
		
		
	}
}
