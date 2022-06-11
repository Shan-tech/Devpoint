package com.java.virtusa;

public class ChairsAndApples {

	public static void main(String[] args) {
		 int n = 4;
		    int c[][] = { {3, 2}, {5, 1}, {2, 10}, {5, 6} };
		    int a = 0, l = 0;
		    boolean run = true;
		    int res1 = 0, res2 = 0;
		    while (run)
		      {
			for (int i = 0; i < 4; i++)
			  {
			    for (int j = 0; j < 2 - 1; j++)
			      {
				if ((c[i][j + 1] + a) - c[i][j] < 0)
				  {
				    res1 = 0;
				    res2 = 0;
				    l = 0;
				    break;
				  }
				else
				  {
				    if (res1 == 0)
				      {
					res1 = i;
					res2 = j;
				      }
				    a = a + (c[i][j + 1] - c[i][j]);
				    l++;

				  }
				if (l == n)
				  {
				    run = false;
				    break;
				  }
				else if (l == 3)
				  {
				    i = -1;
				    break;
				  }
			      }
			    if (run == false)
			      break;

			  }
		      }
		    System.out.println (c[res1][res2] + "," + c[res1][res2 + 1]);
		  }
		}
