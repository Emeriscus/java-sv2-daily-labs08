package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void createRecipeWithNameTest() {
        Recipe recipe = new Recipe("Cataflam");

        assertEquals("Cataflam", recipe.getName());
        assertNull(recipe.getDescription());
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void createRecipeWithNameAnDescriptionTest() {
        Recipe recipe = new Recipe("Cataflam", "gyulladáscsökkentő");

        assertEquals("Cataflam", recipe.getName());
        assertEquals("gyulladáscsökkentő", recipe.getDescription());
        assertEquals(0, recipe.getIngredients().size());
    }


    @Test
    void addOneIngredientTest() {
        Recipe recipe = new Recipe("Algoflex");
        recipe.addIngredient("kálium");

        assertEquals(1, recipe.getIngredients().size());
    }

    @Test
    void addListOfIngredientTest() {
        Recipe recipe = new Recipe("Algoflex");
        recipe.addIngredient("kálium", "kalcium", "magnézium");

        assertEquals(3, recipe.getIngredients().size());
        assertArrayEquals(new String[]{"kálium", "kalcium", "magnézium"}, recipe.getIngredients().toArray());
    }
}