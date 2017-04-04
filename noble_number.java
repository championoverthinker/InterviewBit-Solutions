package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;

public class noble_number {
	
public static int solve(ArrayList<Integer> A) {
        
	Collections.sort(A);
    for(int i=0;i<A.size();i++){
        int count=0;
        for(int j=i+1;j<A.size();j++){
            if(A.get(j)==A.get(i)){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
        if((A.size()-count-i-1)==A.get(i)){
            return 1;
        }
    }
    
    return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A=new ArrayList<>();
		A.add(1);
		A.add(1);
		A.add(5);
		A.add(3);
		A.add(7);
		A.add(1);
		A.add(9);
		A.add(10);
		A.add(8);
		System.out.println(solve(A));
		
		

	}

}
