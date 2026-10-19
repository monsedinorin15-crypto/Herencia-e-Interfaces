module com.mycompany.herencia {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.herencia to javafx.fxml;
    exports com.mycompany.herencia;
}
