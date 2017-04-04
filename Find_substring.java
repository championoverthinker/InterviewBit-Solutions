package InterviewBit;

import java.util.ArrayList;

public class Find_substring {
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="HelloWord";
		String s="Word";
		
		int m=t.length();
	      int n=s.length();
	      for(int i=0;i<=(m-n);i++)
	        {
	           int k=0;
	           while((k<n) && (s.charAt(k) == t.charAt(i+k)))
	              k++;
	           if(k==n) 
	     {   int pos=i+1;
	               System.out.println(pos);
	     } 
		
		
		

	}

	}
}
