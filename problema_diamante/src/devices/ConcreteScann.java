package devices;

public class ConcreteScann  extends Device implements Scann{

	public ConcreteScann(String serialNumber) {
		super(serialNumber);
	}


	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	@Override
	public String scan() {
		return "Scanned contend";
				
	}
	
}
