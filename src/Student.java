public class Student {

    private String firstName;
    private String lastName;
    private int matrikelNr;

    public Student(String firstName, String lastName, int matrikelNr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matrikelNr = matrikelNr;
    }

    @Override
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(int matrikelNr) {
        this.matrikelNr = matrikelNr;
    }
}
