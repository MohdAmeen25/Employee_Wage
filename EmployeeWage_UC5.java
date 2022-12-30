public class EmployeeWage_UC5 {
    public static void main(String[] args) {
        final int isFullTime = 1;
        final int isPartTime = 2;
        int FullDayHour = 8;
        int PartTimeHour = 4;
        int WagePerHour = 20;
        int MonthlyWorkingDay = 20;
        int MonthlyWage;

            int EmpCheck = ((int) (Math.random() * 10 % 3));
            switch (EmpCheck) {
                case isPartTime -> {
                    MonthlyWage = (WagePerHour * PartTimeHour)*MonthlyWorkingDay;
                    System.out.println("Employee Part Time Monthly Wage " + MonthlyWage);
                }
                case isFullTime -> {
                    MonthlyWage = (WagePerHour * FullDayHour*MonthlyWorkingDay);
                    System.out.println("Employee Full Time Monthly Wage " + MonthlyWage);
                }
                default -> System.out.println("Employee is absent");
            }
        }
    }
