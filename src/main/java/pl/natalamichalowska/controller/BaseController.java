package pl.natalamichalowska.controller;

import pl.natalamichalowska.EmailManager;
import pl.natalamichalowska.view.ViewFactory;

public abstract class BaseController {
    private EmailManager emailManager;
    private ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }
}
