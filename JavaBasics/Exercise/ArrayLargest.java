package Exercise;

public class ArrayLargest {
public static void main(String[] args) {
	int[]a= {2,5,4,9,7};
 
 int b=a[0];
 for (int i : a) {

if (i>b) {
	b=i;

}
}
 System.out.println("Greter value is-" + b);
 
 
 }	
}   


