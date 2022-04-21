package org.example.homework_13.task_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMobilePrice {
    public static void main(String[] args) {
        List<MobilePrice> mobilePrces = new ArrayList<>();
        mobilePrces.add(new MobilePrice("Apple", "13 mini", 150));
        mobilePrces.add(new MobilePrice("Samsung", "S22 Ultra", 200));
        mobilePrces.add(new MobilePrice("Apple", "13 mini", 100));
        mobilePrces.add(new MobilePrice("Xiaomi", "Note 11", 180));
        mobilePrces.add(new MobilePrice("BlackBerry", "Bold 9000", 230));

        System.out.println(mobilePrces);

        Optional<MobilePrice> cheapMobile = mobilePrces.stream()
                .min(Comparator.comparing(MobilePrice::price));

        System.out.println(cheapMobile);
    }
}
