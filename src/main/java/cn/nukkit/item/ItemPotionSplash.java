package cn.nukkit.item;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.potion.Potion;

/**
 * @author xtypr
 * @since 2015/12/27
 */
public class ItemPotionSplash extends ProjectileItem {

    @PowerNukkitOnly
    @Since("1.6.0.0-PN")
    public ItemPotionSplash() {
        this(0, 64);
    }

    public ItemPotionSplash(Integer meta) {
        this(meta, 64);
    }

    public ItemPotionSplash(Integer meta, int count) {
        super(SPLASH_POTION, meta, count, "Splash Potion");
        updateName();
    }

    @Override
    public void setDamage(Integer meta) {
        super.setDamage(meta);
        updateName();
    }

    private void updateName() {
        int potionId = getDamage();
        if (potionId == Potion.WATER) {
            name = "Splash Water Bottle";
        } else {
            name = ItemPotion.buildName(potionId, "Splash Potion", true);
        }
    }

    @Override
    public int getMaxStackSize() {
        return 64;
    }

    @Override
    public boolean canBeActivated() {
        return true;
    }

    @Override
    public String getProjectileEntityType() {
        return "ThrownPotion";
    }

    @Override
    public float getThrowForce() {
        return 0.5f;
    }

    @Override
    protected void correctNBT(CompoundTag nbt) {
        nbt.putInt("PotionId", this.meta);
    }
}
