package application;

public class DailyWorkoutCreator {
	
	//Private variables initialized so that they can be updated and
	//referred to later
	
	private int age = 0;
	private int weight = 0;
	private int index = 0;
	
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

}