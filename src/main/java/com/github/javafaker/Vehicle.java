package com.github.javafaker;

public class Vehicle {
    private final Faker faker;

    protected Vehicle(Faker faker) {
        this.faker = faker;
    }

    public String vin() {
        String prefix = faker.fakeValuesService().resolve("vehicle.vin_prefix", this, faker);
        String end_str = "" + faker.number().numberBetween(new Double(Math.pow(10, 16)).longValue(), new Double(Math.pow(10, 20) - 1).longValue());
        String result = prefix + end_str;
        if (result.length() > 17) {
            result = result.toUpperCase().substring(0, 17);
        }
        return result;
    }
}
