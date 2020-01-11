package collections.houseHoldElectricalDevices;

import collections.houseHoldElectricalDevices.homeaccount.Adder;
import collections.houseHoldElectricalDevices.homeaccount.Printer;
import collections.houseHoldElectricalDevices.homeaccount.Sorter;

import java.util.LinkedList;

public class Launch {
    public static void main(String[] args) {
        LinkedList<ElectricalDevice> listOfDevicesInHome = Adder.addDeviceInHome();
        Printer.printAllDevicesInHome(listOfDevicesInHome);
        Sorter.sortBySwitchOn(listOfDevicesInHome);
        Sorter.sortByPowerConsumption(listOfDevicesInHome);
        Sorter.sortBySeveralSpecifications(listOfDevicesInHome);
    }
}
