public class Student {

	private String name;
	private String rollNumber;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName(){
		
		return this.name;
		
	}
	
	public void SetrollNumber(String rollNumber55)
	{
		this.rollNumber = rollNumber55;
	}
	
	public String getrollNumber()
	{
		return this.rollNumber;
	}
	
	@Override
	
	public String toStringSon(){
		
		return name+rollNumber;
		
	}
	
}
