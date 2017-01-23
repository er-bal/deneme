
public class StudentController {

	private Student model;
	private StudentView view;
	
	StudentController(Student student, StudentView sview){
	
		this.model = student;
		this.view = sview;
				
	}
	
	public void setStudentName(String name){
		
		model.setName(name);
			
	}	
	
	public String getStudentName(){
		
		return model.getName();
	}
	
	public void setStudentRollNumber(String number){
		
		model.SetrollNumber(number);
	}
	
	public String getStudentRollNumber(){
		
		return model.getrollNumber();
	}
	
	public void UpdateView()
	{
		view.printStudentDetails(model.getName(), model.getrollNumber());
	}
	

}
