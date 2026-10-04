package core.basesyntax.service;

import java.util.List;
import core.basesyntax.model.FruitTransaction;

public interface DataParser {
    List<FruitTransaction> parse(List<String> lines);
}
