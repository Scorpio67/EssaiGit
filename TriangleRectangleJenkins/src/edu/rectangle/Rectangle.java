package edu.rectangle;

public class Rectangle {
	private int m1, m2, m3, m4;

	public Rectangle(int a, int b, int c, int d) {
		m1 = a;
		m2 = b;
		m3 = c;
		m4 = d;
	}

	public RectangleType getType() {
		if ((m1 <= 0) || (m2 <= 0) || (m3 <= 0) || (m4 <= 0) || ((m1 + m2 <= m3) || (m2 + m3 <= m1) || (m1 + m3 <= m2))
				|| (((int) m1 != m1) || ((int) m2 != m2) || ((int) m3 != m3))) {
			return RectangleType.Invalid;
		} else if ((m1 == m2) && (m2 == m3) && (m3 == m4)) {
			return RectangleType.Carre;
		} else if ((m1 == m2) || (m2 == m3) || (m3 == m4) || (m1 == m3) || (m1 == m4) || (m2 == m4)) {
			return RectangleType.Rectangle;
		} else {
			return RectangleType.Scalene;
		}
	}
}
