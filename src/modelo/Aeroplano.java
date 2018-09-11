package modelo;

public class Aeroplano  extends Vehiculo implements Volador{

	protected String matricula;
	
	public Aeroplano(String dueno, String matricula) {
		super.dueno=dueno;
		this.matricula= matricula;
	}
	
	public String darMatricula() {
		return matricula;
	}
	@Override
	public String tomarVuelo() {
		
		return "este artefacto puede tomar vuelo"+"\n";
	}

	@Override
	public String aterrizar() {
	
		return "este artefacto volador puede aterrizar"+"\n";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "este artefacto puede volar a grandes alturas"+"\n";
	}

	@Override
	public String dardueno() {
		return  "el dueño de este vehiculo es "+ dueno+ "y la placa es "+matricula;
		
	}

	public String darDatos() {
		return dardueno()+"\n"+tomarVuelo()+volar()+aterrizar();
	}
}
