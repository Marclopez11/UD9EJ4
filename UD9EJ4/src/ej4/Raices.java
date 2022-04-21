package ej4;

public class Raices {

	private double a;
	private double b;
	private double c;

	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminate() {
		
	    double discriminante = (Math.pow(b, 2) - (4 * a * c));

		return discriminante;

	}

	public boolean tieneRaices() {

		boolean tieneraices = false;

		if (getDiscriminate() >= 0) {

			tieneraices = true;
		}
		return tieneraices;

	}

	public boolean tieneRaiz() {

		boolean tieneraices = false;

		if (getDiscriminate() == 0) {

			tieneraices = true;
		}
		return tieneraices;

	}

	public void calcular() {
		
		//prinera solucion
		if (getDiscriminate()>0)
        {
            double x1=(-b+Math.sqrt(getDiscriminate()))/(2*a);
            double x2=(-b-Math.sqrt(getDiscriminate()))/(2*a);
            System.out.println("Hay dos números reales: x1 ="+x1+"x2="+x2);
        }
        else if (getDiscriminate()==0)
        {
            double x1 = -b/(2*a);
            System.out.println("La ecuación tiene solo una raíz real, x1 = x2 ="+x1);
        }
        else if (getDiscriminate()<0)
        {
            System.out.println("Ecuaciones sin raíces reales");
        }

	}

	public void obtenerRaices() {
		
		
		if(tieneRaices()){
	          System.out.println("Tiene raices imaginarias");
	          }else{
		            double x1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		            double x2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	          System.out.println("X1 = "+x1+" X2 = "+x2);
	        }     

	}

	public void obtenerRaiz() {
		
		if(tieneRaiz()){
	          System.out.println("Tiene raices imaginarias");
	          }else{
		            double x1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		            double x2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	          System.out.println("X1 = "+x1+" X2 = "+x2);
	        }    

	}

}
