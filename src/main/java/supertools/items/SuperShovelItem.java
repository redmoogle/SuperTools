package supertools.items;

import necesse.inventory.item.toolItem.shovelToolItem.CustomShovelToolItem;

// Extends CustomSwordToolItem
public class SuperShovelItem extends CustomShovelToolItem {
    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>
    public SuperShovelItem() {
        // Animation Speed, Tool Damage, Tool Tier, Attack Damage, Attack Range, Enchant Cost
        super(50, 5000, 5, 500, 100, 50, 1);
    }
}
