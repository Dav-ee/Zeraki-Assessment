package com.zeraki.technologies;

public class Application {
	public static void main(String[] args) {
	// arrray K = [3,5,4,1]
int k[] = { 3, 5, 4, 1 };
				int missingInteger = MissingInteger(k, 4);
//				print out missing integer
			System.out.println( "The missing number from 1 to 5 is:[ " + missingInteger + " ] ");			
	}
	
		private static int MissingInteger(int[] k, int n) {
		// TODO Auto-generated method stub
			int i, value;
			value = (n + 1) * (n + 2) / 2;
			for (i = 0; i < n; i++)
				value -= k[i];
			return value;
	}


	}
