package org.designPattern.StatePattern;

public class TrafficeLightContext {

    private LightState state;

    public TrafficeLightContext (){
        state=new RedLight();
    }

    public void setContext(LightState state) {
        this.state = state;
    }

    public void next(){
        state.next(this);
    }
    public String getColour(){
        return state.getColour();
    }
}
