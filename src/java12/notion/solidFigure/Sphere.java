package java12.notion.solidFigure;

public class Sphere implements SolidFigure {
	double r;

	public Sphere(double r) {
		this.r = r;
	}

	@Override
	public void displayAreaInfo() {
		System.out.printf("球 半径= %.2f  体積 = %.2f  表面積= %.2f%n",
				this.r,
				4 * Math.PI * Math.pow(this.r, 3) / 3,
				4 * Math.PI * Math.pow(this.r, 2));
	}
}
