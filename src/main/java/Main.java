public class Main {
    public static void main(String[] args) {
     Employee employee1=new Employee(12,"fana"

             ,"checking dept",16,20) ;
        System.out.println("name is"+employee1.getName());
        Employee employee2=new Employee();
        employee2.setName("helen");
        employee2.setEmployeeId(13);
        employee2.setDepartment(" managment");
        System.out.println("name is "+employee2.getName());

    }
}
