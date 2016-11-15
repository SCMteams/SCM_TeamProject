public class Calculate {
	private Double salary;
	private Double  turnOver;
	private Double commission;
	public Calculate(Double salary,Double turnOver){
		this.salary = salary;
		this.turnOver = turnOver;
	}
	public void setSalary(Double salary){
		this.salary = salary;
	}
	public Double getSalary(){
		return salary; 
	}
	public void setturnOver(Double turnOver){
		this.turnOver = turnOver;
	}
	public Double getturnOver(){
		return turnOver; 
	}
	public Double getCommission(){
		if( turnOver >= 1 && turnOver <= 50000){
			commission  = salary + (turnOver*0.01) ;
		}else if(turnOver >= 50001 && turnOver <= 100000){
			commission  = salary + (turnOver*0.02) ;
		}else if(turnOver > 100001){
			commission  = salary + (turnOver*0.03) ;
		}else{
			commission = salary;
		}
		return commission;
	}		
}