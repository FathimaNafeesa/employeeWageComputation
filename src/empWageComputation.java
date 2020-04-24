import java.util.Random;

class empWageComputationMain {
    public static void main(String[] args) {
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int daily_wage = 0;
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
            daily_wage = wage_per_hour * full_day_hour;
        }


    }

}
