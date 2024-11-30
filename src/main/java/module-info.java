module rgz.tamp.tankesonline {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    exports rgz.tamp.tankesonline.mainmenu;
    opens rgz.tamp.tankesonline.mainmenu to javafx.fxml;
    exports rgz.tamp.tankesonline.reg;
    opens rgz.tamp.tankesonline.reg to javafx.fxml;
}