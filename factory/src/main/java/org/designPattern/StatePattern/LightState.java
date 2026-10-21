package org.designPattern.StatePattern;

public interface LightState {
    void next(TrafficeLightContext context);
    String getColour();

}
