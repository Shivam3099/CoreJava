package com.rays.oop;

public class AutoMobile {
      private String color = null;
      private int speed = 0;
      private String make= null;
     public static final int Gears=5;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

    public void brake(){
System.out.println("stop");


    }
}
