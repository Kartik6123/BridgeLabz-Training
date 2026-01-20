 
public class MealPlanGenerator {
	public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {

        if (mealPlan.getCalories() < 1200) {
            throw new IllegalArgumentException("Calories too low for a valid meal plan");
        }

        return new Meal<>(mealPlan);
    }
}