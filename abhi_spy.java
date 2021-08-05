import java.util.*;
class Main
{
	
  public static String solve(String s){
	  int ml = ((s.length()+1)/2)-1;
	  if(ml > 0)
		  return s.charAt(ml) + solve(s.substring(0,ml)) + solve(s.substring(ml+1,s.length()));
	  else if(ml < 0)
		  return "";
	  else
		  return s.substring(ml);
  }
  public static void main(String args[])
  {
    //Try out your code here
	Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  while(n>0){
		  int a = sc.nextInt();
		  String str = sc.next();
		  
    	  System.out.println(""+solve(str));
		  n-=1;
	  }
  }
}
