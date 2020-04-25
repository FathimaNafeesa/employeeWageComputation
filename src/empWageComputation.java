import java.util.Random;

class empWageComputationMain {

        public static final int WAGE_PER_HOUR = 20;
        public static final int FULL_DAY_HOUR = 8;
        public static final int PART_DAY_HOUR = 4;
        public static final int MAXIMUM_WORKING_HOURS_A_MONTH = 100;
        public static final int WORKING_DAYS_A_MONTH = 20;
        public static Boolean absent = false;
        public static Boolean present = false;
        public static int employeeType = 0;
        public static Random random = new Random();

        public static void checkAttendance() {

            int attendance = random.nextInt(1);
            if (attendance == 1) {
                absent = true;
            } else {
                present = true;
            }
            System.out.println(attendance);
        }
        public static void calculateDailyWage() {

            int daily_wage = 0;
            if (present) {
                employeeType = random.nextInt(1);
                switch (employeeType) {
                    case 0:
                        daily_wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    case 1:
                        daily_wage = WAGE_PER_HOUR * PART_DAY_HOUR;
                }
                System.out.println(daily_wage);
            } else {
                System.out.println("Employee is absent");
            }
        }
        public static void calculateMonthlyWage() {
            int monthly_wage = WAGE_PER_HOUR *FULL_DAY_HOUR * WORKING_DAYS_A_MONTH;
            System.out.println(monthly_wage);
        }
        public static void calculateWageUnderCondition() {
             int days_worked = 0;
             int hours_worked = 0;
             int wage;

            while (days_worked > WORKING_DAYS_A_MONTH || hours_worked > MAXIMUM_WORKING_HOURS_A_MONTH) {
                if (employeeType == 0) {
                    wage = hours_worked * WAGE_PER_HOUR;
                } else {
                    wage = hours_worked * WAGE_PER_HOUR;
                }
                hours_worked++;
                if (hours_worked > 20 && hours_worked % 20 == 0) {
                    days_worked++;
                    System.out.println("The daily wage" + wage);
                }
                System.out.println(wage);
            }
        }

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWageComputationProgram");
        checkAttendance();
        calculateDailyWage();
        calculateMonthlyWage();
        calculateWageUnderCondition();

    }



    }

}
