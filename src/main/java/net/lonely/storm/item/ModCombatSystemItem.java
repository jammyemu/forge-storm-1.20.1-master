package net.lonely.storm.item;

import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.OutgoingChatMessage;
import net.minecraft.network.chat.PlayerChatMessage;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.CommandEvent;

public class ModCombatSystemItem extends Item {

    public ModCombatSystemItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        if (pStack.getItem().isEdible()) {
            return pStack.getFoodProperties(null).isFastFood() ? 10 : 20;
        } else {
            return 20;
        }
    }
}
