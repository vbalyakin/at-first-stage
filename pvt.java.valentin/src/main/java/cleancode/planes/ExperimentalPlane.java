package cleancode.planes;

import cleancode.models.ClassificationLevel;
import cleancode.models.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane {
    private ExperimentalTypes experimentalTypes;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes experimentalTypes, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypes = experimentalTypes;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", experimentalTypes=" + experimentalTypes
                + ", classificationLevel=" + classificationLevel +
                '}');
    }

    @Override
    public boolean equals(Object someKindOfPlane) {
        if (this == someKindOfPlane) {
            return true;
        }
        if (!(someKindOfPlane instanceof ExperimentalPlane) || !super.equals(someKindOfPlane)) {
            return false;
        }
        ExperimentalPlane that = (ExperimentalPlane) someKindOfPlane;
        return experimentalTypes == that.experimentalTypes &&
                classificationLevel == that.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalTypes, classificationLevel);
    }
}