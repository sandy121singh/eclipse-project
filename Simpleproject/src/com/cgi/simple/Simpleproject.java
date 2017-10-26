package com.cgi.simple;
import java.util.Random;

public class Simpleproject {

		public static void main(String[] args) {
			
			System.out.print("Generated Token=");
			System.out.println(gentoken());

		}

		
		private static double gentoken()
		{
			return new Random().nextGaussian();
		}


}
