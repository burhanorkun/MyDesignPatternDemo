package com.orkun.command.exercise;

public class SetContrastCommand extends AbstractUndoableCommand {
    private float prevContrast;
    private float contrast;

    public SetContrastCommand(float contrast, VideoEditor videoEditor, History history) {
        super(videoEditor, history);
        this.prevContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    }
}
