import java.util.ArrayList;

public class ApplePieRecipe {
    ArrayList<Ingredient> IngredientList= new ArrayList<Ingredient>();
    ArrayList<String> stepList = new ArrayList<String>();

    public ApplePieRecipe(ArrayList<Ingredient> ingredientList, ArrayList<String> stepList) {
        this.IngredientList = ingredientList;
        this.stepList = stepList;
    }

    public ArrayList<Ingredient> getIngredientList() {
        return IngredientList;
    }

    public void setIngredientList(ArrayList<Ingredient> ingredientList) {
        IngredientList = ingredientList;
    }

    public ArrayList<String> getStepList() {
        return stepList;
    }

    public void setStepList(ArrayList<String> stepList) {
        this.stepList = stepList;
    }

    public void printRecept(){
        System.out.println("Ingrediénten:");
        for (Ingredient ingredient:IngredientList) {
            System.out.println(ingredient.getAmount()+" " +ingredient.getMeasurement()+" "+ingredient.getName());
        }
        System.out.println("Stappen:");
        for(int i=0; i<stepList.size(); i++){
            String step= stepList.get(i);
            System.out.println((i+1)+"."+step);
        }
    }

    @Override
    public String toString() {
        return "ApplePieRecipe{" +
                "IngredientList=" + IngredientList +
                ", StepList=" + stepList +
                '}';
    }
}
