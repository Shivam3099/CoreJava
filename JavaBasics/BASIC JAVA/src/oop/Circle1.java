import com.rays.oop.Shape;

public class Circle1 extends Shape1 {
  private int redius;

public int getRedius() {
	return redius;
}

public void setRedius(int redius) {
	this.redius = redius;
}

public void area(){
  System.out.println(Math.PI*redius*redius);

}


}
