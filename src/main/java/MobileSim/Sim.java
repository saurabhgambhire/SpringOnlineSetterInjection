package MobileSim;

public class Sim {
	private String company;
	private String network;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	@Override
	public String toString() {
		return "Sim [company=" + company + ", network=" + network + "]";
	}
	
	

}
