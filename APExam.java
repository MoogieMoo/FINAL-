public class APExam {
    String subject;
    int level;
    double grade;
    public APExam( int newLevel, double newGrade ) {
			level = newLevel;
			grade = newGrade;
    }
	
    public int getLevel() {
			return level+0;
    }
    //~security~
    public double getGrade() {
			return grade+0.0;
    }

}
