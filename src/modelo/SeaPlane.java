package modelo;

public class SeaPlane extends Aeroplano {

	public String avistarAnimal;
	
	
	public SeaPlane(String dueno, String matricula) {
		super(dueno, matricula);
		avistarAnimal="ballenas";
		
	}

	public String darDatos() {
	return	super.darDatos()+"ademas si estas con suerte en este aeroplano podras avistar  "+avistarAnimal;
	}


	
}
