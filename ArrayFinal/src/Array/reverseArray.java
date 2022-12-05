package Array;
public class reverseArray {
	//for int 
	public static int[] reverseArray(int[]old) {
		int []a=new int[old.length];
		int i=0,j=old.length-1;
		while (i<old.length)
		{
			a[i++]=old[j--];
		}
		return a;
	}
	public static char[] reverseArray(char[]old) {
		char []a=new char[old.length];
		int i=0,j=old.length-1;
		while (i<old.length)
		{
			a[i++]=old[j--];
		}
		return a;
	}

}
