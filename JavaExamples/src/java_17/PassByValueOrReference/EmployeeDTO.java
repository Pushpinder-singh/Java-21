package java_17.PassByValueOrReference;

public class EmployeeDTO {

	
	String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	int id;
	
	public EmployeeDTO(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
}
