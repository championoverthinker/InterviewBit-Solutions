package InterviewBit;

import java.util.ArrayList;

public class Add_one_to_number {
	
	
	
		public static ArrayList<Integer> plusOne(ArrayList<Integer> num) {
		    int sum,carry=1;
			for(int i=num.size()-1;i>=0;i--){
				sum=num.get(i)+carry;
				
				if(sum>9){
					carry=1;
				}else{
					carry=0;
				}
				
				num.set(i,sum%10);
				
			}
			
			
			
			if(carry==1){
				ArrayList<Integer> result=new ArrayList<>();
				result.add(1);
				for(int i:num){
					result.add(i);
				}
				
				return result;
				
				
			}else{
			    int j=0;
			    for(int i=0;i<num.size()&&num.get(i)==0;i++){
					j++;
				}
			
			num.subList(0,j).clear();
			    
			    return num;
			}
		    
		}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num=new ArrayList<>();
		num.add(0);
		num.add(0);
		num.add(9);
		num.add(0);
		num.add(8);
		num=plusOne(num);
		for(int i:num){
			System.out.print(i);
		}
		
		

	}

}
