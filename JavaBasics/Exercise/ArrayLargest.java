package Exercise;

public class ArrayLargest {
public static void main(String[] args) {
	int[]a= {10,20,30,35,49,15};
 
 int b=a[0];
 for (int i : a) {

if (i>b) {
	b=i;}
System.out.println("greater value is-:"+ i );

}
 }	
}   


