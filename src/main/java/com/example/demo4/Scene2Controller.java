package com.example.demo4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Scene2Controller {

    //text field will be stored in these field
    protected static Object HSDipField,equivalencyDipField,EDUBeyondHSField,attendCUNYField,attendQCField;
    protected static String HSNameField,universityNameField;
    protected static LocalDate HSGradDateField,equivalencyDipDateField,lastSemesterOfAttendanceField,dateOfGradField;
    protected  static EducationBuilder educationBuilder = new EducationBuilder();
    @FXML
    private Button scene2Prev;
     Stage scene1;
     Parent root;
     FXMLLoader loader;
    private Scene1Controller scene1Controller;

    @FXML
    ComboBox highSchoolDip ,EquivalencyDip,EDUBeyondHS,attendCUNY,attendQC;
    @FXML
    TextField highSchoolName,universityName;
    @FXML
    DatePicker HSGradDate,equivalencyDipDate,lastSemesterDate,dateOfGraduation;

    // when previous page button is clicked on second page this will switch to first page
    public void switchToScene1(ActionEvent event) throws IOException
    {

        scene2Prev.getScene().getWindow().hide();
        scene1 = new Stage();
        loader = new  FXMLLoader(getClass().getResource("scene1.fxml"));
        root = loader.load();
        scene1Controller = loader.getController();
        scene1SaveField(); //restore field to first page
        Scene scene = new Scene(root);
        scene1.setScene(scene);
        scene1.show();
        scene1.setResizable(false);
        getTextField();

    }

//this will restore the field switching from scene2 to scene1
    public void scene1SaveField()
    {
        scene1Controller.setFirstName(scene1Controller.getFirstName());
        scene1Controller.setLastName(scene1Controller.getLastName());
        scene1Controller.setMiddleName(scene1Controller.getMiddleName());
        scene1Controller.setDOB(scene1Controller.getDob());
        scene1Controller.setSSN(scene1Controller.getSSN());
        scene1Controller.setConfirmSSN(scene1Controller.getConfirmSSN());
        scene1Controller.setCUNYID(scene1Controller.getCUNYID());
        scene1Controller.setConfirmCUNYID(scene1Controller.getConfirmCUNYID());
        scene1Controller.setGender(scene1Controller.getGender());
        scene1Controller.setAddState(scene1Controller.getAddState());
        scene1Controller.setAddStreet(scene1Controller.getAddStreet());
        scene1Controller.setAddCity(scene1Controller.getAddCity());
        scene1Controller.setAddApt(scene1Controller.getAddApt());
        scene1Controller.setAddZip(scene1Controller.getAddZip());
        scene1Controller.setMailStreet(scene1Controller.getMailStreet());
        scene1Controller.setMailApt(scene1Controller.getMailApt());
        scene1Controller.setMailCity(scene1Controller.getMailCity());
        scene1Controller.setMailZip(scene1Controller.getMailZip());
        scene1Controller.setMailState(scene1Controller.getMailState());
        scene1Controller.setAddSameAsMailAdd(scene1Controller.getAddSameAsMailAdd());
        scene1Controller.setEmail(scene1Controller.getEmail());
        scene1Controller.setPhoneNum(scene1Controller.getPhoneNum());
        scene1Controller.setCellNum(scene1Controller.getCellNum());
        scene1Controller.setPhoneNumAsCell(scene1Controller.getPhoneNumAsCell());
    }



    public void getTextField()
    {
        HSDipField = highSchoolDip.getValue();
        HSNameField = highSchoolName.getText();
        HSGradDateField = HSGradDate.getValue();
        equivalencyDipField = EquivalencyDip.getValue();
        equivalencyDipDateField = equivalencyDipDate.getValue();
        EDUBeyondHSField = EDUBeyondHS.getValue();
        universityNameField = universityName.getText();
        lastSemesterOfAttendanceField = lastSemesterDate.getValue();
        dateOfGradField = dateOfGraduation.getValue();
        attendCUNYField = attendCUNY.getValue();
        attendQCField = attendQC.getValue();
        setEduInfoBuilder();

    }

    public Object getHSDip()
    {
        return HSDipField;
    }

    public String getHSName()
    {
        return HSNameField;
    }

    public LocalDate getHSGradDate()
    {
        return HSGradDateField;
    }

    public Object getEquivalencyDip()
    {
        return equivalencyDipField;
    }

    public LocalDate getEquivalencyDipDate()
    {
        return equivalencyDipDateField;
    }
    public Object getEDUBeyondHS()
    {
        return EDUBeyondHSField;
    }

    public String getUniversityName()
    {
        return universityNameField;
    }

    public LocalDate getLastSemesterOfAttendance()
    {
        return lastSemesterOfAttendanceField;
    }

    public LocalDate getDateOfGrad()
    {
        return dateOfGradField;
    }

    public Object getAttendCUNY()
    {
        return attendCUNYField;
    }
    public Object getAttendQC()
    {
        return attendQCField;
    }


    public void setHSDip(Object text)
    {
        highSchoolDip.setValue(text);
    }

    public void setHSName(String text)
    {
        highSchoolName.setText(text);
    }

    public void setHSGradDate(LocalDate text)
    {
        HSGradDate.setValue(text);
    }

    public void setEquivalencyDip(Object text)
    {
        EquivalencyDip.setValue(text);
    }
    public void setEquivalencyDipDate(LocalDate text)
    {
        equivalencyDipDate.setValue(text);
    }
    public void setEDUBeyondHS(Object text)
    {
        EDUBeyondHS.setValue(text);
    }
    public void setUniversityName(String text)
    {
        universityName.setText(text);
    }

    public void setLastSemesterOfAttendance(LocalDate text)
    {
        lastSemesterDate.setValue(text);
    }

    public void setDateOfGrad(LocalDate text)
    {
        dateOfGraduation.setValue(text);
    }

    public void setAttendCUNY(Object text)
    {
        attendCUNY.setValue(text);
    }

    public void setAttendQC(Object text)
    {
        attendQC.setValue(text);
    }



    public void setEduInfoBuilder()
    {
        educationBuilder.setHSDip(HSDipField);
        educationBuilder.setHSName(HSNameField);
        educationBuilder.setHSGradDate(HSGradDateField);
        educationBuilder.setEquivalencyDip(equivalencyDipField);
        educationBuilder.setEquivalencyDipDate(equivalencyDipDateField);
        educationBuilder.setEDUBeyondHS(EDUBeyondHSField);
        educationBuilder.setUniversityName(universityNameField);
        educationBuilder.setLastSemesterOfAttendance(lastSemesterOfAttendanceField);
        educationBuilder.setDateOfGrad(dateOfGradField);
        educationBuilder.setAttendCUNY(attendCUNYField);
        educationBuilder.setAttendQC(attendQCField);
    }
    public Object getEduInfoBuilder()
    {
        System.out.println(educationBuilder.getEDUInfo());
        return educationBuilder.getEDUInfo();
    }

    public void Submit(ActionEvent actionEvent) {
        Scene1Controller info = new Scene1Controller();
        info.getInfoBuilder();
        getTextField();
        getEduInfoBuilder();
    }

    public void highSchoolDipClick(MouseEvent mouseEvent) {
        ObservableList<String> list = FXCollections.observableArrayList("Yes","No");
        highSchoolDip.setItems(list);
    }

    public void EDUBeyondHSClick(MouseEvent mouseEvent) {
        ObservableList<String> list = FXCollections.observableArrayList("Yes","No");
        EDUBeyondHS.setItems(list);
    }

    public void equivalencyDipSelect(MouseEvent mouseEvent) {
        ObservableList<String> list = FXCollections.observableArrayList("Yes","No");
        EquivalencyDip.setItems(list);
    }

    public void attendCUNYClick(MouseEvent mouseEvent) {
        ObservableList<String> list = FXCollections.observableArrayList("Yes","No");
        attendCUNY.setItems(list);
    }


    public void attendQCClick(MouseEvent mouseEvent) {
        ObservableList<String> list = FXCollections.observableArrayList("Yes","No");
        attendQC.setItems(list);
    }
}
