import java.util.Random;

public class EmployeeWage_UC2 {
    public static void main(String[] args) {
        int isPresent=1;
        int FullDayHour = 8;
        int WagePerHour = 20;
        int DailyWage;
        Random rand = new Random();
        int x = rand.nextInt(2);
        System.out.println(x);
        if (x == isPresent) {
            System.out.println("Employee is present");
            DailyWage = WagePerHour * FullDayHour;
            System.out.println("Employee Daily Wage " + DailyWage);
        } else
            System.out.println("Employee is absent");
    }
}
