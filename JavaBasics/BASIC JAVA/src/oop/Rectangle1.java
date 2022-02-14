
public class Rectangle1 extends Shape1 {
private int length = 0; 
private int width = 0;
public Rectangle1() {}
public Rectangle1(int i,int j) {
	length = i;
	width = j;
}

public void area() {
	System.out.println(length*width);
	
}
}
