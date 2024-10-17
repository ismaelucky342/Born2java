package AEC1.AEC1_implementacion;


	public class User implements Comparable<User> {
    private String name;
    private String passportNumber;
    private String flightNumber;
    private String age;
    private boolean isPregnant;

    public User(String name, String passportNumber, String flightNumber, String age, boolean isPregnant) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.flightNumber = flightNumber;
        this.age = age;
        this.isPregnant = isPregnant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    
    public boolean isPregnant() {
        return isPregnant;
    }
    
    public void setPregnant(boolean isPregnant) {
        this.isPregnant = isPregnant;
    }

	
	public int compareTo(User otherUser) {
		return 0;
     
    }
}
	