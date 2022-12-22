import java.util.Random;

public class EmployeeWage_UC1 {
    public static void main(String[] args) {
        Random rand=new Random();
        int x= rand.nextInt(2);
        System.out.println(x);
        if (x == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }

}
