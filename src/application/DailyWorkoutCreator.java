package application;

public class DailyWorkoutCreator {
	
	//Private variables initialized so that they can be updated and
	//referred to later
	
	private int age = 0;
	private int weight = 0;
	private int index = 0;
	private String sex;
	
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
	
	
	/**
	 * sets the users age based on their entry 
	 * 
	 * @param ageGiven is an integer that holds the users age
	 */
	public void setAge(int ageGiven) {
		this.age = ageGiven;
	}
	
	/**
	 * sets the users weight based on their entry 
	 * 
	 * @param weightGiven is an integer that holds the users weight
	 */
	public void setWeight(int weightGiven) {
		this.weight = weightGiven;
	}
	
	/**
	 * sets the users index based on their entry 
	 * 
	 * @param indexGiven is an integer that holds the index the user is on which determines day
	 */
	public void setIndex(int indexGiven) {
		this.index = indexGiven;
	}
	
	/**
	 * sets the users sex based on their entry 
	 * 
	 * @param sexGiven is a string which hold the sex the user entered
	 */
	public void setSex(String sexGiven) {
		this.sex = sexGiven;
	}
	
	/**
	 * returns the users age based on what's currently stored
	 * 
	 * @return returns the users age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * returns the users weight based on what's currently stored
	 * 
	 * @return returns the users weight
	 */
	public int getWeight() {
		return weight;
	}
	
	/**
	 * returns the index based on what's currently stored
	 * 
	 * @return returns the value of index 
	 */
	public int getIndex() {
		return index;
	}
	
	/**
	 * returns the users sex based on what's currently stored
	 * 
	 * @return returns the users sex
	 */
	public String getSex() {
		return sex;
	}
	
	/**
	 * returns the number of base pushups based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of pushups
	 */
	public int getPushupValuesUnderThirteen(int indexGiven) {
		return pushupValuesUnderThirteen[indexGiven];
	}
	
	/**
	 * returns the number of base situps based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of situps
	 */
	public int getSitupsValuesUnderThirteen(int indexGiven) {
		return situpsValuesUnderThirteen[indexGiven];
	}
	
	/**
	 * returns the number of base squats based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of squats
	 */
	public int getSquatsValuesUnderThirteen(int indexGiven) {
		return squatsValuesUnderThirteen[indexGiven];
	}
	
	/**
	 * returns the number of base pushups based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of pushups
	 */
	public int getPushupValuesBetweenThirteenAndEighteen(int indexGiven) {
		return pushupValuesBetweenThirteenAndEighteen[indexGiven];
	}
	
	/**
	 * returns the number of base situps based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of situps
	 */
	public int getSitupsValuesBetweenThirteenAndEighteen(int indexGiven) {
		return situpsValuesBetweenThirteenAndEighteen[indexGiven];
	}
	
	/**
	 * returns the number of base squats based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of squats
	 */
	public int getSquatsValuesBetweenThirteenAndEighteen(int indexGiven) {
		return squatsValuesBetweenThirteenAndEighteen[indexGiven];
	}
	
	/**
	 * returns the number of base pushups based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of pushups
	 */
	public int getPushupValuesBetweenEighteenAndFifty(int indexGiven) {
		return pushupValuesBetweenEighteenAndFifty[indexGiven];
	}
	
	/**
	 * returns the number of base situps based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of situps
	 */
	public int getSitupsValuesBetweenEighteenAndFifty(int indexGiven) {
		return situpsValuesBetweenEighteenAndFifty[indexGiven];
	}
	
	/**
	 * returns the number of base squats based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of squats
	 */
	public int getSquatsValuesBetweenEighteenAndFifty(int indexGiven) {
		return squatsValuesBetweenEighteenAndFifty[indexGiven];
	}
	
	/**
	 * returns the number of base pushups based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of pushups
	 */
	public int getPushupValuesAboveFifty(int indexGiven) {
		return pushupValuesAboveFifty[indexGiven];
	}
	
	/**
	 * returns the number of base situps based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of situps
	 */
	public int getSitupsValuesAboveFifty(int indexGiven) {
		return situpsValuesAboveFifty[indexGiven];
	}
	
	/**
	 * returns the number of base squats based on the index provided
	 * 
	 * @param indexGiven index at the period used to determine which part of the array to take from
	 * @return returns an integer value of squats
	 */
	public int getSquatsValuesAboveFifty(int indexGiven) {
		return squatsValuesAboveFifty[indexGiven];
	}

}