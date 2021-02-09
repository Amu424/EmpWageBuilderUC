public class EmpWageBuilderUC{
public static void main(String[] args){
int IS_FULL_TIME=1;
int IS_PART_TIME=2;
int WAGE_PER_HR=20;
int DAY_HRS=16;
int PART_TIME_HRS=8;
int TOTAL_WORKING_DAYS=20;
int empHrs=0;
int totalEmpWage=0;
int empWage=0;
for (int day=0;day<=TOTAL_WORKING_DAYS;day++){
int empCheck=(int)(Math.floor((Math.random()*10)%3));
//int ch=(int)empCheck;
switch (empCheck){
 			case 1:
   	empHrs=8;
					break;
			case 2:
 					empHrs=4;
						break;
default:
System.out.println("Employee is absent");
}
empWage=empHrs*WAGE_PER_HR;
totalEmpWage+=empWage;
System.out.println("Employee wage = "+empWage);
}
System.out.println("Total employee wage ="+totalEmpWage);
}
}
