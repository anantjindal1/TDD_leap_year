public class LeapYear {

  public LeapYear(){

  }

  public boolean isLeap(int year) {
		boolean result = isMultipleOf(year,400)||(!isMultipleOf(year,100)&&isMultipleOf(year,4));
		return result;
	}

  private boolean isMultipleOf(int num, int base) {
		return ((num % base) == 0);
	}
}
