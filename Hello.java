import java.util.*;
//import array.Array;
class Hello{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[5];
		for(int i=0;i<5;i++)
			ar[i]=sc.nextInt();
		array.Array obj=new array.Array();
		System.out.println(obj.sum(ar,5));
	}
}