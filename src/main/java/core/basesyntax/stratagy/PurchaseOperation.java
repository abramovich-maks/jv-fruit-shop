package core.basesyntax.stratagy;

import java.util.Map;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.storage.Storage;

public class PurchaseOperation implements OperationHandler {

    @Override
    public void handle(final FruitTransaction transaction) {
        Map<String, Integer> storage = Storage.storage;
        String fruit = transaction.getFruit();
        int fruitQuantity = transaction.getQuantity();
        int currentQuantity = storage.getOrDefault(fruit, 0);
        storage.put(fruit, currentQuantity - fruitQuantity);
    }
}
