package application;

public class WorkoutCreator extends UserInformation {
	
	//Private variables initialized so that they can be updated and
	//referred to later
	private int pushups = 0;
	private int situps = 0;
	private int squats = 0;
	private double[] ageMultiplierValues = {0.25, 0.17, 0.10, 0.18};
	
	
	
	/**
	 * Constructor for WeeklyWorkoutCreator used to setup everything whenever the method is called upon
	 * 
	 * @param ageGiven value of age user had previously entered
	 * @param weightGiven value of weight user had previously entered
	 * @param indexGiven value of index to determine the day
	 * @param weightGiven the users entered sex 
	 */
	public WorkoutCreator(int ageGiven, int weightGiven, int indexGiven, String sexGiven) {
		//Stores the values for age and weight
		this.setAge(ageGiven);
		this.setWeight(weightGiven);
		this.setIndex(indexGiven);
		this.setSex(sexGiven);
		
		workoutMaker();
	}
	
	/**
	 * Calculates a work out for Sunday based on age, weight, and sex 
	 */
	private void workoutMaker() {
		//Checks to see the age range, and calculates number of pushups
		//situps and squats to do based on weight and sex
		int weight = this.getWeight();
		int age = this.getAge();
		int index = this.getIndex();
		String sex = this.getSex();
		if (sex.equals("Female")) {
			if (index == 0) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
			}
		
			if (index == 1) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
			}
		
			if (index == 2) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
			}
		
			if (index == 3) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
			}
		
			if (index == 4) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
			}
		
			if (index == 5) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
			}
		
			if (index == 6) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
					
					pushups = (int) (pushups * 0.90);
					situps = (int) (situps * 0.90);
					squats = (int) (squats * 0.90);
				}
			}
		}
		
		
		if (sex.equals("Male")) {
			if (index == 0) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
				}
			}
		
			if (index == 1) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
				}
			}
		
			if (index == 2) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
				}
			}
		
			if (index == 3) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
				}
			}
		
			if (index == 4) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
				}
			}
		
			if (index == 5) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
				}
			}
		
			if (index == 6) {
				if (age < 13) {
					pushups = (int) (weight * ageMultiplierValues[0] * this.getPushupValuesUnderThirteen(index));
					situps = (int) (weight * ageMultiplierValues[0] * this.getSitupsValuesUnderThirteen(index));
					squats = (int) (weight * ageMultiplierValues[0] * this.getSquatsValuesUnderThirteen(index));
				}
				if (age >= 13 && age < 18) {
					pushups = (int) (weight * ageMultiplierValues[1] * this.getPushupValuesBetweenThirteenAndEighteen(index));
					situps = (int) (weight * ageMultiplierValues[1] * this.getSitupsValuesBetweenThirteenAndEighteen(index));
					squats = (int) (weight * ageMultiplierValues[1] * this.getSquatsValuesBetweenThirteenAndEighteen(index));
				}
				if (age >= 18 && age < 50) {
					pushups = (int) (weight * ageMultiplierValues[2] * this.getPushupValuesBetweenEighteenAndFifty(index));
					situps = (int) (weight * ageMultiplierValues[2] * this.getSitupsValuesBetweenEighteenAndFifty(index));
					squats = (int) (weight * ageMultiplierValues[2] * this.getSquatsValuesBetweenEighteenAndFifty(index));
				}
				if (age >= 50) {
					pushups = (int) (weight * ageMultiplierValues[3] * this.getPushupValuesAboveFifty(index));
					situps = (int) (weight * ageMultiplierValues[3] * this.getSitupsValuesAboveFifty(index));
					squats = (int) (weight * ageMultiplierValues[3] * this.getSquatsValuesAboveFifty(index));
				}
			}
		}
	}
	
	/**
	 * returns values of pushups the user needs to do 
	 * 
	 * @return returns the numbers of pushups the user needs to do
	 */
	public int returnPushups() {
		return pushups;
	}
	
	/**
	 * returns values of situps the user needs to do 
	 * 
	 * @return returns the numbers of situps the user needs to do
	 */
	public int returnSitups() {
		return situps;
	}
	
	/**
	 * returns values of squats the user needs to do
	 * 
	 *  @return returns the numbers of squats the user needs to do
	 */
	public int returnSquats() {
		return squats;
	}
}
	
