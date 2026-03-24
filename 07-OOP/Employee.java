public class Employee {
    String name;
    int salary;
    int work_hours;
    int hire_year;

    public Employee(String name , int salary , int work_hours , int hire_year){
        this.name = name;
        this.salary = salary;
        this.work_hours = work_hours;
        this.hire_year = hire_year;
    }

    public double Tax(){
        if(salary > 1000){
            return salary * 0.03;
        } else {
            return 0;
        }
    }

    public double RaiseSalary(){
        int calisma_suresi = 2024 - hire_year;

        if(calisma_suresi < 10){
            return salary * 0.05;
        } 
        else if(calisma_suresi < 20){
            return salary * 0.10;
        } 
        else {
            return salary * 0.15;
        }
    }

    public int bonus(){
        return (work_hours*30);
    }

    @Override
    public String toString(){
        return "Name : " + name +
           "\nSalary : " + salary +
           "\nWork Hours : " + work_hours +
           "\nHire Date : " + hire_year +
           "\nTax : " + Tax() +
           "\nBonus : " + bonus() +
           "\nRaise Salary : " + RaiseSalary();
    }
}