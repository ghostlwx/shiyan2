package classalter;

public class Teather extends Personal {
	private Course course;
	public String toString(){
		System.out.println("teather toString is operating");
		return id+name+sex+course;
	}
	public Teather(int id, String name, String sex,Course course) {
		super(id, name, sex);
		this.course=course;
	}

}



