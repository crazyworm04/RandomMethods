
	/**
	 * Another random class of methods that I created when initially learning Java
	 * and became initially introduced to the four Object Oriented principles
	 */
public class RandomMethods2 {

	/**
	 * Class fields
	 */	
	private String firstName;
	private String lastName;
	private int age;
	
	/**
	 * Class accessor methods
	 */	
	public String getFirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;	
	}
	
	/**
	 * Class mutator methods
	 */	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		if(age < 0 || age > 100) {
			this.age = 0;
		}
		this.age = age;
	}
	
	/**
	 * Simple method for determining if the person is a teenager
	 */	
	public boolean isTeen() {
		if(getAge() > 12 && getAge() < 20) {
			return true;
		}
		return false;
	}
	
	/**
	 * Method that gets person's full name
	 * @return the string concatenation of the first and last names
	 */	
	public String getFullName() {
		
		if(getlastName().isEmpty()) {
			return getFirstName();
		}
		else if(getFirstName().isEmpty()) {
			return getlastName();
		}
		return "";
	}
}
