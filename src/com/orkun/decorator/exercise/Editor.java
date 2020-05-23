package com.orkun.decorator.exercise;

import com.orkun.Main;

public class Editor {

    public void openProject(String path){
        Arti[] artifacts = {
                new Artifact("Main"),
                new Artifact("Demo"),
                new Artifact("EmailClient"),
                new Artifact("EmailProvider"),
        };

        // We can apply multiple decorators
        artifacts[0] = new ErrorDecorator(new MainDecorator(artifacts[0]));
        artifacts[2] = new ErrorDecorator(artifacts[2]);

        // In the future, we can create a SourceControlDecorator that adds
        // a special marker to the icon if artifacts are not committed to the repository.
        for (Arti artifact : artifacts) {
            System.out.println(artifact.render());
        }
    }
}
