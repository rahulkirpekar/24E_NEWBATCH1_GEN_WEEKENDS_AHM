package jdbctopic.bean;

public class StudentBean 
{
	private int id ;
	private String name ;
	private int std  ; 
	private int marks ;
	
	public StudentBean() 
	{
	}
	public StudentBean(int id, String name, int std, int marks) 
	{
		this.id = id;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
