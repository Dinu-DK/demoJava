import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Hello {

	/*
	 * Complete the 'winner' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. STRING erica 2. STRING bob
	 */

	public static String winner(String erica, String bob) {
		// Write your code here
		 Character point1 = new Character('E');
	        Character point2 = new Character('M');
	        Character point3 = new Character('H');

	        int ericaTotal = 0;
	        int bobTotal = 0;
	        for (int i = 0; i < 3; i++) {
	            char c = erica.charAt(i);
	            boolean p1 = point1.equals(c);
	            boolean p2 = point2.equals(c);
	            boolean p3 = point3.equals(c);
	            if (p1) {
	                ericaTotal = ericaTotal + 1;
	            }
	            if (p2) {
	                ericaTotal = ericaTotal + 3;
	            }
	            if (p3) {
	                ericaTotal = ericaTotal + 5;
	            }
	        }

	        for (int i = 0; i < 3; i++) {
	            char c = bob.charAt(i);
	            boolean p1 = point1.equals(c);
	            boolean p2 = point2.equals(c);
	            boolean p3 = point3.equals(c);
	            if (p1) {
	                bobTotal = bobTotal + 1;
	            }
	            if (p2) {
	                bobTotal = bobTotal + 3;
	            }
	            if (p3) {
	                bobTotal = bobTotal + 5;
	            }
	        }

	        if (bobTotal < ericaTotal) {
	            return "Erica";

	        } else if (bobTotal == ericaTotal) {
	            return "Tie";
	        } else {
	            return "Bob";
	        }
	    }

}

class test1 {
	public static void main(String[] args) {

		Hello h = new Hello();
		String result = h.winner("EHH", "EME");
		System.out.println(result);
	}
}