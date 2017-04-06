package InterviewBit;

import java.util.ArrayList;
import java.util.HashMap;

public class prime_sum {
	
	public static ArrayList<Integer> primesum(int a) {
        
        boolean p[]=new boolean[a+1];
        for(int i=0;i<=a;i++){
        	p[i]=true;
        }
        
        for(int i=2;i<Math.sqrt(a);i++){
        	if(p[i]==true){
        		for(int j=i*2;j<=a;j+=i){
        			p[j]=false;
        		}
        	}
        }
        ArrayList<Integer> result=new ArrayList<>();
        
        for(int i=2;i<p.length;i++){
        	if(p[i]==true){
        		if(p[a-i]==true){
            		result.add(i);
            		result.add(a-i);
            		return result;
        		}
        	}
        }
        


        
        
        return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> result=primesum(12);
		for(int i:result){
			System.out.println(i);
		}

	}

}
