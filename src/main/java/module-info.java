module com.example.aula2exercicio1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aula2exercicio1 to javafx.fxml;
    exports com.example.aula2exercicio1;
}