package ch14;

public class TakeTaxiTest {

	public static void main(String[] args) {
		
		Student studentE = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi("�߳����� ���");
		
		studentE.takeTaxi(taxi);
		
		studentE.showInfo();
		taxi.showTaxiInfo();

	}

}
