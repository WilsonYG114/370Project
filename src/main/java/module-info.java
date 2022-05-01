module com.example.demo4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.QCApplication_BuilderPattern to javafx.fxml;
    exports com.example.QCApplication_BuilderPattern;
}