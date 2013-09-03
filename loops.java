public class loops{
	public static void main(String[] args) {
		String s="My String";
		int length=findLength(s);
		System.out.println(length);


		// int x=1;

		// while(x<=100){
		// 	System.out.println(x);
		// 	x++;

		// }
		// for(int i=1; i<=100; i++){
		// 	System.out.println(i);
		// }
	
		// int a=45;
		// while(a>=20){
		// 	System.out.println(a);
		// 	a-=5;
		// }
		// for (int i=24; i<=68; i+=2) {
		// 	System.out.println(i);
		// }
	}

	//return the length of str, assume no length method built
	//into string
	public static int findLength(String str){
		int len=0
		for (int i=0; i<str.length(); i++) {
			len++;
		}
		return len;
	}
}