package collections.houseHoldElectricalDevices.homeaccount;

import collections.houseHoldElectricalDevices.ElectricalDevice;

import java.util.LinkedList;
import java.util.Scanner;

public class Sorter {
    public static void sortByPowerConsumption(LinkedList<ElectricalDevice> listOfDevicesInHome) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter power value for sorting: ");
        int powerValue = scanner.nextInt();
        LinkedList<ElectricalDevice> listOfDevices = Adder.addDeviceInHome();
        System.out.println("Devices with power consumption less than your value: ");
        listOfDevices
                .stream()
                .filter(device -> device.getPowerConsumption() < powerValue)
                .forEach(device -> System.out.println(device.getName()));
        System.out.println("Devices with power consumption more than your value: ");
        listOfDevices
                .stream()
                .filter(device -> device.getPowerConsumption() > powerValue)
                .forEach(device -> System.out.println(device.getName()));
    }

    public static void sortBySwitchOn(LinkedList<ElectricalDevice> listOfDevicesInHome) {
        LinkedList<ElectricalDevice> listOfDevices = Adder.addDeviceInHome();
        System.out.println("Switch ON devices: ");
        listOfDevices
                .stream()
                .filter(ElectricalDevice::isNetworkConnection)
                .forEach(device -> System.out.println(device.getName()));
    }

    public static void sortBySeveralSpecifications(LinkedList<ElectricalDevice> listOfDevicesInHome) {
        System.out.println("Device (-s), younger than 12 month & use less than 10 times in month: ");
        LinkedList<ElectricalDevice> listOfDevices = Adder.addDeviceInHome();
        int stopPointForMonthlyUse = 10;
        int youngDeviceInMonths = 12;
        listOfDevices
                .stream()
                .filter(device -> device.getMonthlyUse() < stopPointForMonthlyUse)
                .filter(device -> device.getAgeOfDeviceInMonths() < youngDeviceInMonths)
                .forEach(device -> System.out.println(device.getName()));
    }
}
