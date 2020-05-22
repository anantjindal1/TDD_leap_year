import org.junit.Test;
import org.junit.Before;

public class TestLeapYear {

		private LeapYear leapYear;

		@Before
		public void setUp() throws Exception {
			leapYear = new LeapYear();
		}

		//All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
		@Test
		public void yr2000ShouldBeLeap() {
			boolean isLeap = leapYear.isLeap(2000);
			assertTrue(isLeap);
		}


}
