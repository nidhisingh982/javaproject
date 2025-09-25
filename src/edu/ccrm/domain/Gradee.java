package edu.ccrm.domain;
public enum Gradee {
	S(10), A(9), B(8), C(7), D(6), F(0);
    private final int points;
    Gradee(int points) { this.points = points; }
    public int getPoints() {
    	return points; }
}

