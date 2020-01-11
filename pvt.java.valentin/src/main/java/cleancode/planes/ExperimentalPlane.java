package cleancode.planes;

import cleancode.models.ClassificationLevel;
import cleancode.models.ExperimentalTypes;

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
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}