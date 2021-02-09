public class EmpWageBuilderUC{
public static void main(String[] args){
int IS_FULL_TIME=1;
int IS_PART_TIME=2;
int WAGE_PER_HR=20;
int DAY_HRS=16;
int PART_TIME_HRS=8;
double empCheck=Math.floor((Math.random()*10)%3);
int ch=(int)empCheck;
switch (ch){
 			case 1:
   	System.out.println("Employee is full time wage is"+DAY_HRS*WAGE_PER_HR);
					break;
			case 2:
 System.out.println("Employee is part time and wage is "+PART_TIME_HRS*WAGE_PER_HR);
						break;
default:
System.out.println("Employee is absent");
}
}
}
