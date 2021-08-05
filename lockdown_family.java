import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Main
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int res=Integer.parseInt(br.readLine());
	  String str=br.readLine();
	  List<Character> songs = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
	  List<Integer> ret = IntStream.rangeClosed(0,res-1).boxed().collect(Collectors.toList());
	  List<Integer> temp = new ArrayList<>();
	  char y = 'y';
	  int member=0,counter=0;
	  while(temp.size() != res-1){
		  if(member>=ret.size())
			  member=0;
		  if(y == songs.get(counter)){
			  temp.add(member);
			  ret.remove(member);
		  }
		  else
			  member++;
		  if(counter == songs.size()-1)
			  counter = 0;
		  else
			  counter++;	  
	  }
	  System.out.println(ret.get(0)+1); 
  }
}
