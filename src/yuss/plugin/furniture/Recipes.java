package yuss.plugin.furniture;

import net.minecraft.server.v1_13_R2.ChatComponentText;
import net.minecraft.server.v1_13_R2.ItemStack;
import net.minecraft.server.v1_13_R2.Items;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_13_R2.inventory.CraftItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Recipes {

    public static void initRecipe() {
        ItemStack chair = new ItemStack(Items.ARMOR_STAND);
        chair.a(new ChatComponentText("§e椅子"));
        chair.getTag().setString("type", "chair");
        ShapedRecipe ChairRecipe = new ShapedRecipe(CraftItemStack.asBukkitCopy(chair));
        ChairRecipe.shape(new String[] { "   ", " X ", " V " });
        ChairRecipe.setIngredient('X', Material.ARMOR_STAND);
        ChairRecipe.setIngredient('V', Material.ARMOR_STAND);
        Bukkit.addRecipe(ChairRecipe);
    }
}
