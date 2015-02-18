public class ArryCopyDemo {
	
	public static void main(String[] args) {

	       char[] a1 = {'c', 'h', 'a', 'r', 's'};
	       char[] a2 = new char[4];
	       System.arraycopy(a1, 0, a2, 0, 4);
	       System.out.println(new String(a2));
	       System.out.println(a2);
	}
}