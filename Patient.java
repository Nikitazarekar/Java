package HospitalManagementSystem;

public class Patient {
	private int id;
	private String name;
	private int age;
	private String disease;
	private boolean isAdmitted;
	public Patient(int id, String name, int age, String disease)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.isAdmitted=false;
	}
	
	public void displayInfo() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Admitted: " + (isAdmitted ? "Yes" : "No"));
        System.out.println("----------------------------");
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public boolean isAdmitted() {
		return isAdmitted;
	}

	public void setAdmitted(boolean isAdmitted) {
		this.isAdmitted = isAdmitted;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", disease=" + disease + ", isAdmitted="
				+ isAdmitted + "]";
	}
	
	

}
