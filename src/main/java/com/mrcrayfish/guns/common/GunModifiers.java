package com.mrcrayfish.guns.common;

import com.mrcrayfish.guns.interfaces.IGunModifier;
import com.mrcrayfish.guns.object.Gun;
import net.minecraft.item.ItemStack;

/**
 * Author: MrCrayfish
 */
public class GunModifiers
{
    public static final IGunModifier REDUCED_DAMAGE_AND_SOUND = new IGunModifier()
    {
        @Override
        public boolean silencedFire()
        {
            return true;
        }

        @Override
        public double modifySilencedFireSoundRadius(double radius)
        {
            return radius * 0.25;
        }

        @Override
        public float modifyProjectileDamage(ItemStack stack, Gun modifiedGun, float damage)
        {
            return damage * 0.75F;
        }
    };
}