package core.basesyntax.stratagy;

import java.util.Map;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.storage.Storage;

public class ReturnOperation implements OperationHandler {
    @Override
    public void handle(final FruitTransaction transaction) {
        Map<String, Integer> storage = Storage.storage;
        String fruit = transaction.getFruit();
        int fruitQuantity = transaction.getQuantity();
        storage.merge(fruit, fruitQuantity, Integer::sum);
    }
}
