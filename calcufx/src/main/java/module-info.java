module com.calcufx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.calcufx to javafx.fxml;
    exports com.calcufx;
    exports com.calcufx.controller;
    opens com.calcufx.controller to javafx.fxml;
}