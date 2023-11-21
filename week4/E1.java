/*
Logistic function
https://en.wikipedia.org/wiki/Logistic_function

The logistic function is defined by 
     f(x) = L / (1 + e^(-k*(x-x0)))

for parameters 
      L: the supremum of the values of the function
      k: the logistic growth rate or steepness of the curve
      x0: the x value of the sigmoid's midpoint

Complete the  method below for logistic
and complete the program that takes real (double!) numbers L, k and x0 
and prints to standard output the values of logistic(L,k,x0,x) 
for all the values of x in the array x_values.
*/

import java.lang.Math;

public class E1{

	public static double logistic(double L, double k, double x0, double x){
		return L/(1 + Math.pow(Math.E, -k*(x - x0)));
	}


	public static void main(String[] args) {
		double param_L  = Double.parseDouble(args[0]);
		double param_k  = Double.parseDouble(args[1]);
		double param_x0 = Double.parseDouble(args[2]);

		double[] x_values = {-1.0, -0.9, -0.8, -0.7, -0.6, -0.5, -0.4, -0.3, -0.2, -0.1, 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9,1.0};


		for (int i = 0; i < x_values.length; i++)
		{
			System.out.println(logistic(param_L, param_k, param_x0, x_values[i]));
		}
	}

}
