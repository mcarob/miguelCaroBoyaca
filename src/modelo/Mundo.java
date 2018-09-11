package modelo;

public class Mundo {

	
	
	private SeaPlane sea;
	private Helicoptero heli;
	private Pajaro paj;
	private Superman sup;


	public Mundo() {
		sea= new SeaPlane("avianca ", "AA45GF");
		heli= new Helicoptero("PABLITO ", " hk2967");
		paj= new Pajaro("yo hago soniditos");
		sup= new Superman("SuperMan");
	}


	public SeaPlane getSea() {
		return sea;
	}


	public void setSea(SeaPlane sea) {
		this.sea = sea;
	}


	public Helicoptero getHeli() {
		return heli;
	}


	public void setHeli(Helicoptero heli) {
		this.heli = heli;
	}


	public Pajaro getPaj() {
		return paj;
	}


	public void setPaj(Pajaro paj) {
		this.paj = paj;
	}


	public Superman getSup() {
		return sup;
	}


	public void setSup(Superman sup) {
		this.sup = sup;
	}
	
}
