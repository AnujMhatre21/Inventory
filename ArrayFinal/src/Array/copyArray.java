package Array;

public class copyArray {
	//for int
	public static int[] copyArray(int[]old) {
		int []n=new int[old.length];
	for(int i=0;i<old.length;i++) {
		n[i]=old[i];
	}
		return n;
	}
	//======================================
	//for char
	public static char[] copyArray(char[]old) {
		char []n=new char[old.length];
	for(int i=0;i<old.length;i++) {
		n[i]=old[i];
	}
		return n;
	}
	//=========================================

}
