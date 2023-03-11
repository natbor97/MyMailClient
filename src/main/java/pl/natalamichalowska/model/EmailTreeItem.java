package pl.natalamichalowska.model;

import javafx.scene.control.TreeItem;

public class EmailTreeItem<String> extends TreeItem<String> {
    private String name;

    public EmailTreeItem(String name) {
        this.name = name;
    }
}
