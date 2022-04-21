package org.example.homework_13.task_8;

import org.example.homework_13.task_7.MobilePrice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//+
public class MobileProducer {
    public static void main(String[] args) {
        List<MobilePrice> mobilePrices = new ArrayList<>();
        mobilePrices.add(new MobilePrice("Apple", "13 mini", 150));
        mobilePrices.add(new MobilePrice("Samsung", "S22 Ultra", 200));
        mobilePrices.add(new MobilePrice("Apple", "13 mini", 100));
        mobilePrices.add(new MobilePrice("Xiaomi", "Note 11", 180));
        mobilePrices.add(new MobilePrice("BlackBerry", "Bold 9000", 230));

        System.out.println(mobilePrices);

        Map<String, List<MobilePrice>> findProducer = mobilePrices.stream()
                .collect(Collectors.groupingBy(MobilePrice::producer));

        System.out.println(findProducer);
    }
}
