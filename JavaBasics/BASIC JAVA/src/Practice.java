import javax.print.attribute.IntegerSyntax;

public class Practice {
public static void main(String[] args) throws Exception {
    int i=8;
	String s=String.valueOf(i);
	System.out.println(s+8);
	System.out.println(i+8);
	
	
	
	int d=Integer.parseInt(args[0]);
	int e=Integer.parseInt(args[1]);
	int a= d+e;
	System.out.println("SUM of"+"="+a);
	
	
	int [][] table =new int[6][6];
	table[0] = new int [10];
	table[1] = new int [9];
	table[2] =  new int[8];
	table[3] =  new int[7];
	table[4] =  new int[6];
	int[][][] xyz = new int[10][34][5];
	System.out.println(" "+table.length+xyz);
	
	
}	
}
