package net.catharos.recipes.crafting;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class CustomShapelessRecipe extends CustomRecipe {
	protected ShapelessRecipe recipe;

	public CustomShapelessRecipe( String name, Material mat, int amount, byte id ) {
		super( name, new ItemStack( mat, amount, id ) );

		setName( name );
		recipe = new ShapelessRecipe( getItem() );
	}

	public ShapelessRecipe getRecipe() {
		return recipe;
	}

}