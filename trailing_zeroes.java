package InterviewBit;

public class trailing_zeroes {
	
	public static int trailingZeroes(int a) {
	    int count=0;
	    int i=1;
	    while((a/(int)Math.pow(5,i))!=0){
	        count=count+(a/(int)Math.pow(5,i));
	        i++;
	    }
	    
	    return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(101));

	}

}
