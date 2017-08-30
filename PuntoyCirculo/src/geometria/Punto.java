package geometria;

public class Punto {
	private double x;
	private double y;

	public double getX() {return x;}
	public double getY() {return y;}
	public void setX(double x) {this.x = x;}
	public void setY(double y) {this.y = y;}
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distancia(Punto punto){
		return Math.sqrt(Math.pow(this.x - punto.x,2) + Math.pow(this.y - punto.y, 2));
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	

	
	
}
