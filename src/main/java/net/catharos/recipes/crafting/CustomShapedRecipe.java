package net.catharos.recipes.crafting;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CustomShapedRecipe extends CustomRecipe {
	protected ShapedRecipe recipe;

	public CustomShapedRecipe( String name, Material mat, int amount, byte id, boolean setname ) {
		super( name, new ItemStack( mat, amount, id ) );

		if (setname) setName( name );
		recipe = new ShapedRecipe( getItem() );
	}

	public ShapedRecipe getRecipe() {
		return recipe;
	}
}
