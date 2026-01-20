 
public class MealApp {

	public static void main(String[] args) {
		
		Meal<VegetarianMeal> vegMeal = MealPlanGenerator.generateMealPlan(new VegetarianMeal());

        Meal<VeganMeal> veganMeal = MealPlanGenerator.generateMealPlan(new VeganMeal());

        Meal<KetoMeal> ketoMeal = MealPlanGenerator.generateMealPlan(new KetoMeal());

        System.out.println(vegMeal.getMealPlan().getMealType()+ " | Calories: " + vegMeal.getMealPlan().getCalories());

        System.out.println(veganMeal.getMealPlan().getMealType()+ " | Calories: " + veganMeal.getMealPlan().getCalories());

        System.out.println(ketoMeal.getMealPlan().getMealType()+ " | Calories: " + ketoMeal.getMealPlan().getCalories());

	}

}