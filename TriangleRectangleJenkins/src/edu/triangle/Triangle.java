package edu.triangle;

public class Triangle {

	private int l1, l2, l3;

	public Triangle(int a, int b, int c) {
		l1 = a;
		l2 = b;
		l3 = c;
	}

	public TriangleType getType() {
		if ((l1 <= 0) || (l2 <= 0) || (l3 <= 0) || ((l1 + l2 <= l3) || (l2 + l3 <= l1) || (l1 + l3 <= l2))
				|| (((int) l1 != l1) || ((int) l2 != l2) || ((int) l3 != l3))) {
			return TriangleType.Invalid;
		} else if (((l1 * l1) == (l2 * l2) + (l3 * l3)) || ((l2 * l2) == (l1 * l1) + (l3 * l3))
				|| ((l3 * l3) == (l2 * l2) + (l1 * l1))) {
			return TriangleType.Rectangle;
		} else if ((l1 == l2) && (l2 == l3)) {
			return TriangleType.Equilateral;
		} else if ((l1 == l2) || (l2 == l3) || (l1 == l3)) {
			return TriangleType.Isoceles;
		} else {
			return TriangleType.Scalene;
		}
	}

}
