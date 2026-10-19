module com.mycompany.herenciafiguras {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.herenciafiguras to javafx.fxml;
    exports com.mycompany.herenciafiguras;
}
