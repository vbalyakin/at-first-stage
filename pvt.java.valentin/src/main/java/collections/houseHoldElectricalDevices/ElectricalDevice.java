package collections.houseHoldElectricalDevices;

public class ElectricalDevice {
    private String name;
    private int powerConsumption;
    private boolean networkConnection;
    private int monthlyUse;
    private int ageOfDeviceInMonths;
    private int priceInDollars;
    private String placeOfUSe;

    public ElectricalDevice(String name, int powerConsumption, boolean networkConnection, int monthlyUse, int ageOfDeviceInMonths, int priceInDollars, String placeOfUSe) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.networkConnection = networkConnection;
        this.monthlyUse = monthlyUse;
        this.ageOfDeviceInMonths = ageOfDeviceInMonths;
        this.priceInDollars = priceInDollars;
        this.placeOfUSe = placeOfUSe;
    }

    @Override
    public String toString() {
        return "ElectricalDevice{" +
                "name='" + name + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", networkConnection=" + networkConnection +
                ", monthlyUse=" + monthlyUse +
                ", ageOfDeviceInMonths=" + ageOfDeviceInMonths +
                ", priceInDollars=" + priceInDollars +
                ", placeOfUSe='" + placeOfUSe + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public boolean isNetworkConnection() {
        return networkConnection;
    }

    public int getMonthlyUse() {
        return monthlyUse;
    }

    public int getAgeOfDeviceInMonths() {
        return ageOfDeviceInMonths;
    }

    public int getPriceInDollars() {
        return priceInDollars;
    }

    public String getPlaceOfUSe() {
        return placeOfUSe;
    }
}
