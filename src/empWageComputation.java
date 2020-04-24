import java.util.Random;

class empWageComputationMain {
    public static void main(String[] args) {
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int part_day_hour = 4;
        int daily_wage = 0;
        int days_worked = 0;
        int hours_worked = 0;
        int maximum_work_hours = 100;
        int wage;

        int working_days_per_month = 20;
        int employeeType = 0;
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
        System.out.println(attendance);
        if(present){
            employeeType = random.nextInt(1);
            switch (employeeType) {
                case 0:
                    daily_wage = wage_per_hour * full_day_hour;
                case 1:
                    daily_wage = wage_per_hour * part_day_hour;
            }
            System.out.println(daily_wage);
        }
        else {
            System.out.println("Employee is absent");
        }

        int monthly_wage = daily_wage * working_days_per_month;
        System.out.println(monthly_wage);

        while (days_worked > working_days_per_month || hours_worked > maximum_work_hours) {
            if (employeeType == 0) {
                 wage = hours_worked * wage_per_hour;
            } else {
                 wage = hours_worked * wage_per_hour;
            }
                hours_worked++;
                if (hours_worked > 20 && hours_worked % 20 == 0) {
                days_worked++;
                System.out.println("The daily wage" + monthly_wage);
            }
            System.out.println(wage);
        }



    }

}
