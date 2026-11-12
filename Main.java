import java.util.Scanner;
class Employee {
    double calculateSalary(){
        return 0.0;
    }
}
class FullTimeEmployee extends Employee {
        double basePay;
        double bonus;

        @Override
        double calculateSalary(){
            double salary = basePay + bonus;

            return salary;
        }
}
class PartTimeEmployee extends Employee{
    double hourlyRate;
    double hourlyWorked;
    @Override
    double calculateSalary(){
        double salary = hourlyRate * hourlyWorked;

        return salary;
    }

}




public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee type(full-time / part-time:");
        String type = in.nextLine();
        if(type.equalsIgnoreCase("full-time")){
            FullTimeEmployee f1 = new FullTimeEmployee();
            System.out.println("Enter base pay: ");
            f1.basePay = in.nextDouble();
            System.out.println("Enter bonus: ");
            f1.bonus = in.nextDouble();
            System.out.println("Monthly Salary: $" + f1.calculateSalary() );





        }
        else {
            PartTimeEmployee p1= new PartTimeEmployee();
            System.out.println("Enter hourly rate: ");
            p1.hourlyRate = in.nextDouble();
            System.out.println("Enter hourly worked: ");
            p1.hourlyWorked = in.nextDouble();
            System.out.println("Monthly Salary: $" + p1.calculateSalary() );


        }


    }
}