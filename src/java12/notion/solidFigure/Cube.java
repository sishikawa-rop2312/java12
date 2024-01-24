package java12.notion.solidFigure;

public class Cube implements SolidFigure {
	double width;

	public Cube(double width) {
		this.width = width;
	}

	public void displayAreaInfo() {
		System.out.printf("立方体 １辺の長さ= %.2f  体積 = %.2f  表面積= %.2f%n",
				this.width,
				Math.pow(this.width, 3),
				Math.pow(this.width, 2) * 6);
	}
}