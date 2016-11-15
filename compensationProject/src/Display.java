public class Display {
	private String name;
	private Double turnOver;
	public Display(String name, double turnOver){
		this.name = name;
		this.turnOver = turnOver;
	}
	public void getDisplay(){
		System.out.print("Employee name : " + name + " Compensation received : " + turnOver);
	}
}
