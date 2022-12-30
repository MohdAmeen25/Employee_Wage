public class EmployeeWage_UC6 {
    public static void main(String[] args){
        final int isFullTime = 1;
        final int isPartTime = 2;
        int WagePerHour = 20;
        int MonthlyWorkingDay = 20;
        int MaxWorkingHour=100;

        int TotalWorkingHors=0;
        int WorkingHour=0;
        int TotalWage=0;


        for (int Day = 1; Day <= MonthlyWorkingDay && TotalWorkingHors < MaxWorkingHour; Day++) {
            System.out.println("------------------------------------");
            System.out.println("Day " + Day);
            int EmpCheck = ((int) (Math.random() * 10 % 3));
            System.out.println(EmpCheck);

            switch (EmpCheck) {
                case isPartTime -> {
                    System.out.println("Employee Part Time DailyWage Wage");
                    WorkingHour=4;
                }
                case isFullTime -> {
                    System.out.println("Employee Full Time DailyWage Wage ");
                    WorkingHour=8;
                }
                default -> System.out.println("Employee is absent");
            }
            int EmployeeWage=WorkingHour*WagePerHour;
            TotalWage=TotalWage+EmployeeWage;
            TotalWorkingHors=TotalWorkingHors+WorkingHour;
            System.out.println("Employee Daily wages is as per working hour " + EmployeeWage + " total working hours "+ TotalWorkingHors);
        }
        System.out.println("Wage for a month "+ TotalWage);
        }
    }
