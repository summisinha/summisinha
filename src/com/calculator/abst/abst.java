package com.calculator.abst;

class CalculatorImpl implements Calculator1,Calculator2{

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
	}

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}
	
}
public class abst {
	public static void main(String[] args) {
	CalculatorImpl imp= new CalculatorImpl();
	imp.sum(40,30);
	imp.sub(40,30);
	imp.mul(40,30);
	imp.div(40,30);
	}

}
