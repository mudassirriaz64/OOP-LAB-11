module com.labtasks.loginandregistration {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.labtasks.loginandregistration to javafx.fxml;
    exports com.labtasks.loginandregistration;
}