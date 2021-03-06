package Model.Item.ItemProperty;

import Model.Item.GenericItem;
import Model.Unit.IUnit;

/**
 * Паттерн Bridge.
 * Позволяет Item'ам иметь универсальные свойства.
 */
class GenericProperty implements IProperty {

    public void onActivate(GenericItem thisItem, IUnit thisUnit, IUnit targetUnit) {}

    public void onPickup(GenericItem thisItem, IUnit thisUnit) {}
}

