package junit.tutorial;

public class StringUtils {
	public static String toSnakeCase(String src){
		
		String dst = new String();
		for( int i=0; i<src.length(); i++){
			char c = src.charAt(i);
			if( 'A' <= c && c <= 'Z' ){
				c += 32;
				if( i != 0 ){
					dst += '_';
				}
			}
			dst += c;
		}
		
		return dst;
	}
}
