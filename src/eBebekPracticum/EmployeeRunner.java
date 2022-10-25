package eBebekPracticum;


import java.util.Scanner;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Scanner scan=new Scanner(System.in);
        // Yukarida 'Employee' sinifindan obje ve Scanner classindan bilgileri kullanicidan almak icin scan objesi olusturulmustur.
        // Scanner ile kullanicidan alinan bilgiler constructor araciligi ile 'Employee' sinifina gonderilecek, ardindan o siniftaki methodlar gerekli hesaplamalari yapacaktir.
        System.out.print("Enter employee's full name : ");
        employee.setName(scan.nextLine());
        System.out.print("Enter employee's salary : ");
        employee.setSalary(scan.nextDouble());
        System.out.print("Enter employee's workly hours : ");
        employee.setWorkHours(scan.nextDouble());
        System.out.print("Enter employee's hire year : ");
        employee.setHireYear(scan.nextInt());
        System.out.println("***EMPLOYEE INFORMATIONS***" + employee);
        // Yukarida kullanicidan bilgiler alinmis ve bu bilgilere gore hesaplanan degereler konsolda yazdirilmistir.
    }
}
