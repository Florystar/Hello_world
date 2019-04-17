package employees;

/**
 * Creation of Child class from Employee.
 */
public class ContractedEmployee extends Employee {
  private String federalTaxId;
  private double hourlyRate;
  private double numberOfHoursWorked;
  private double averageMonthlySalary;


  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    this. federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this. federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  @Override
  public void calculatePay() {
    this.averageMonthlySalary = this.hourlyRate * this.numberOfHoursWorked;
  }

  @Override
  public double getAverageMonthlySalary() {
    return this.averageMonthlySalary;
  }

  /**
   * Calculation of Salary for Rate Payment.
   */
  public static void main(String[] args) {
    ContractedEmployee empl1 = new ContractedEmployee("123456", "Amanda", "987654");
    empl1.setHourlyRate(48);
    empl1.setNumberOfHoursWorked(160);
    empl1.calculatePay();
    System.out.println(String.format("The pay for Contracted employee is %s",
        empl1.getAverageMonthlySalary()));
  }



}
