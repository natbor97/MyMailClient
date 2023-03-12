module pl.natalamichalowska {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics;
    requires activation;
    requires java.mail;


    opens pl.natalamichalowska to javafx.fxml, javafx.controls;
    exports pl.natalamichalowska;
    exports pl.natalamichalowska.controller;
    opens pl.natalamichalowska.controller to javafx.fxml, javafx.controls;
    opens pl.natalamichalowska.model;
}