package pl.natalamichalowska.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import pl.natalamichalowska.EmailManager;
import pl.natalamichalowska.view.ViewFactory;

public class LoginWindowController extends BaseController {
    @FXML
    private TextField emailAddress;

    @FXML
    private Label errorLabel;

    @FXML
    private PasswordField passwordField;

    public LoginWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void loginButtonAction() {
        System.out.println("Click!");
    }

}