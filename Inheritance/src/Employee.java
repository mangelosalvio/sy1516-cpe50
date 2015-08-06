public class Employee extends Person {
    private double basic_salary;
    private String employeeNumber, companyName;

    public Employee(double basic_salary, String employeeNumber, String companyName) {
        /**
         * this constructor automatically calls the default constructor of the parent component
         */
        this.basic_salary = basic_salary;
        this.employeeNumber = employeeNumber;
        this.companyName = companyName;
    }

    public Employee(String firstName, String lastName, double basic_salary, String employeeNumber, String companyName) {
        /**
         * The purpose of super is to call the constructor of the parent component
         */
        super(firstName, lastName);
        this.basic_salary = basic_salary;
        this.employeeNumber = employeeNumber;
        this.companyName = companyName;
    }

    public double getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }



    @Override
    public void saySomething() {
        System.out.println("This is awesome!");
    }

    @Override
    public String toString() {
        /**
         * the super.toString() calls the toString Method of the parent.
         */
        return super.toString() +
                "\nEmployee # " + this.employeeNumber + "\n" +
                "Company Name : " + this.companyName + "\n" +
                "Basic Salary : " + this.basic_salary;
    }
}
