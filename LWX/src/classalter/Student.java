package classalter;

public class Student extends Personal {


	private Course course;
	private Teather teather;
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Teather getTeather() {
		return teather;
	}
	public void setTeather(Teather teather) {
		this.teather = (Teather) teather;
	}
	public void putcourse(){
		if(course==null){
			System.out.println("Not to choose course");
		}else{
		this.toString();
		}
	}
	public String toString(){
	
//		System.out.println("Student toString is operating");
		return id+name+sex+course+teather.getName();
	}
		
	
	public Student(int id, String name, String sex,Course course,Teather teather) {
		super(id, name, sex);
		
			this.course=course;
			this.teather=teather;
		
	
	}
	public Course delete() {
		return course=null;
	}
}