import java.util.Scanner;

class Main{
    
     public static long fib(long n){
       long  f[] = new long[(int)n+1]; 
         int i; 
         f[0] = 1;   f[1] = 0;  f[2]=1;

          for (i = 3; i <= n; i++) 
                 f[i] = ((i-1)*(f[i-1] + f[i-2])) % 100000007;
           return f[(int)n]; 
     }
     
       public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        long n =sc.nextLong();
        System.out.print(fib(n));
    }
}
