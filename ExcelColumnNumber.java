package InterviewBit;

public class ExcelColumnNumber {
	
	public static int titleToNumber(String a) {
	    int ans=0;
	    int counter=0;
	    for(int i=a.length()-1;i>=0;i--){
	        char curr=a.charAt(i);
	        ans=(int) (ans+Math.pow(26,counter)*(curr-'A'+1));
	        counter++;
	    }
	    System.out.println(ans);
	    return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		titleToNumber("AB");

	}

}
