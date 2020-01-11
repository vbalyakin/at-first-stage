package cleancode.planes;

import cleancode.models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane {
    private MilitaryType militaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType militaryType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryType +
                        '}');
    }

    @Override
    public boolean equals(Object someKindOfPlane) {
        if (this == someKindOfPlane) {
            return true;
        }
        if (!(someKindOfPlane instanceof MilitaryPlane) || !super.equals(someKindOfPlane)) {
            return false;
        }
        MilitaryPlane that = (MilitaryPlane) someKindOfPlane;
        return militaryType == that.militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}
