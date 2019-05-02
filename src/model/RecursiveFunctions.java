package model;

public class RecursiveFunctions {
	
	public int factorial(int number) {
		if (number == 1) {
			return number;
		}else{
			return number*factorial(number-1);
		}
	}
	
	public int fibonacci (int i) {
		if (i == 0) {
			return 0; 
		}else if(i == 1) {
			return 1;
		}else {
			return fibonacci(i-1)+fibonacci(i-2); 
		}
	}
	
	public int arraySummatory(int[]A, int n) {
		if(n == 0) {
			return A[0];
		}else {
			return A[n] + arraySummatory(A ,n-1);
		}
		
	}
	public RecursiveFunctions(){
	}
	

}
