public class EmpWageBuilderUC{
public static void main(String[] args){
int IS_FULL_TIME=1;
int IS_PART_TIME=2;
int WAGE_PER_HR=20;
int DAY_HRS=16;
int PART_TIME_HRS=8;
double empCheck=Math.floor(Math.random()*10)%3;
if (empCheck==IS_FULL_TIME)
{
System.out.println("Employee is present");
System.out.println("Employee Daily wage is" + WAGE_PER_HR*DAY_HRS );
}
else if(empCheck==IS_PART_TIME)
{
System.out.println("Employee is part time"+WAGE_PER_HR*PART_TIME_HRS);
}
else {
System.out.println("Employee is Absent");
}
}
}
