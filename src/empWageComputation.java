import java.util.Random;

class empWageComputationMain {
    public static void main(String[] args) {
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int part_day_hour = 4;
        int daily_wage = 0;

        int working_days_per_month = 20;
        int employeeType;
        Boolean absent = false;
        Boolean present = false;
        System.out.println("Welcome to EmployeeWageComputationProgram");
        Random random = new Random();
        int attendance = random.nextInt(1);
        if (attendance == 1) {
            absent = true;
        } else {
            present = true;
        }
        if(present){
            employeeType = random.nextInt(1);
            switch (employeeType) {
                case 0:
                    daily_wage = wage_per_hour * full_day_hour;
                case 1:
                    daily_wage = wage_per_hour * part_day_hour;
            }
        }
        else {
            System.out.println("Employee is absent");
        }

        int monthly_wage = daily_wage * working_days_per_month;




    }

}
