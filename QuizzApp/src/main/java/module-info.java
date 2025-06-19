module com.dpd.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.dpd.quizzapp to javafx.fxml;
    exports com.dpd.quizzapp;
}
