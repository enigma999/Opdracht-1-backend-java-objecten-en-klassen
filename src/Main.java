import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Ingredient> IngredientsList = new ArrayList<Ingredient>();
        Ingredient roomboter = new Ingredient("roomboter", "gram",200 );
        Ingredient bastardSuiker = new Ingredient("bastardSuiker", "gram", 200);
        Ingredient zelfrijzendBakmeel = new Ingredient("zelfrijzendBakmeel", "gram", 400);
        Ingredient ei = new Ingredient("ei", "stuk(s)", 1);
        Ingredient vanillesuiker = new Ingredient("vanillesuiker", "gram", 8);
        Ingredient zout = new Ingredient("zout", "snuf", 1);
        Ingredient zoetzureAppels = new Ingredient("zoetzureAppels", "kilo", 1.5);
        Ingredient kristalSuiker = new Ingredient("kristalSuiker", "gram", 75);
        Ingredient kaneel = new Ingredient("kaneel", "theelepels", 3);
        Ingredient paneermeel = new Ingredient("paneermeel", "gram", 15);

        IngredientsList.add(roomboter);
        IngredientsList.add(bastardSuiker);
        IngredientsList.add(zelfrijzendBakmeel);
        IngredientsList.add(ei);
        IngredientsList.add(vanillesuiker);
        IngredientsList.add(zout);
        IngredientsList.add(zoetzureAppels);
        IngredientsList.add(kristalSuiker);
        IngredientsList.add(kaneel);
        IngredientsList.add(paneermeel);

        ArrayList<String> Stappenlijst = new ArrayList<>();
        Stappenlijst.add("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
        Stappenlijst.add("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
        Stappenlijst.add("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
        Stappenlijst.add("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        Stappenlijst.add("Vet de springvorm in en bestrooi deze met bloem");
        Stappenlijst.add("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
        Stappenlijst.add("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
        Stappenlijst.add("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
        Stappenlijst.add("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
        Stappenlijst.add("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");



        ApplePieRecipe applePieRecipe =new ApplePieRecipe(IngredientsList,Stappenlijst);
        applePieRecipe.printRecept();
    }
}