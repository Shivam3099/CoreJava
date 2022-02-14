import com.rays.oop.Shape;

public class Square extends Shape1{
private int side = 0;
public Square () {}
public  Square (int i) {
	side = i;
}
public int getSide() {
	return side;
}
public void area () {
	System.out.println(side*side);
}
}

