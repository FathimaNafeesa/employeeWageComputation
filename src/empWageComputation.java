import java.util.Random;

class empWageComputationMain {
    public static void main(String[] args) {
        int absent = 0;
        int present = 0;
        System.out.println("Welcome to EmployeeWageComputationProgram");
        Random random = new Random();
        int attendance = random.nextInt(1);
        if (attendance == 1) {
            absent = 1;
        } else {
            present = 1;
        }
    }

}
