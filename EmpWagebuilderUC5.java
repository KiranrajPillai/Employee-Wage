public class EmpWagebuilderUC5 {
public static void main(String[] args) {
        int IsPresentFullTime = 1;
        int WorkingDays= 20;
        int WagePerHour = 20;
        double empCheck=Math.floor(Math.random()*10)%2;
         if (empCheck==IsPresentFullTime) {
        System.out.println("MonthlyWage=" + WagePerHour*WorkingDays);
 }
        else {
        System.out.println("AbsentWholeMonth = 0");
 }
}
}
