package InterviewBit;

import java.util.ArrayList;
import java.util.HashMap;

import l3.arrays;

public class Rearrange_array {
	
	public static void arrange(ArrayList<Integer> a) {
	    int n=a.size();
	    for(int i=0;i<a.size();i++){
	        int num=a.get(i);
	        a.set(i,num+(a.get(a.get(i))%n)*n);
	    }
	    
	    for(int i=0;i<a.size();i++){
	        a.set(i,a.get(i)/n);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(0);
		arrange(a);

	}

}
