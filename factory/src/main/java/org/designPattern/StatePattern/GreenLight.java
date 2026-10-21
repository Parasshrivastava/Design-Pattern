package org.designPattern.StatePattern;

public class GreenLight implements LightState {
    @Override
    public void next(TrafficeLightContext context) {
        System.out.println("Green Light: Go!");
        context.setContext(new YellowLight());
    }

    @Override
    public String getColour() {
        return "Green";
    }


}
