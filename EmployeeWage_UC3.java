public class EmployeeWage_UC3 {
    public static void main(String[] args) {
        int isFullTime=1;
        int isPartTime=2;
        int FullDayHour = 8;
        int PartTimeHour=4;
        int WagePerHour = 20;
        int DailyWage;
        int EmpCheck=((int)(Math.random()*10%3));
        System.out.println(EmpCheck);

        if (EmpCheck == isFullTime) {
            DailyWage = WagePerHour * FullDayHour;
            System.out.println("Employee Full Time Daily Wage " + DailyWage);
        }
        else if(EmpCheck==isPartTime){
            DailyWage = WagePerHour * PartTimeHour;
            System.out.println("Employee Part Time Daily Wage " + DailyWage);
        }
        else
            System.out.println("Employee is absent");
    }
}
