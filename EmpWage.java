package emp;

public class EmpWage {
	int IS_FULL_TIME=1;
	int IS_PART_TIME=2;
	int WAGE_PER_HR;
	int DAY_HRS=16;
	int PART_TIME_HRS=8;
	int TOTAL_WORKING_DAYS;
	int MAX_HRS_IN_MONTH;
	int empHrs=0;
	int totalEmpWage=0;
	int empWage=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	String company;
	public EmpWage(String company,int empRate,int numDay,int numHrs) {
		this.company=company;
		this.WAGE_PER_HR=empRate;
		this.TOTAL_WORKING_DAYS=numDay;
		this.MAX_HRS_IN_MONTH=numHrs;
	}
	public void wage() { 
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<=TOTAL_WORKING_DAYS){
			int empCheck=(int)(Math.floor((Math.random()*10)%3));
			//int ch=(int)empCheck;
			totalWorkingDays++;
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
			System.out.println("Employee wage = "+ empWage);
			}
			System.out.println("Total employee wage ="+company+"is" +totalEmpWage);
	}

public static void main(String[] args){
	EmpWage e=new EmpWage("Reliance",20,25,100);
      e.wage();
}

}
