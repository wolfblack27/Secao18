package model.entities;

public class Rectangle extends AbstractShape {

	private Double width;
	private Double heigth;
	
	public Rectangle(String cor, Double width, Double heigth) {
		super(cor);
		this.width = width;
		this.heigth = heigth;
		
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}

	
	@Override
	public Double area() {
		return getHeigth()*getWidth();
	}

	
	
	
	
}
