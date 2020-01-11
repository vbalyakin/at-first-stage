package collections.houseHoldElectricalDevices.kitchen;

import collections.houseHoldElectricalDevices.ElectricalDevice;

public class Oven extends ElectricalDevice {
    public Oven(String name, int powerConsumption, boolean networkConnection, int monthlyUse, int ageOfDeviceInMonths, int priceInDollars, String placeOfUSe) {
        super(name, powerConsumption, networkConnection, monthlyUse, ageOfDeviceInMonths, priceInDollars, placeOfUSe);
    }
}
