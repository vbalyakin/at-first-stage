package collections.houseHoldElectricalDevices.livingroom;

import collections.houseHoldElectricalDevices.ElectricalDevice;

public class Hoover extends ElectricalDevice {
    public Hoover(String name, int powerConsumption, boolean networkConnection, int monthlyUse, int ageOfDeviceInMonths, int priceInDollars, String placeOfUSe) {
        super(name, powerConsumption, networkConnection, monthlyUse, ageOfDeviceInMonths, priceInDollars, placeOfUSe);
    }
}
