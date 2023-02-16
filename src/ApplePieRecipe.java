import java.util.ArrayList;

public class ApplePieRecipe {
    ArrayList<Ingredient> IngredientList= new ArrayList<Ingredient>();
    ArrayList<String> StepList= new ArrayList<String>();

    public ApplePieRecipe(ArrayList<Ingredient> ingredientList, ArrayList<String> stepList) {
        IngredientList = ingredientList;
        StepList = stepList;
    }

    public ArrayList<Ingredient> getIngredientList() {
        return IngredientList;
    }

    public void setIngredientList(ArrayList<Ingredient> ingredientList) {
        IngredientList = ingredientList;
    }

    public ArrayList<String> getStepList() {
        return StepList;
    }

    public void setStepList(ArrayList<String> stepList) {
        StepList = stepList;
    }

    @Override
    public String toString() {
        return "ApplePieRecipe{" +
                "IngredientList=" + IngredientList +
                ", StepList=" + StepList +
                '}';
    }
}
