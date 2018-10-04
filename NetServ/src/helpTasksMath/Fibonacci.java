package helpTasksMath;

import java.math.BigInteger;

public class Fibonacci implements  Type  {

	int n;
	
	public Fibonacci(String n) {
		// TODO Auto-generated constructor stub
		this.n= Integer.parseInt(n);
	}
	
	@Override
	public void getTask() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String calculate() {
		BigInteger prepre = new BigInteger("0");
		BigInteger pre = new BigInteger("1");
		BigInteger out = new BigInteger("1");

		if (n >= 2) {
			for (int i = 3; i <= n; i++) {
				prepre = pre;
				pre = out;
				out = prepre.add(pre);
			}
		}
		return out.toString();
	}

	@Override
	public String resault() {
		// TODO Auto-generated method stub
		return calculate();
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		getTask();
		calculate();
		System.out.println(calculate());
	}

}
