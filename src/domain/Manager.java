package domain;

/**
 * Class that represents a manager
 * @author Denis Tatsii
 */
public class Manager extends Employee {

    /**
     * Constructor that accepts manager's info
     * @param employees all employees int he company
     * @param name manager's name
     * @param jobTitle manager's job title
     * @param level manager's level
     * @param dept manager's department name
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Method that returns manager's info
     * @return string with manager's info
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Constructor that accepts all employees
     * @param employees employees array
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Default constructor
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Method that returns all employee's names
     * @return string with all employee's names
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method that sets employees to the manager's employee's list
     * @param employees employee's array
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method that returns employee's list
     * @return employee's array
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
