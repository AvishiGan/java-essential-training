package inheritance;

public class Employee extends Person{

    private String employeeId;
    private String title;

    public Employee(){
        super("John Doe");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeID(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
