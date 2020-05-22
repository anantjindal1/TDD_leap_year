import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


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

		//All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
		@Test
		public void yr1800ShouldNotBeLeap() {
			boolean isLeap = leapYear.isLeap(1800);
			assertFalse(isLeap);
		}


		//All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
		@Test
		public void yr2008ShouldBeLeap() {
			boolean isLeap = leapYear.isLeap(2008);
			assertTrue(isLeap);
		}


		//All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
		@Test
		public void yr2017ShouldNotBeLeap() {
			boolean isLeap = leapYear.isLeap(2017);
			assertFalse(isLeap);
		}


}
