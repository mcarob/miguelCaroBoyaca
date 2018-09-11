package controlador;

import modelo.Mundo;
import vista.Vista;

public class Principal {
 
	Mundo m;
	Vista v;
	
	public Principal() {
		m = new Mundo();
		v= new Vista();
		v.darDatosSea(m.getSup().darDatos(),"SUPERMAN");
		v.darDatosSea(m.getHeli().darDatos(),"HELICOPTERO");
		v.darDatosSea(m.getSea().darDatos(),"SEAPLANE");
		v.darDatosSea(m.getPaj().darDatos(),"PAJARO");
//		v.darDatosHeli();
//		v.darDatosPajaro();
//		v.darDatosSuper();
	}
}
