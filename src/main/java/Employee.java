public class Employee {
   private int employeeId;
   private String name;

    public boolean isPunchedOut() {
        return isPunchedOut;
    }

    public void setPunchedOut(boolean punchedOut) {
        isPunchedOut = punchedOut;
    }

    public boolean isPunchedIn() {
        return isPunchedIn;
    }

    public void setPunchedIn(boolean punchedIn) {
        isPunchedIn = punchedIn;
    }

    private String department;
    private double payRate;
     private  double hoursWorked;
    private int startTime;
    private boolean isPunchedIn = false;
    private boolean  isPunchedOut= true;

    public Employee(){

    }

     public Employee( int employeeId,String name,String department
             ,double payRate,double hoursWorked){
         this.employeeId=employeeId;
         this.name=name;
         this.department=department;
         this.payRate=payRate;
         this.hoursWorked=hoursWorked;

     }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double TotalPay(){
         return hoursWorked * payRate;
    }
    public double RegularHours(){

       return 40;
    }
    public double OverTime(){
         return  hoursWorked-40;
    }
    public void punchIn(int time) {
        if (!isPunchedIn && time >= 0 && time <= 23) {
            startTime = time;
            isPunchedIn = true;
            System.out.println(name + " punched in at " + time);
        } else {
            System.out.println("Invalid punch-in");
        }
    }

    public void punchOut(int time) {
        if (isPunchedIn && time > startTime && time <= 23) {
            hoursWorked += time - startTime;
            isPunchedIn = false;
            System.out.println("Hours worked: " + hoursWorked);
        } else {
            System.out.println("Invalid punch-out");
        }
    }
    public void punchTimeCard(int time) {
        if (!isPunchedIn) {
            punchIn(time);
        } else {
            punchOut(time);
        }
    }
}
