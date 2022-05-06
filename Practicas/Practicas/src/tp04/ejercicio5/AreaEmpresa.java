package tp04.ejercicio5;

public class AreaEmpresa {
	private String area;
	private int tardanzaTransmision;
	
	public AreaEmpresa(int tardanzaTransmision, String area) {
		this.area = area;
		this.tardanzaTransmision = tardanzaTransmision;
	}

	public String getArea() {
		return area;
	}
	
	
	public void setArea(String area) {
		this.area = area;
	}
	public int getTardanzaTransmision() {
		return tardanzaTransmision;
	}
	public void setTardanzaTransmision(int tardanzaTransmision) {
		this.tardanzaTransmision = tardanzaTransmision;
	}
	
	
}
