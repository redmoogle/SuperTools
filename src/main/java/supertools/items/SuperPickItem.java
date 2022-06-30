package supertools.items;

import necesse.inventory.item.toolItem.pickaxeToolItem.CustomPickaxeToolItem;

// Extends CustomSwordToolItem
public class SuperPickItem extends CustomPickaxeToolItem {
    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>
    public SuperPickItem() {
        super(50, 5000, 5, 500, 100, 50, 1);
    }

}
