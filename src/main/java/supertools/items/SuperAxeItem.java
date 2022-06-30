package supertools.items;

import necesse.inventory.item.toolItem.axeToolItem.CustomAxeToolItem;

// Extends CustomSwordToolItem
public class SuperAxeItem extends CustomAxeToolItem {
    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>
    public SuperAxeItem() {
        super(50, 5000, 5, 500, 100, 50, 1);
    }

}
