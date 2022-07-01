package supertools;

import supertools.items.SuperSwordItem;
import supertools.items.SuperPickItem;
import supertools.items.SuperAxeItem;
import supertools.items.SuperShovelItem;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;

@ModEntry
public class supertools {

    public void init() {
        System.out.println("Thnak you for using SuperTools by Redmoogle!");
        // Register our items
        ItemRegistry.registerItem("supersword", new SuperSwordItem(), 20, true);
        ItemRegistry.registerItem("superpick", new SuperPickItem(), 20, true);
        ItemRegistry.registerItem("superaxe", new SuperAxeItem(), 20, true);
        ItemRegistry.registerItem("supershovel", new SuperShovelItem(), 20, true);
    }

    public void postInit() {
        Recipes.registerModRecipe(new Recipe(
                "supersword",
                1,
                RecipeTechRegistry.NONE,
                new Ingredient[]{
                        new Ingredient("anylog", 1)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "superpick",
                1,
                RecipeTechRegistry.NONE,
                new Ingredient[]{
                        new Ingredient("anylog", 1)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "superaxe",
                1,
                RecipeTechRegistry.NONE,
                new Ingredient[]{
                        new Ingredient("anylog", 1)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "supershovel",
                1,
                RecipeTechRegistry.NONE,
                new Ingredient[]{
                        new Ingredient("anylog", 1)
                }
        ));
    }

}
