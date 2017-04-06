package InterviewBit;
import java.util.ArrayList;
public class Anti_diagonal {
	
	
	public static ArrayList<ArrayList<Integer>> diagonal2(ArrayList<ArrayList<Integer>> A) {
	    int l = A.size();
	    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < 2 * l - 1; i++) {
    	    int offset = i < l ? 0 : i - l + 1;
	        ArrayList<Integer> row = new ArrayList<>();
    	    for (int j = offset; j <= i - offset; j++) {
		        row.add(A.get(j).get(i - j));
    	    }
	        res.add(row);
        }
        return res;
	}
	
	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
	    ArrayList<ArrayList<Integer>> result=new ArrayList<>();
	    int i=0;
	    ArrayList<Integer> tempf=new ArrayList<>();
	    tempf.add(a.get(0).get(0));
	    result.add(new ArrayList<>(tempf));
	    int j=i+1;
	    while(j<a.size()){
	    	
	    	ArrayList<Integer> temp=new ArrayList<>();
	    	int k=j;
    		int l=i;
	    	while(k>=0&&l<a.size()){
	    		
	    		temp.add(a.get(l).get(k));
	    		k--;
	    		l++;
	    	}
	    	result.add(temp);
	    	j++;
	    	}
	    
	    
	    i=1;
	    j=a.size()-1;

	    while(i<a.size()){
	    	ArrayList<Integer> temp=new ArrayList<>();
	    	int k=i;
    		int l=j;
	    	while(l>=0&&k<a.size()){
	    		
	    		temp.add(a.get(k).get(l));
	    		k++;
	    		l--;
	    	}
	    	
	    	i++;
	    	result.add(new ArrayList<>(temp));
	    	}
	    
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        A.add(new ArrayList<>(temp));
        temp.clear();
        
        temp.add(4);
        temp.add(5);
        temp.add(6);
        A.add(new ArrayList<>(temp));
        temp.clear();
        
        temp.add(7);
        temp.add(8);
        temp.add(9);
        A.add(new ArrayList<>(temp));
       temp.clear();
       
       for(ArrayList<Integer> t : A)
           System.out.println(t);
       
       ArrayList<ArrayList<Integer>> result  = diagonal2(A);
       for(ArrayList<Integer> t : result)
         System.out.println(t);

	}

}
