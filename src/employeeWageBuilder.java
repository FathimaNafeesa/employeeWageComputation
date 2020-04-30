import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class employeeWageBuilder {

        public  int WAGE_PER_HOUR;
        public static final int FULL_DAY_HOUR = 8;
        public static final int PART_DAY_HOUR = 4;
        public int MAXIMUM_WORKING_HOURS_A_MONTH;
        public int WORKING_DAYS_A_MONTH;
        public static Boolean present = false;
        public static int employeeType;
        public static Random random = new Random();
        public static Scanner scanner = new Scanner(System.in);
        public String  companyName;
        public int daily_wage = 0;
        public int monthly_wage = 0;
        public int wage = 0;

        public static ArrayList<employeeWageBuilder> companyNamesAndObjects = new ArrayList<employeeWageBuilder>();
        public static void checkAttendance() {

            int attendance = random.nextInt(2);
            if (attendance == 1) present = true;
            else present = false;
        }

        public  void calculateWage(Boolean present) {
            System.out.println(companyName);

            if (present) {
                employeeType = random.nextInt(2);
                switch (employeeType) {
                    case 0:
                        daily_wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                        System.out.println("The daily wage is " + daily_wage);
                    case 1:
                        daily_wage = WAGE_PER_HOUR * PART_DAY_HOUR;
                        System.out.println("The daily wage is " + daily_wage);
                        break;
                    default:
                        calculateWage(true);
                }

            } else {
                System.out.println("Employee is absent");
            }

            monthly_wage = WAGE_PER_HOUR * FULL_DAY_HOUR * WORKING_DAYS_A_MONTH;
            System.out.println("The monthly wage is " + monthly_wage);

            int days_worked = 1;
            int hours_worked = 1;

            if (present) {
                while (days_worked <= WORKING_DAYS_A_MONTH && hours_worked <= MAXIMUM_WORKING_HOURS_A_MONTH) {

                    wage = hours_worked * WAGE_PER_HOUR;
                    hours_worked++;
                    if (hours_worked >= FULL_DAY_HOUR && hours_worked % FULL_DAY_HOUR == 0) {
                        days_worked++;
                    }
                }
                System.out.println("The total wage is " + wage);
            }
        }
        public void printWages() {
            System.out.println(companyName);
            System.out.println(daily_wage);
            System.out.println(monthly_wage);
            System.out.println(wage);
        }
        employeeWageBuilder(String companyName,int wage_per_hour, int working_days_a_month, int working_hours_a_month) {
            this.companyName = companyName;
            this.WAGE_PER_HOUR = wage_per_hour;
            this.WORKING_DAYS_A_MONTH = working_days_a_month;
            this.MAXIMUM_WORKING_HOURS_A_MONTH= working_hours_a_month;

        }
   
    static class CompanyEmpWage {
        public static void getCalculateWages() {
            for (employeeWageBuilder companyWage:companyNamesAndObjects)
            {
             companyWage.calculateWage(present) ;
            }
        }
        public static void printCalculatedWages(String company_name){
            for (employeeWageBuilder companyWage:companyNamesAndObjects)
            {
                if( company_name.equals(companyWage.companyName)) {
                  companyWage.printWages();
                }
            }
        }

    }


    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWageComputationProgram");
        companyNamesAndObjects.add(0,new employeeWageBuilder("flipkart",20, 20, 100));
        companyNamesAndObjects.add(1,new employeeWageBuilder("amazon",22, 30, 90));
        companyNamesAndObjects.add(2,new employeeWageBuilder("netflix",23, 25, 120));
        checkAttendance();
        CompanyEmpWage.getCalculateWages();
        CompanyEmpWage.printCalculatedWages("flipkart");

    }
}
