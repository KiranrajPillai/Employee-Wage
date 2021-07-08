public class EmpWagebuilderUC3 {
public static void main(String[] args) {
 	int IsPresentFullTime = 1;
 	int IsPresentPartTime = 2;
 	int WagePerHour = 20;
 	int FullTimeHour = 10;
 	int PartTimeHour = 8;
 	double empCheck=Math.floor(Math.random()*10)%3;
 	if (empCheck==IsPresentFullTime) {
 	System.out.println("DailyWage=" + WagePerHour*FullTimeHour);
 }
 	else if (empCheck==IsPresentPartTime) {
 	System.out.println("DailyWage=" + WagePerHour*PartTimeHour);
 }
 	else {
 	System.out.println("DailyWage = 0");
  }
 }
}

