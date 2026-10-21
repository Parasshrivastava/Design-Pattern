package org.designPattern.factory;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BUS")) {
            return new Bus();
        } else if (vehicleType.equalsIgnoreCase("TRAIN")) {
            return new Train();
        }
        return null;
    }
}
