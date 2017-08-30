package geometria;

public class Main {

	public static void main(String[] args) {
	
	Punto puntito = new Punto(1d,4d);
	Circulo circulito = new Circulo(new Punto(1d,2d), 3d);
	
	if(circulito.perteneceAlCirculo(puntito))
		System.out.println("El punto " + puntito.toString() + " pertenece al circulo.");
	else
		System.out.println("El punto " + puntito.toString() + " no pertenece al circulo.");
	
	}

}
