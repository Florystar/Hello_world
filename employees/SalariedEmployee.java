package employees;

/**
 * Creation of Child class from Employee.
 */
public class SalariedEmployee extends Employee {
  String socialSecurityNumber;
  double fixedMonthlyPayment;
  double averageMonthlySalary;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  @Override
  public void calculatePay() {
    this.averageMonthlySalary = this.fixedMonthlyPayment;
  }

  @Override
  public double getAverageMonthlySalary() {
    return this.averageMonthlySalary;
  }

  /**
   * Calculation of salary for Fixed Monthly Payment.
   */
  public static void main(String[] args) {
    SalariedEmployee empl2 = new SalariedEmployee("123456", "Amanda", "987654");
    empl2.setFixedMonthlyPayment(69);
    empl2.calculatePay();
    System.out.println(String.format("The pay for Salaried employee is %s",
        empl2.getAverageMonthlySalary()));
  }
}

