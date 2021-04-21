package ch02;

public class VIPCustomer extends Customer{

	
	double salesRatio;
	private String agendID;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public String getAgentID() {
		return agendID;
	}
}
