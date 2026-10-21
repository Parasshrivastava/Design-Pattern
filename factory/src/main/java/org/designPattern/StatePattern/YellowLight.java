package org.designPattern.StatePattern;

public class YellowLight implements LightState {
    @Override
    public void next(TrafficeLightContext context) {
        System.out.println("Yellow Light: Prepare to stop");
        context.setContext(new RedLight());
    }

    @Override
    public String getColour() {
        return "Yellow";
    }


}
