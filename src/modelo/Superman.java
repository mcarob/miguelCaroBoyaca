package modelo;

public class Superman extends Kryptoniano implements Volador {

	private String nombre;
	
	
	public Superman(String nombre) {
		this.nombre=nombre;
	}
	@Override
	public String tomarVuelo() {
		String respuesta= "hola soy "+nombre+ " y yo tomo vuelo"+"\n";
		return respuesta;
	}

	@Override
	public String aterrizar() {
		String respuesta= "hola soy super man y yo puedo aterrizar"+"\n";
		return respuesta;
	}

	@Override
	public String volar() {
		String respuesta= "hola soy super man y yo puedo volar"+"\n";
		return respuesta;
	}

	public String saltarEdificio() {
		return "hola soy "+ nombre+" y yo puedo saltar edificios"+"\n";
	}
	public String pararBalas() {
		return  "soy "+ nombre+" y yo puedo parar balas"+"\n";
	}
	@Override
	public String vulnerable() {
		return "soy Criptoniano y soy vulerabe a la criptonita"+"\n";
	}
	@Override
	public String comer() {
		return "soy superman y voy a ir a comer"+"\n";
		
	}
	public String darDatos() {
		return "mi nombre es "+ nombre +"."+"\n"+tomarVuelo()+aterrizar()+ volar()+saltarEdificio()+pararBalas()
		+vulnerable()+comer();
	}
}
