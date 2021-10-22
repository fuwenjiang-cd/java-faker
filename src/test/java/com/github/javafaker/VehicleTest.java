package com.github.javafaker;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormatSymbols;

public class VehicleTest extends AbstractFakerTest {

    @Test
    public void testVINs() {
        final String vin = faker.vehicle().vin();
        System.out.println(vin);
        Assert.assertNotNull(vin);
        Assert.assertEquals(vin.length(), 17);
    }
}
