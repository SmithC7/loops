public class DrugPotency {
	public static void main(String[] args) {
		drugPotency();
	}
	public static void drugPotency(){
		int month=1;
		double effectiveness=100.0;
		double effectivenessOut;
		double allowedAmount=50.0;

		System.out.println("Enter the effectiveness: ");
		while(effectiveness>=allowedAmount){
			month++;
			effectivenessOut=effectiveness*(.04);
			System.out.println("Month: "+month+"\nEffectiveness:"+effectivenessOut);
		}
	}
}		