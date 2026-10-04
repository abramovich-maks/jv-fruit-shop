package core.basesyntax.stratagy;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.storage.Storage;
import java.util.Map;

public class SupplyOperation implements OperationHandler {
    @Override
    public void handle(final FruitTransaction transaction) {
        Map<String, Integer> storage = Storage.storage;
        String fruit = transaction.getFruit();
        int fruitQuantity = transaction.getQuantity();
        storage.merge(fruit, fruitQuantity, Integer::sum);
    }
}
