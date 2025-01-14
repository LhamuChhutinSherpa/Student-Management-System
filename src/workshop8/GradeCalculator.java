package workshop8;
public class GradeCalculator {
	public int grade;
    GradeCalculator(int grade){
    	this.grade = grade;
    }
    public void calculator(int result){
    	result = 50;
    	if(result>50) {
    		System.out.println("Pass");
    	}else {
    		System.out.println("Fail");
    	}    	
    }
}
