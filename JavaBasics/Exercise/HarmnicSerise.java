package Exercise;

public class HarmnicSerise {
public static void main(String[] args) {
	
	int n = 10;
	double d = 0.0;
	/*while (n > 0) {
		d = d +(double) 1/n;
	n--;
System.out.println(d);	
	}*/

for (int i= n; i>0; i--) {
	d = d +(double) 1/i;

System.out.println(d+",");

}
}
}