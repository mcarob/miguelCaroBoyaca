package modelo;

public class Helicoptero  extends Aeroplano{

	private String lugar;
	
	public Helicoptero(String dueno, String matricula) {
		super(dueno, matricula);
		lugar=" este helicoptero se encontraba en la finca de alvarito como raro...";
	}
	public String darDatos() {
		return super.darDatos()+lugar;
	}
	
	
	

}
