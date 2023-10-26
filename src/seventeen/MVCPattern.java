package seventeen;

class Employee {
  private String name;
  private int salary;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}

class EmployeeView {
  public void displayEmployee(Employee employee) {
    System.out.println("Name: " + employee.getName());
    System.out.println("Salary: $" + employee.getSalary());
  }
}

// write a EmployeeController class that handles both Employee and EmployeeView
class EmployeeController {
  private Employee employee;
  private EmployeeView employeeView;

  public EmployeeController(Employee employee, EmployeeView employeeView) {
    this.employee = employee;
    this.employeeView = employeeView;
  }

  public void setEmployeeName(String name) {
    employee.setName(name);
  }

  public void setEmployeeSalary(int salary) {
    employee.setSalary(salary);
  }

  public void displayEmployee() {
    employeeView.displayEmployee(employee);
  }
}
