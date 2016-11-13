package bibi.sample;

public class User {
	
	private String FirstName;
	private String LastName;
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String printName(){
		String fullName = FirstName + " " + LastName;
		return fullName;
	}
}
