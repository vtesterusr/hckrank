/*
We use the integers , , and  to create the following series:
(a+(2^0)*b), (a+(2^0)*b+(2^1)*b), (a+(2^0)*b+(2^1)*b+(2^2)*b),.......,(a+(2^0)*b+(2^1)*b+(2^2)*b+............+(2^(n-1))*b)
You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.
Input Format
The first line contains an integer, , denoting the number of queries. 
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.
Constraints
0 <= q <=500
0 <= a,b <=50
1 <= n <=15

Output Format
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
Sample Input
2
0 2 10
5 3 5
Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Explanation
We have two queries:
We use a=0,b=2 and n=10 to produce some series S0, S1, s2,....Sn-1:
S0=0+1*2=2
S1=0+1*2+2*2=6
... and so on.
Once we hit , we print the first ten terms as a single line of space-separated integers.
We use , , and  to produce some series :

We then print each element of our series as a single line of space-separated values.

*/


import java.util.*;
import java.io.*;
import java.math.*;

class TwoEquationCode{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        //System.out.print(t);
        int two=2;
        /* 
        code for square of 2
        for(int i=0; i<11; i++){
            //System.out.println(aa+" x "+i+" = "+Math.pow(two, i));
        }
        */
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            //System.out.println("a:"+a+" b:"+" n:"+n);
            for(int j=1;j<=n;j++){
                int add=0;
                for(int k=0; k<j;k++){
                    Double d=Math.pow(two, k);
                    add=add+(b*d.intValue());
                }
                System.out.print((a+add));
                System.out.print(" ");
            }
            System.out.println("");
        }
        in.close();
    }
    
}
