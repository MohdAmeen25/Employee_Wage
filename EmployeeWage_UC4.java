public class EmployeeWage_UC4 {
    public static void main(String[] args) {
        final int isFullTime=1;
        final int isPartTime=2;
        int FullDayHour = 8;
        int PartTimeHour=4;
        int WagePerHour = 20;
        int DailyWage;
        int EmpCheck=((int)(Math.random()*10%3));
        System.out.println(EmpCheck);

        switch (EmpCheck) {
            case isPartTime -> {
                DailyWage = WagePerHour * PartTimeHour;
                System.out.println("Employee Part Time Daily Wage " + DailyWage);
            }
            case isFullTime -> {
                DailyWage = WagePerHour * FullDayHour;
                System.out.println("Employee Full Time Daily Wage " + DailyWage);
            }
            default -> System.out.println("Employee is absent");
        }
    }
}