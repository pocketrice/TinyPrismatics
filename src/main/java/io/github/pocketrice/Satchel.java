package io.github.pocketrice;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Satchel extends Item {

    public Satchel() {
        super(new Settings().rarity(Rarity.UNCOMMON));
    }
}
