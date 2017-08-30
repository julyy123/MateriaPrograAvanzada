package geometria;

public class Circulo {
	private Punto centro;
	private double radio;
	
	public Punto getPunto() {return centro;}
	public void setPunto(Punto punto) {this.centro = punto;}
	public double getRadio() {return radio;}
	public void setRadio(double radio) {this.radio = radio;}

	public Circulo(Punto punto, double radio) {
		this.centro = punto;
		this.radio = Math.abs(radio);
	}
	
	public boolean perteneceAlCirculo(Punto punto){
		return this.centro.distancia(punto) <= this.radio;
	}

}
