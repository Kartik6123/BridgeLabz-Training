public class Meal<T extends MealPlan> {
	private T meal;
	public Meal(T meal) {
		this.meal = meal;
	}
	
	public T getMealPlan() {
		return meal;
	}
}