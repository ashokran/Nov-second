package org.leo;

public class Task {

	public static void main(String[] args) {

		String a = "123AbcdBcds%&&";
         
		int u = 0;
		int c = 0;
		int d = 0;
		int h = 0;

		for (int i = 0; i < a.length(); i++) {
			char r = a.charAt(i);
	//	r=r+a.charAt(i);
			if (Character.isUpperCase(r)) {
				u++;

			} else if (Character.isLowerCase(r)) {
				c++;

			} else if (Character.isDigit(r)) {
				d++;

			} else {
				h++;
				System.out.println("QA work");
				System.out.println("work done by capsey");
			}
			System.out.println("Uppercase count :" + u);
			System.out.println("Lowercase count :" + c);
			System.out.println("Digits count :" + d);
			System.out.println("Special Charater count :" + h);
		}

	}

}
