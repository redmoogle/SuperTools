package supertools.items;

import necesse.inventory.item.toolItem.pickaxeToolItem.CustomPickaxeToolItem;

// Extends CustomSwordToolItem
public class SuperPickItem extends CustomPickaxeToolItem {
    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>
    public SuperPickItem() {
        // Animation Speed, Tool Damage, Tool Tier, Attack Damage, Attack Range, Enchant Cost
        super(50, 5000, 5, 500, 100, 50, 1);
    }
}
