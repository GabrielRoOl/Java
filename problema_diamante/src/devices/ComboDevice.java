package devices;

public class ComboDevice extends Device implements Scann, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Combo processing: " + doc);
	}

	@Override
	public String scan() {
		return "Combo scan result";
	}

}
