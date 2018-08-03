package com.spring.aop.service;

import com.spring.aop.model.Circle;
import com.spring.aop.model.Square;

public class ShapeService {
	private Circle circle;
	private Square square;
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Square getSquare() {
		return square;
	}
	public void setSquare(Square square) {
		this.square = square;
	}
	

}
