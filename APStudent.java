import java.util.ArrayList;
public class APStudent {

    ArrayList<APExam> exams;

    public double getAvg() {
	    double sum = 0;
	    for ( int i = 0; i < exams.size() - 1; i++ ) {
	        sum += exams.get(i).getGrade();
	    }
	    return (double) sum / exams.size();
    }
	
    public int award() {
	    int x = 0;
	    int y = 0;
	    for ( int i = 0; i < exams.size() - 1; i++ ) {
	        if ( exams.get(i).getGrade() >= 3 ) {
	        	if ( exams.get(i).getLevel() == 2 ) {
		             x += 1;
	        	}
	        	if ( exams.get(i).getLevel() == 1 ) {
		             y += 1;
	        	}
	        }
    	}
    	if ( ((double) x + ( (double) y / 2 )) >= 4 && getAvg() >= 3.25 ) {
	          return 2;
    	}
    	if ( ((double) x + ( (double) y / 2 )) >= 3 ) {
	           return 1;
    	}
	else {
	    return 0;
    	}
    }
	
    public ArrayList<Double> percentages ( ArrayList<APStudent> list ) {
    	int n = 0;
    	int s = 0;
    	int h = 0;
    	for ( int i = 0; i < list.size() - 1; i++ ) {
	         if ( list.get(i).award() == 0 ) {
	        	n += 1;
	          }
	         if ( list.get(i).award() == 1 ) {
	        	s += 1;
	         }
	         if ( list.get(i).award() == 2 ) {
	        	h += 1;
	         }
    	}
	ArrayList<Double> list1 = new ArrayList<Double>();
	list1.add( (double) n * 100 / list.size() );
	list1.add( (double) s * 100 / list.size() );
	list1.add( (double) h * 100 / list.size() );
	return list1;
    }		
		
}
