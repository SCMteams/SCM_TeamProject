public class Display {
	private String name;
	private Double commission;
	public Display(String name, double commission){
		this.name = name;
		this.commission = commission;
	}
	public void getDisplay(){
		System.out.print("Employee name : " + name + " Compensation received : " + commission);
	}
}
