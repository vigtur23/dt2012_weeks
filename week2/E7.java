/*
  The program prints all triplets (x, y, z) of intgers
  such that
         1 <= x <= y <= z <= N
              and
          x*x + y*y = z*z
*/

import java.lang.Math;

public class E7{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int z = 1; z <= n; z++)
		{
			for (int y = 1; y <= z; y++)
			{
				for (int x = 1; x <= y; x++)
				{
					if (x*x + y*y == z*z)
					{
						System.out.println("(" + x + ", " + y + ", " + z + ")");
					}
				}
			}
		}
		System.out.println("And that was all!");
	}
}
