module ies.losmontecillos.personalizados1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ies.losmontecillos.personalizados1 to javafx.fxml;
    exports ies.losmontecillos.personalizados1;
}