package com.github.javafaker;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private final Faker faker;
    private final List<String> vin_prefix_list;

    protected Vehicle(Faker faker) {
        this.faker = faker;
        this.vin_prefix_list = new ArrayList<String>();
        this.vin_prefix_list.add("LGBF");
        this.vin_prefix_list.add("LDC");
        this.vin_prefix_list.add("LJD");
        this.vin_prefix_list.add("LVR");
        this.vin_prefix_list.add("LVS");
        this.vin_prefix_list.add("LGB");
        this.vin_prefix_list.add("LYV");
    }

    public String vin() {
        String prefix = faker.random().choice(this.vin_prefix_list, String.class);
        String end_str = "" + faker.number().numberBetween(new Double(Math.pow(10, 16)).longValue(), new Double(Math.pow(10, 20) - 1).longValue());
        String result = prefix + end_str;
        if (result.length() > 17) {
            result = result.toUpperCase().substring(0, 17);
        }
        return result;
    }
}
