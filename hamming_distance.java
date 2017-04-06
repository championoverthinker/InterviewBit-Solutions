package InterviewBit;

import java.util.ArrayList;

public class hamming_distance {
	
	public static int hammingDistance(final ArrayList<Integer> A) {
		
		int sum=0;
		for(int i=0;i<A.size();i++){
			for(int j=0;j<A.size();j++){
				sum=sum+utilHamming(A.get(i),A.get(j));
			}
		}
		
		return sum;
		
		
    }
    
    
    public static int utilHamming(int a,int b){
    	int value=a^b;
    	int count=0;
    	while(value!=0){
    		value=value&(value-1);
    		count++;
    	}
    	
    	return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A=new ArrayList<>();
		A.add(2);
		A.add(4);
		A.add(6);
		System.out.println(hammingDistance(A));

	}

}
