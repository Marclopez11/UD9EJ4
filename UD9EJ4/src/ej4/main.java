package ej4;

public class main {

	public static void main(String[] args) {

		Raices r = new Raices(5,10,2);
		
		//Discriminate
		System.out.println();
		System.out.println("Get Discriminate");
		System.out.println();
		
		r.getDiscriminate();
		
		
		//Calcular
		System.out.println();
		System.out.println("Calcular");
		System.out.println();
		
		r.calcular();
		
		
		//Obtener Raices
		System.out.println();
		System.out.println("Obtener Raices");
		System.out.println();
		
		r.obtenerRaices();
		
		
		//Obtener Raiz
		System.out.println();
		System.out.println("Obtener Raiz");
		System.out.println();
		r.obtenerRaiz();
	}

}
