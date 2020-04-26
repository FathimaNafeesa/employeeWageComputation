import java.util.Random;
import java.util.Scanner;

class empWageComputationMain {

        public static int WAGE_PER_HOUR = 20;
        public static final int FULL_DAY_HOUR = 8;
        public static final int PART_DAY_HOUR = 4;
        public static int MAXIMUM_WORKING_HOURS_A_MONTH = 100;
        public static int WORKING_DAYS_A_MONTH = 20;
        public static Boolean absent = false;
        public static Boolean present = false;
        public static int employeeType = 0;
        public static Random random = new Random();
        public static Scanner scanner = new Scanner(System.in);
        public static void checkAttendance() {

            int attendance = random.nextInt(1);
            if (attendance == 1) {
                absent = true;
            } else {
                present = true;
            }
            System.out.println(attendance);
        }
        public static void calculateWage() {

            int daily_wage = 0;
            if (present) {
                employeeType = random.nextInt(2);
                System.out.println(employeeType);
                switch (employeeType) {
                    case 0:
                        daily_wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    case 1:
                        daily_wage = WAGE_PER_HOUR * PART_DAY_HOUR;
                }
                System.out.println( "The daily wage is " + daily_wage);
            } else {
                System.out.println("Employee is absent");
            }

            int monthly_wage = WAGE_PER_HOUR *FULL_DAY_HOUR * WORKING_DAYS_A_MONTH;
            System.out.println(monthly_wage);

             int days_worked = 1;
             int hours_worked = 1;
             int wage = 0;

            while (days_worked <= WORKING_DAYS_A_MONTH && hours_worked <= MAXIMUM_WORKING_HOURS_A_MONTH) {

                if (employeeType == 0) {
                    wage = hours_worked * WAGE_PER_HOUR;
                } else {
                    wage = hours_worked * WAGE_PER_HOUR;
                }
                hours_worked++;
                if (hours_worked >= FULL_DAY_HOUR && hours_worked % FULL_DAY_HOUR == 0) {
                    days_worked++;
                    System.out.println("The daily wage is" + wage);
                }
            }
            System.out.println("The total wage is " + wage);
            System.out.println("For " + hours_worked + " & " + days_worked);
        }

    public static void computeWageForDifferentCompanies(){
        System.out.println("Enter the company name");
        String company_name = scanner.nextLine();
        System.out.println("Enter the wage per hour");
        WAGE_PER_HOUR = scanner.nextInt();
        System.out.println("Enter the number of working days a month");
        WORKING_DAYS_A_MONTH = scanner.nextInt();
        System.out.println("Enter the number of working hours per month");
        MAXIMUM_WORKING_HOURS_A_MONTH = scanner.nextInt();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWageComputationProgram");
        computeWageForDifferentCompanies();
        checkAttendance();
        calculateWage();

    }
}
