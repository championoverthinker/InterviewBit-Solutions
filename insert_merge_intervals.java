package InterviewBit;

import java.util.ArrayList;

public class insert_merge_intervals {
	
	    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
			int j=0;
	    	for(j=0;j<intervals.size();j++){
	    		if(intervals.get(j).start>newInterval.start){
	    			intervals.add(j,newInterval);
	    			break;
	    		}
	    		
	    	}
	    	
	    	if(j==intervals.size()){
	    		intervals.add(newInterval);
	    	}
	    	
	    	ArrayList<Interval> answer=new ArrayList<>();
	    	Interval prev=intervals.get(0);
	        for(int i=1;i<intervals.size();i++){
	        	Interval curr=intervals.get(i);
	            if(prev.end>curr.start){
	            	Interval merge = new Interval(prev.start,Math.max(prev.end, curr.end));
	            	prev=merge;
	            }else{
	            	answer.add(prev);
	            	prev=curr;
	            }
	           
	        }
	        answer.add(prev);
	        for(Interval i:answer){
	        	System.out.println(i.start +","+i.end);
	        }
			return answer;
	    	

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Interval> intervals=new ArrayList<>();
		intervals.add(new Interval(1, 2));
		intervals.add(new Interval(3, 6));
//		intervals.add(new Interval(6, 7));
//		intervals.add(new Interval(8, 10));
//		intervals.add(new Interval(12, 16));
		insert(intervals,new Interval(10,8));
		

	}

}
