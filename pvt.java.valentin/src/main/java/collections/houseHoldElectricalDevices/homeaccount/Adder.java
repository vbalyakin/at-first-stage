package collections.houseHoldElectricalDevices.homeaccount;

import collections.houseHoldElectricalDevices.ElectricalDevice;
import collections.houseHoldElectricalDevices.bathroom.HairDryer;
import collections.houseHoldElectricalDevices.bathroom.WashingMachine;
import collections.houseHoldElectricalDevices.kitchen.Dishwasher;
import collections.houseHoldElectricalDevices.kitchen.Microwave;
import collections.houseHoldElectricalDevices.kitchen.Oven;
import collections.houseHoldElectricalDevices.livingroom.Computer;
import collections.houseHoldElectricalDevices.livingroom.Hoover;
import collections.houseHoldElectricalDevices.livingroom.TV;

import java.util.LinkedList;

public class Adder {
    public static LinkedList addDeviceInHome() {
        LinkedList<ElectricalDevice> householdElectricalDevices = new LinkedList<>();
        householdElectricalDevices.add(new WashingMachine("WashingMachine", 800, true, 5, 26, 300, "bathroom"));
        householdElectricalDevices.add(new HairDryer("HairDryer", 1200, false, 15, 10, 40, "bathroom"));
        householdElectricalDevices.add(new Dishwasher("Dishwasher", 700, false, 28, 32, 700, "kitchen"));
        householdElectricalDevices.add(new Microwave("Microwave", 1400, false, 68, 13, 65, "kitchen"));
        householdElectricalDevices.add(new Oven("Oven", 2500, false, 14, 5, 300, "kitchen"));
        householdElectricalDevices.add(new Computer("Computer", 220, true, 34, 42, 450, "living room"));
        householdElectricalDevices.add(new Hoover("Hoover", 130, false, 4, 8, 130, "living room"));
        householdElectricalDevices.add(new TV("TV", 55, true, 35, 2, 350, "living room"));
        return householdElectricalDevices;
    }
}
