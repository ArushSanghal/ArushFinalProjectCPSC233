package application;

public class DailyWorkoutCreator {
	
	//Private variables initialized so that they can be updated and
	//referred to later
	
	private int age = 0;
	private int weight = 0;
	private int index = 0;
	
	private int[] pushupValuesUnderThirteen = {2, 1, 3, 1, 2, 2, 2};
	private int[] situpsValuesUnderThirteen = {3, 2, 4, 2, 4, 1, 3};
	private int[] squatsValuesUnderThirteen = {4, 3, 5, 3, 4, 2, 4};
	
	private int[] pushupValuesBetweenThirteenAndEighteen = {3, 2, 4, 2, 3, 3, 3};
	private int[] situpsValuesBetweenThirteenAndEighteen = {5, 4, 6, 4, 5, 3, 5};
	private int[] squatsValuesBetweenThirteenAndEighteen = {7, 6, 8, 6, 7, 5, 7};
	
	private int[] pushupValuesBetweenEighteenAndFifty = {4, 3, 5, 3, 4, 4, 4};
	private int[] situpsValuesBetweenEighteenAndFifty = {6, 5, 7, 5, 7, 4, 6};
	private int[] squatsValuesBetweenEighteenAndFifty = {8, 7, 9, 7, 8, 6, 8};
	
	private int[] pushupValuesAboveFifty = {2, 1, 3, 1, 2, 2, 2};
	private int[] situpsValuesAboveFifty = {3, 2, 4, 2, 4, 1, 3};
	private int[] squatsValuesAboveFifty = {4, 3, 5, 3, 4, 2, 4};
	
	public void setAge(int ageGiven) {
		this.age = ageGiven;
	}
	
	public void setWeight(int weightGiven) {
		this.weight = weightGiven;
	}
	
	public void setIndex(int indexGiven) {
		this.index = indexGiven;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getPushupValuesUnderThirteen(int indexGiven) {
		return pushupValuesUnderThirteen[indexGiven];
	}
	
	public int getSitupsValuesUnderThirteen(int indexGiven) {
		return situpsValuesUnderThirteen[indexGiven];
	}
	
	public int getSquatsValuesUnderThirteen(int indexGiven) {
		return squatsValuesUnderThirteen[indexGiven];
	}
	
	public int getPushupValuesBetweenThirteenAndEighteen(int indexGiven) {
		return pushupValuesBetweenThirteenAndEighteen[indexGiven];
	}
	
	public int getSitupsValuesBetweenThirteenAndEighteen(int indexGiven) {
		return situpsValuesBetweenThirteenAndEighteen[indexGiven];
	}
	
	public int getSquatsValuesBetweenThirteenAndEighteen(int indexGiven) {
		return squatsValuesBetweenThirteenAndEighteen[indexGiven];
	}
	
	public int getPushupValuesBetweenEighteenAndFifty(int indexGiven) {
		return pushupValuesBetweenEighteenAndFifty[indexGiven];
	}
	
	public int getSitupsValuesBetweenEighteenAndFifty(int indexGiven) {
		return situpsValuesBetweenEighteenAndFifty[indexGiven];
	}
	
	public int getSquatsValuesBetweenEighteenAndFifty(int indexGiven) {
		return squatsValuesBetweenEighteenAndFifty[indexGiven];
	}
	
	public int getPushupValuesAboveFifty(int indexGiven) {
		return pushupValuesAboveFifty[indexGiven];
	}
	
	public int getSitupsValuesAboveFifty(int indexGiven) {
		return situpsValuesAboveFifty[indexGiven];
	}
	
	public int getSquatsValuesAboveFifty(int indexGiven) {
		return squatsValuesAboveFifty[indexGiven];
	}

}