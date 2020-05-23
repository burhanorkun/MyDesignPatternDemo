package com.orkun.decorator.exercise;

public class MainDecorator implements Arti {
    private Arti artifact;

    public MainDecorator(Arti artifact) {
        this.artifact = artifact;
    }

    @Override
    public String render() {
        var mainIcon = artifact.render();
        return mainIcon + " [Main]";
    }
}
