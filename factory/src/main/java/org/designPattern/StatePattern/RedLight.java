package org.designPattern.StatePattern;

public class RedLight implements LightState
{
    @Override
    public void next(TrafficeLightContext context) {
        System.out.println("Red Light -> Green Light");
        context.setContext(new GreenLight());
    }

    @Override
    public String getColour() {
        return "Red";
    }


}
