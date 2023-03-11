package pl.natalamichalowska.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import pl.natalamichalowska.EmailManager;
import pl.natalamichalowska.controller.services.LoginService;
import pl.natalamichalowska.model.EmailAccount;
import pl.natalamichalowska.view.ViewFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginWindowController extends BaseController implements Initializable {
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
        System.out.println("loginButtonAction");
        if (fieldsAreValid()){
            EmailAccount emailAccount = new EmailAccount(emailAddress.getText(), passwordField.getText());
            LoginService loginService = new LoginService(emailAccount, emailManager);
            loginService.start();
            loginService.setOnSucceeded(event -> {
                EmailLoginResult emailLoginResult = loginService.getValue();

                switch (emailLoginResult) {
                    case SUCCESS:
                        System.out.println("login success: "+emailAccount);
                        viewFactory.showMainWindow();
                        Stage stage = (Stage) errorLabel.getScene().getWindow();
                        viewFactory.closeStage(stage);
                        System.out.println("loginWindowClosed");
                        return;
                    case FAILED_BY_CREDENTIALS:
                        errorLabel.setText("Invalid credentials");
                        return;
                    case FAILED_BY_NETWORK:
                        errorLabel.setText("Conection error");
                        return;
                    case FAILED_BY_UNEXPEECTED_ERROR:
                        errorLabel.setText("something gone wrong");
                        return;
                    default: return;
                }
            });
        }
    }

    private boolean fieldsAreValid() {
        if (emailAddress.getText().isEmpty()){
            errorLabel.setText("Please fill email");
            return false;
        }
        if (passwordField.getText().isEmpty()){
            errorLabel.setText("Please fill password");
            return false;
        }
        else return true;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        emailAddress.setText("natalia.michalowska97@op.pl");
        passwordField.setText("haslo");
    }
}