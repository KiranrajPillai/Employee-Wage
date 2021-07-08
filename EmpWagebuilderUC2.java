public class EmpWagebuilderUC2 {
public static void main(String[] args) {
 	int empPresent=1;
 	int WagePerHour=20;
 	int FullDayHour=8;
 	double empCheck=Math.floor(Math.random()*10)%2;
 	int DailyEmployeeWage;
 	DailyEmployeeWage= WagePerHour*FullDayHour;
 	if (empPresent==empCheck) {
 	System.out.println("DailyEmployeeWage =" + DailyEmployeeWage);
 }
 	else{
 	 System.out.println("DailyEmployeeWage =0");
 	}
    }
}
