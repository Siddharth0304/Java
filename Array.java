package array;
public class Array{
	public int sum(int ar[],int n){
		int s=0;
		for(int i=0;i<n;i++)
			s+=ar[i];
		return s;
	}
}