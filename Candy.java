package one.two.three;

public class Candy {

	private int c;
	private int n;

	public Candy() {
	};

	public int getN() {
		return n;
	}

	public int getC() {
		return c;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double canGetCandy(int a, int b) {
		n = a / b;
		return n;
	}

	public double leftCandy(int a, int b) {
		c = a % b;
		return c;
	}
}
