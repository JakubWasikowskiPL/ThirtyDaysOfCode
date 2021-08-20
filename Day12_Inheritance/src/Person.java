public class Person {
    private String firstName;
    private String lastName;
    private int idNumber;


    //Constructor
    public Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    //Print Person
    public void printPerson(){
        System.out.println("Name: "+lastName+", "+firstName+
                "\nID: "+idNumber );
    }

}
