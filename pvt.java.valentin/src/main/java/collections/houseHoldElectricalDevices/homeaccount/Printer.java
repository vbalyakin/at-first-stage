package collections.houseHoldElectricalDevices.homeaccount;

import collections.houseHoldElectricalDevices.ElectricalDevice;

import java.util.LinkedList;

public class Printer {
    public static void printAllDevicesInHome(LinkedList<ElectricalDevice> listOfDevicesInHome) {
        System.out.println("Devices in home: ");
        LinkedList<ElectricalDevice> listOfDevices = Adder.addDeviceInHome();
        listOfDevices.forEach(electricalDevice -> System.out.println(electricalDevice.getName()));
    }

}
