package com.bridgelabz;

public class EmployeeWages {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee wage computation program");
        final int WAGE_PER_HOUR=20;
        final int FULL_DAY_HOUR=8;
        final int HALF_DAY_HOUR=4;
        final int ABSENT=0;
        final int FULL_TIME=1;
        final int PART_TIME=2;
        final int WORKING_DAYS_PER_MONTH=20;
        final int TOTAL_WORKING_HOURS=100;
        int dailyWage=0;
        int monthlyWages=0;
        int days=1;
        int totalHours=0;
        while(days<=WORKING_DAYS_PER_MONTH && totalHours<=TOTAL_WORKING_HOURS)
        {
            int empStatus = (int)(Math.random()*3);
            System.out.println(empStatus);
            switch(empStatus)
            {
                case FULL_TIME:
                    System.out.println("Employee is present Full time");
                    dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
                    monthlyWages=monthlyWages+dailyWage;
                    totalHours=totalHours+FULL_DAY_HOUR;
                    System.out.println("Daily Wage of Employee is "+dailyWage);
                    break;
                case PART_TIME:
                    System.out.println("Employee is present Half time");
                    dailyWage=WAGE_PER_HOUR*HALF_DAY_HOUR;
                    monthlyWages=monthlyWages+dailyWage;
                    totalHours=totalHours+HALF_DAY_HOUR;
                    System.out.println("Daily Wage of Employee is "+dailyWage);
                    break;
                case ABSENT:
                    System.out.println("Employee is absent");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Day number "+days);
            days++;
        }
        System.out.println("Monthly wages of Employee "+monthlyWages);
        System.out.println("Total working hours of Employee "+totalHours);

    }

}
