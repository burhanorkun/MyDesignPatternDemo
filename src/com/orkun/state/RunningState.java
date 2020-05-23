package com.orkun.state;

public class RunningState implements State {

    ControlWatch controlWatch;

    public RunningState(ControlWatch controlWatch) {
        this.controlWatch = controlWatch;
    }

    @Override
    public void click() {
        controlWatch.setCurrentState(new StoppedState(controlWatch));
        System.out.println("Stopped");
    }
}
