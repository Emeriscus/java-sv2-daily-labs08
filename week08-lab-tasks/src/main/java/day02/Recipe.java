package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {

    private String name;
    private String description;
    private List<String> ingredients = new ArrayList<>();

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addIngredient(String ingredient1, String... ingredient) {
//        if (ingredient1 == null || ingredient1.isBlank() || ingredient ==null|| ingredient.isBlank){
//            throw new IllegalArgumentException("The ingredient cannot empty or null");
//        }
//      ciklussal lehet vizsgálni, hogy a ingredientben van-e null

        ingredients.add(ingredient1);
        ingredients.addAll(Arrays.asList(ingredient));      // ez elegánsabb... mint a for each
//        for ( String actual : ingredient){
//            ingredients.add(actual);

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }


    public static void main(String[] args) {

    }
}
