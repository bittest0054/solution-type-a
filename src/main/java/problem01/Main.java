package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 1000; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		String s=String.valueOf(number);
		
		int stack=0;
		
		for(int i=0;i<s.length();i++) {
			int num=s.charAt(i)-'0';
			
			if(s.charAt(i)%3==0 && s.charAt(i)!='0')
				stack++;
		}
			
		return stack;
	}
}