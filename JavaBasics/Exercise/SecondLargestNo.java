package Exercise;

public class SecondLargestNo {
public static void main(String[] args) {
	int[]num = {2,4,6,8,9,14,4};
	int c = 0 ;
	int b = num [0];
	
	for(int i : num) {
		
	if (i > b) {
		
		c=b;
		b=i;
		System.out.println(c);
	}else if(i>c){	
	
	c=i;
}
}
     System.out.println("Secound largest no is - " + c);

}
}
