package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		Calc add1=new Calc() {

			public double execute(double num1, double num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
			
			//줄임표현
		Calc add2= (num1,num2)->{
			return num1+num2;
		};
		
		Calc add= (num1,num2)->num1+num2;
		Calc sub= (num1,num2)->num1-num2;
		Calc mul= (num1,num2)->num1*num2;
		
		double result1=add.execute(10, 20);
		double result2=sub.execute(10, 20);
		double result3=mul.execute(10, 20);
		
		System.out.println(result1+"||"+result2+"||"+result3);
	} 
}
