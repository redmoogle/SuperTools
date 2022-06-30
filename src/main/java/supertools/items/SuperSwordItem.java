package supertools.items;

import necesse.inventory.item.toolItem.swordToolItem.CustomSwordToolItem;

// Extends CustomSwordToolItem
public class SuperSwordItem extends CustomSwordToolItem {
    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>
    public SuperSwordItem() {
        super(50, 500, 100, 25, 1);
    }
}
