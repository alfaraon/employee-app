package employeemanagement;

import java.util.Date;

// Employee Class
public class Employeemanagement {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String position;
    private double basicSalary;
    private double hourlyRate;
    private String department;
    private String contactNumber;
    private String address;
    private String sssNumber;
    private String philHealthNumber;
    private String tinNumber;
    private String pagibigNumber;
    private double mealAllowance;

    public Employee(int employeeId, String firstName, String lastName, String position, double basicSalary, double hourlyRate,
                    String department, String contactNumber, String address,
                    String sssNumber, String philHealthNumber, String tinNumber,
                    String pagibigNumber, double mealAllowance) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.basicSalary = basicSalary;
        this.hourlyRate = hourlyRate;
        this.department = department;
        this.contactNumber = contactNumber;
        this.address = address;
        this.sssNumber = sssNumber;
        this.philHealthNumber = philHealthNumber;
        this.tinNumber = tinNumber;
        this.pagibigNumber = pagibigNumber;
        this.mealAllowance = mealAllowance;
    }

    // Getters and setters
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getSssNumber() {
        return sssNumber;
    }
    public void setSssNumber(String sssNumber) {
        this.sssNumber = sssNumber;
    }

    public String getPhilHealthNumber() {
        return philHealthNumber;
    }
    public void setPhilHealthNumber(String philHealthNumber) {
        this.philHealthNumber = philHealthNumber;
    }

    public String getTinNumber() {
        return tinNumber;
    }
    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getPagibigNumber() {
        return pagibigNumber;
    }
    public void setPagibigNumber(String pagibigNumber) {
        this.pagibigNumber = pagibigNumber;
    }

    public double getMealAllowance() {
        return mealAllowance;
    }
    public void setMealAllowance(double mealAllowance) {
        this.mealAllowance = mealAllowance;
    }

    // Other methods
    public double calculateSalary() {
        return basicSalary + mealAllowance;
    }

    public String getDetails() {
        return employeeId + " - " + firstName + " " + lastName + " (" + position + ")";
    }
}

// LoginSession Class
class LoginSession {
    private int sessionId;
    private int employeeId;
    private Date loginTime;
    private Date logoutTime;
    private boolean isActive;

    public LoginSession(int sessionId, int employeeId) {
        this.sessionId = sessionId;
        this.employeeId = employeeId;
        this.isActive = false;
    }

    // Getters and setters
    public int getSessionId() {
        return sessionId;
    }
    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getLoginTime() {
        return loginTime;
    }
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }
    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }

    // Other methods
    public void login() {
        this.loginTime = new Date();
        this.isActive = true;
        System.out.println("Employee " + employeeId + " logged in at " + loginTime);
    }

    public void logOut() {
        this.logoutTime = new Date();
        this.isActive = false;
        System.out.println("Employee " + employeeId + " logged out at " + logoutTime);
    }
}

// Attendance Class
class Attendance {
    private int attendanceId;
    private int employeeId;
    private Date date;
    private double hoursWorked;
    private boolean isPresent;

    public Attendance(int attendanceId, int employeeId) {
        this.attendanceId = attendanceId;
        this.employeeId = employeeId;
    }

    // Getters and setters
    public int getAttendanceId() {
        return attendanceId;
    }
    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public boolean isPresent() {
        return isPresent;
    }
    public void setPresent(boolean present) {
        isPresent = present;
    }

    // Other methods
    public void markAttendance(boolean present, double hours) {
        this.isPresent = present;
        this.hoursWorked = hours;
        this.date = new Date();
        System.out.println("Attendance marked for employee " + employeeId + " on " + date + ". Present: " + isPresent + ", Hours worked: " + hoursWorked);
    }

    public boolean getAttendance() {
        return isPresent;
    }
}

// Deduction Class
class Deduction {
    private int deductionId;
    private int employeeId;
    private double tax;
    private double sss;
    private double philHealth;
    private double pagibig;
    private double totalDeduction;

    public Deduction(int deductionId, int employeeId, double tax, double sss, double philHealth, double pagibig) {
        this.deductionId = deductionId;
        this.employeeId = employeeId;
        this.tax = tax;
        this.sss = sss;
        this.philHealth = philHealth;
        this.pagibig = pagibig;
        calculateNetSalary();
    }

    // Getters and setters
    public int getDeductionId() {
        return deductionId;
    }
    public void setDeductionId(int deductionId) {
        this.deductionId = deductionId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getSss() {
        return sss;
    }
    public void setSss(double sss) {
        this.sss = sss;
    }

    public double getPhilHealth() {
        return philHealth;
    }
    public void setPhilHealth(double philHealth) {
        this.philHealth = philHealth;
    }

    public double getPagibig() {
        return pagibig;
    }
    public void setPagibig(double pagibig) {
        this.pagibig = pagibig;
    }

    public double getTotalDeduction() {
        return totalDeduction;
    }
    public void setTotalDeduction(double totalDeduction) {
        this.totalDeduction = totalDeduction;
    }

    // Other methods
    public void generatePayroll() {
        System.out.println("Generating payroll for employee " + employeeId);
        calculateNetSalary();
    }

    public double calculateNetSalary() {
        totalDeduction = tax + sss + philHealth + pagibig;
        return totalDeduction;
    }
}

// Payroll Class
class Payroll {
    private int payrollId;
    private int employeeId;
    private double grossSalary;
    private double netSalary;
    private double deductions;
    private double allowances;

    public Payroll(int payrollId, int employeeId, double grossSalary, double allowances, double deductions) {
        this.payrollId = payrollId;
        this.employeeId = employeeId;
        this.grossSalary = grossSalary;
        this.allowances = allowances;
        this.deductions = deductions;
        calculateNetSalary();
    }

    // Getters and setters
    public int getPayrollId() {
        return payrollId;
    }
    public void setPayrollId(int payrollId) {
        this.payrollId = payrollId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getGrossSalary() {
        return grossSalary;
    }
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }
    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public double getDeductions() {
        return deductions;
    }
    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getAllowances() {
        return allowances;
    }
    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    // Other methods
    public double calculateNetSalary() {
        netSalary = grossSalary + allowances - deductions;
        return netSalary;
    }

    public String getPayrollDetails() {
        return "Payroll for Employee ID " + employeeId + ": Gross Salary = " + grossSalary +
               ", Allowances = " + allowances + ", Deductions = " + deductions +
               ", Net Salary = " + netSalary;
    }
}