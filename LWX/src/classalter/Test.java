package classalter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 Course course=new Course(1, "java", "Beijing",3,3);
		 Teather teather=new Teather(1, "����ʦ", "man",course);
		 Student student=new Student(1, "С��", "man",course,teather);
		 System.out.println(student.toString());
		 student.delete();
//		 student.setCourse(null);
//		 student.setTeather(null);
		 student.putcourse();
		 
	}
	

}