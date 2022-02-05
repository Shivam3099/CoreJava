package Exercise;

public class PalindromNo {
public static void main(String[] args) {
	int r,sum=0;
	int n = 2245422;
	int p = n;
	   
	while (n>0) {
		r=n%10;
	sum = (sum*10)+r;
	
	n=n/10;
}	

if (p==sum) {
	System.out.println("no. is palindrom");
}else {
    System.out.println("no. is not palindrom");


}
}
}
