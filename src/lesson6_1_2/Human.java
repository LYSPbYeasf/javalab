package lesson6_1_2;

public abstract class Human implements AccountOpen {
    private String firstName;
    private String lastName;
    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public abstract String getAllInfo();

}
