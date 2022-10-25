package eBebekPracticum;

public class Employee {

    public String name;
    public double salary, workHours;
    public int hireYear;
    public Employee() {
    }
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    // Yukaridaki constructor (kurucu method) bizden istenildigi sekilde 4 parametrelidir.
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }
    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    // Yukaridaki setter methodlari ile runner classindan girilen bilgiler sayesinde elimizdeki verileri degistirebilme ozelligi katmis olduk.
    public double taxCalculationMethod() {
        if (salary < 1000) {
            return 0;
        } else return salary * 3 / 100;
    }
    // Yukaridaki method calisanin bize verilen maasina gore vergisinin hesaplanmasi icin olusturulmustur.
    public double bonusCalculationMethod() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }
    // Yukaridaki method calisanin bize verilen haftalik calisma saatine gore
    // maasina eklenecek bonusun hesaplanmasi icin olusturulmustur.
    public double raiseSalaryMethod() {
        if (2021 - hireYear < 10) {
            return salary * 5 / 100;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            return salary * 10 / 100;
        } else if (2021 - hireYear > 19) {
            return salary * 15 / 100;
        } else return 0;
    }
    // Yukaridaki method calisanin bize verilen ise giris tarihine gore
    // maasina uygulanacak olan zammin hesaplanmasi icin olusturulmustur.
    public double taxDeductedSalary() {
        return salary + bonusCalculationMethod() - taxCalculationMethod();
    }
    // Yukaridaki method calisanin bize verilen bilgilerine gore yapilan hesaplamalar sonucunda
    // maas bonusu eklenmis ve vergisinin dusulmus halinin hesaplanmasi icin olusturulmustur.
    public double totalSalary() {
        return salary + bonusCalculationMethod() - taxCalculationMethod() + raiseSalaryMethod();
    }
    // Yukaridaki method calisanin bize verilen bilgilerine gore hesaplanan zam, bonus, vergi gibi
    // degiskenlerin ardindan ortaya cikan son maasinin hesaplanmasi icin olusturulmustur.
    @Override
    public String toString() {
        return
                "\nName : " + name +
                        "\nSalary : " + salary +
                        "\nWork Hours : " + workHours +
                        "\nHire Year : " + hireYear +
                        "\nTax : " + taxCalculationMethod() +
                        "\nBonus Payment : " + bonusCalculationMethod() +
                        "\nRaise Salary : " + raiseSalaryMethod() +
                        "\nTax Deducted Salary : " + taxDeductedSalary() +
                        "\nTotal Salary : " + totalSalary();
    }
    // Yukaridaki method calisanin bize verilen bilgilerinin ve bize verilen bilgilere gore yapilan hesaplamalarin
    // tamaminin konsola yazdirilmasi icin olusturulmustur.

}

