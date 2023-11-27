package com;

public class Calculatorimp implements Calculator { //-step 2-------

	public int add(int x, int y) {                   //--------step3 method overriding-------
		return x+y;
	}

	public int sub(int x, int y) {
		return x-y;
	}

	public int mul(int x, int y) {
		return x*y;
	}

	public int div(int x, int y) {
		if(y!=0) {
			return x/y;
		}
		return -1;
	}

	public String displayErrorMessage() {
		return "Invalid Choice";
	}

}
