package Model.Unit.UnitAction;

import Model.Item.GenericItem;
import Model.Unit.IUnit;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class ExampleAction extends Action {

    private static final Action instance = new ExampleAction();

    private ExampleAction() {}

    @Override
    public ActionResult perform(@NotNull IUnit thisUnit, @Nullable IUnit targetUnit, @Nullable GenericItem item) {
        ActionResult retval = ActionResult.SUCCESS;
        thisUnit.changeActionPoints(-1);
        return retval;
    }

    @NotNull
    public static Action getAction() {
        return instance;
    }
}
