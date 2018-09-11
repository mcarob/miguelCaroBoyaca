package modelo;

public class Pajaro  extends Animal implements Volador{

	private String sonidos;
	
	
	public Pajaro(String Sonidos) {
	sonidos=Sonidos;
	}
	@Override
	public String comer() {
		return "soy un pajaro y para dejar aca este programa ire a comer";
		
	}
	public String darSonidos() {
		return sonidos;
	}

	@Override
	public String tomarVuelo() {
		
		return "soy un pajaro y yo puedo tomar vuelo"+"\n";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "soy un pajaro y yo puedo  aterrizar"+"\n";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "soy un pajaro y yo puedo volar"+"\n";
	}
	public String costruirNido() {
		return "para protejerme yo construyo nidos, ademas ahi puedo  "+ dejarHuevos()+"\n";
	}
	private String dejarHuevos() {
		// TODO Auto-generated method stub
		return "dejar Huevos";
	}
	public String darDatos() {
		return "hola soy un pajarito y "+sonidos+"\n"+tomarVuelo()+aterrizar()+volar()+costruirNido()+comer();
	}
	

}
