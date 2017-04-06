package InterviewBit;

import java.util.ArrayList;

public class max_abs_difference {
	
	public int maxArr(ArrayList<Integer> A) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		for(int i=0;i<A.size();i++){
			max1=Math.max(max1,A.get(i)+i);
			max2=Math.max(max2,A.get(i)-i);
			min1=Math.min(min1,A.get(i)+i);
			min2=Math.min(min2,A.get(i)-i);

		}
		
		int ans=Integer.MIN_VALUE;
		ans=Math.max(ans,max1-min1);
		ans=Math.max(ans,max2-min2);
		
		return ans;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
