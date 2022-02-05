package String;

public class Stringcount {
     public static void main(String[] args) {
		String s="shivaaaaaaam";
		int Count=0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)!=' ')
			Count++;
		}
			System.out.println(Count);
		
	}

}