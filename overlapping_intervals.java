package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class overlapping_intervals {
	
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> result=intervals;
        Collections.sort(result, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
            	if(i1.start!=i2.start){
               return i1.start-i2.start;
            	}else
            		return i1.end=i2.end;
                
            }
        });
        Interval prev=result.get(0);
        ArrayList<Interval> answer=new ArrayList<>();
        for(int i=1;i<result.size();i++){
        	Interval curr=result.get(i);
            if(prev.end>curr.start){
            	Interval merge = new Interval(prev.start,Math.max(prev.end, curr.end));
            	prev=merge;
            }else{
            	answer.add(prev);
            	prev=curr;
            }
           
        }
        answer.add(prev);
		return answer;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
