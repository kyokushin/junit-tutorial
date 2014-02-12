package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void convert_aaa_to_aaa() {
		String expected = "aaa";
		String actual = StringUtils.toSnakeCase("aaa");
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void convert_HelloWorld_to_hello_world(){
		String expected = "hello_world";
		String actual = StringUtils.toSnakeCase("HelloWorld");
		
		assertThat(actual, is(expected));
	}

	@Test
	public void convert_practiceJunit_to_practice_junit(){
		String expected = "practice_junit";
		String actual = StringUtils.toSnakeCase("practiceJunit");
		
		assertThat(actual, is(expected));
	}
}
