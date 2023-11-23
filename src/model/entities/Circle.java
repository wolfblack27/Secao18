package model.entities;

public class Circle extends AbstractShape {

	private Double radius;

	
	public Circle(String cor, Double radius) {
		super(cor);
		this.radius = radius;
	}


	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	@Override
	public Double area() {
		
		return 2*Math.PI*getRadius();
	}



}
