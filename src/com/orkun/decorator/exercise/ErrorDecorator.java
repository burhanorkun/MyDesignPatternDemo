package com.orkun.decorator.exercise;

public class ErrorDecorator implements Arti {
    private Arti artifact;

    public ErrorDecorator(Arti artifact) {
        this.artifact = artifact;
    }

    @Override
    public String render() {
        var mainIcon = artifact.render();
        return mainIcon + " [Error]";
    }
}
