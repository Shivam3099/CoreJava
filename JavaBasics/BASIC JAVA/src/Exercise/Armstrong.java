package Exercise;

public class Armstrong {

	public static void main(String[] args) {

	int n = 153;
	
	int s = 0;
	
	int k=n;
	
	int c;
	
	while(k!= 0) {
	
	c = k % 10;
	
	s = s +(c * c * c);

	k = k / 10 ;
	}
	if (n == s) {
		System.out.println( "its arm strong no.");
	}else
	System.out.println( " not a arm stong no." );
	
	}
}
