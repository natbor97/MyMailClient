module pl.natalamichalowska {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens pl.natalamichalowska to javafx.fxml;
    exports pl.natalamichalowska;
    exports pl.natalamichalowska.controller;
    opens pl.natalamichalowska.controller to javafx.fxml;
}