package junit.tutorial.Date;

import java.util.Date;
import static org.junit.Assert.*;
import static junit.tutorial.Date.IsDate.*;
import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void compareDate() throws Exception {
		Date date = new Date();
		assertThat(date, is(dateOf(2011,12,30)));
	}
}
