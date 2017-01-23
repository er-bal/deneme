
public class MVCPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
	
		Student model = getStudentFromDB();
			
		StudentView view = new StudentView();
		
		StudentController sc = new StudentController(model,view);

		sc.UpdateView();
		
		sc.setStudentName("hebekekeke2345345345");
		
		sc.UpdateView();
		
		
	}

	
	private static Student getStudentFromDB()
	{
		Student student = new Student();
		student.setName("hebelelele");
		student.SetrollNumber("35");
		
		return student;
		
	}
}
