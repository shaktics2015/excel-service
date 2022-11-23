package org.penta.work.jpa.utils;

import org.penta.work.boostrap.port.model.Item;

import java.math.BigDecimal;
import java.util.Map;

import static java.util.Map.entry;

public class DataUtil {
    private static DataUtil single_instance = null;
    public Map<Long, Item> accounts = Map.ofEntries(
            entry(1L, Item.builder().price(BigDecimal.valueOf(100000L)).veg(true).build()),
            entry(2L, Item.builder().price(BigDecimal.valueOf(100L)).veg(false).build())
    );

    private DataUtil() {
    }

    public static DataUtil getInstance() {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new DataUtil();
        }
        return single_instance;
    }
}
