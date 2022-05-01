package com.example.QCApplication_BuilderPattern;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Scene1Controller {

    protected static String firstNameField,middleNameField,lastNameField
                        ,SSNField,confirmSSNField,CUNYIDField
                        ,confirmCUNYIDField,addStreetField,mailZipField
                        ,addCityField,addAptField,addZipField
                        ,mailStreetField,mailAptField,mailCityField
                        ,emailField,phoneNumField,cellPhoneNumField,UIDField;

    protected static LocalDate DOBField;
    protected static Object mailStateField,genderField,addStateField;
    protected static boolean AddSameAsMailAdd, phoneNumAsCell;



    @FXML
    Button scene1Next;
    @FXML
    DatePicker DOB;
    @FXML
    TextField firstName ,middleName, lastName,
            SSN, confirmSSN, CUNYID, confirmCUNYID,
            addStreet,addCity,addApt,addZip,
            mailStreet,mailApt,mailCity,mailZip,
            email,phoneNum,cellNum;
    @FXML
    Label UID;
    @FXML
    ComboBox genderBox, addState,mailState;
    @FXML
    CheckBox addSameAsMailAdd,phoneNumAsCellPhone;


     protected static InfoBuilder infoBuilder = new InfoBuilder();

     private Scene2Controller scene2Controller;

    Stage scene2;
    Parent root;
    FXMLLoader loader;

    public void switchToScene2(ActionEvent event) throws IOException
    {
            if(fieldCheck() == true)
            {
                scene1Next.getScene().getWindow().hide();
                scene2 = new Stage();
                loader = new  FXMLLoader(getClass().getResource("scene2.fxml"));
                root = loader.load();
                scene2Controller = loader.getController();
                scene2SaveField();
                Scene scene = new Scene(root);
                scene2.setScene(scene);
                scene2.show();
                scene2.setResizable(false);
                getTextField();
            }
    }


    //restore field from scene2 when switching from scene1
    public void scene2SaveField()
    {
        scene2Controller.setHSDip(scene2Controller.getHSDip());
        scene2Controller.setHSName(scene2Controller.getHSName());
        scene2Controller.setHSGradDate(scene2Controller.getHSGradDate());
        scene2Controller.setEquivalencyDip(scene2Controller.getEquivalencyDip());
        scene2Controller.setEquivalencyDipDate(scene2Controller.getEquivalencyDipDate());
        scene2Controller.setEDUBeyondHS(scene2Controller.getEDUBeyondHS());
        scene2Controller.setUniversityName(scene2Controller.getUniversityName());
        scene2Controller.setLastSemesterOfAttendance(scene2Controller.getLastSemesterOfAttendance());
        scene2Controller.setDateOfGrad(scene2Controller.getDateOfGrad());
        scene2Controller.setAttendCUNY(scene2Controller.getAttendCUNY());
        scene2Controller.setAttendQC(scene2Controller.getAttendQC());
    }

// get all the text field and save them to a global variable
    public void getTextField()
    {
        firstNameField = firstName.getText();
        lastNameField = lastName.getText();
        DOBField = DOB.getValue();
        middleNameField = middleName.getText();
        SSNField = SSN.getText();
        confirmSSNField = confirmSSN.getText();
        CUNYIDField = CUNYID.getText();
        confirmCUNYIDField = confirmCUNYID.getText();
        genderField = genderBox.getValue();
        addStateField = addState.getValue();
        addStreetField = addStreet.getText();
        addCityField = addCity.getText();
        addAptField = addApt.getText();
        addZipField = addZip.getText();
        mailStreetField = mailStreet.getText();
        mailAptField = mailApt.getText();
        mailCityField = mailCity.getText();
        mailZipField = mailZip.getText();
        mailStateField = mailState.getValue();
        AddSameAsMailAdd = addSameAsMailAdd.isSelected();
        phoneNumAsCell = phoneNumAsCellPhone.isSelected();
        emailField = email.getText();
        phoneNumField = phoneNum.getText();
        cellPhoneNumField = cellNum.getText();
        UIDField = UID.getText();
        setInfoBuilder();

    }

    public String appendAddress()
    {
        return(addStreetField+ " "+ addAptField+" "+addCityField+" "+addZipField+" "+addStateField);
    }

    public String appendMailAddress()
    {
        return(mailStreetField+" "+ mailAptField+" "+mailCityField+" "+mailZipField+" "+mailStateField);
    }

    public void setInfoBuilder()
    {
        infoBuilder.setFirstName(firstNameField);
        infoBuilder.setMiddleName(middleNameField);
        infoBuilder.setLastName(lastNameField);
        infoBuilder.setDOB(DOBField);
        infoBuilder.setSSN(SSNField);
        infoBuilder.setEmail(emailField);
        infoBuilder.setAddress(appendAddress());
        infoBuilder.setMailAddress(appendMailAddress());
        infoBuilder.setGender(genderField);
        infoBuilder.setPrimaryPhone(phoneNumField);
        infoBuilder.setCellPhone(cellPhoneNumField);
        infoBuilder.setCUNYID(CUNYIDField);
    }

    public Object getInfoBuilder()
    {
        System.out.println(infoBuilder.getInfo());
        return infoBuilder.getInfo();
    }
    LoginController displayUID = new LoginController();
    //field getter
    public String getFirstName()
    {
        return firstNameField;
    }
    public String getMiddleName()
    {
        return middleNameField;
    }
    public String getLastName()
    {
        return lastNameField;
    }
    public LocalDate getDob()
    {
        return DOBField;
    }
    public String getSSN()
    {
        return SSNField;
    }
    public String getConfirmSSN()
    {
        return confirmSSNField;
    }
    public String getCUNYID()
    {
        return CUNYIDField;
    }
    public String getConfirmCUNYID()
    {
        return confirmCUNYIDField;
    }
    public Object getGender()
    {
        return genderField;
    }
    public Object getAddState()
    {
        return addStateField;
    }
    public String getAddCity(){return addCityField;}
    public String getAddStreet(){return addStreetField;}
    public String getAddApt(){return addAptField;}
    public String getAddZip(){return addZipField;}
    public String getMailStreet(){return mailStreetField;}
    public String getMailApt(){return mailAptField;}
    public String getMailCity(){return mailCityField;}
    public String getMailZip(){return mailZipField;}
    public Object getMailState()
    {
        return mailStateField;
    }
    public boolean getAddSameAsMailAdd(){return AddSameAsMailAdd;}
    public String  getEmail(){return emailField;}
    public String getPhoneNum(){return phoneNumField;}
    public String getCellNum(){return cellPhoneNumField;}
    public boolean getPhoneNumAsCell(){return phoneNumAsCell;}
    public String getUID(){return displayUID.getUID();}

    //Field setter
    public void setFirstName(String text)
    {
        firstName.setText(text);
    }
    public void setMiddleName(String text)
    {
        middleName.setText(text);
    }
    public void setLastName(String text)
    {
        lastName.setText(text);
    }
    public void setSSN(String text)
    {
        SSN.setText(text);
    }
    public void setConfirmSSN(String text)
    {
        confirmSSN.setText(text);
    }
    public void setCUNYID(String text)
    {
        CUNYID.setText(text);
    }
    public void setConfirmCUNYID(String text)
    {
        confirmCUNYID.setText(text);
    }
    public void setGender(Object text)
    {
        genderBox.setValue(text);
    }
    public void setDOB(LocalDate text)
    {
        DOB.setValue(text);
    }
    public void setAddState(Object text)
    {
        addState.setValue(text);
    }
    public void setAddStreet(String text)
    {
        addStreet.setText(text);
    }
    public void setAddCity(String text)
    {
        addCity.setText(text);
    }
    public void setAddApt(String text)
    {
        addApt.setText(text);
    }
    public void setAddZip(String text)
    {
        addZip.setText(text);
    }
    public void setMailStreet(String text)
    {
        mailStreet.setText(text);
    }
    public void setMailApt(String text)
    {
        mailApt.setText(text);
    }
    public void setMailCity(String text)
    {
        mailCity.setText(text);
    }
    public void setMailZip(String text)
    {
        mailZip.setText(text);
    }
    public void setMailState(Object text)
    {
        mailState.setValue(text);
    }
    public void setAddSameAsMailAdd(boolean text){addSameAsMailAdd.setSelected(text);}
    public void setPhoneNumAsCell(boolean text){phoneNumAsCellPhone.setSelected(text);}
    public void setEmail(String text)
    {
        email.setText(text);
    }
    public void setPhoneNum(String text)
    {
        phoneNum.setText(text);
    }
    public void setCellNum(String text)
    {
        cellNum.setText(text);
    }
    public void setUID(String text){UID.setText(text);}

    //ComboBox click event
    public void genderClick(MouseEvent mouseEvent) {
        ObservableList<String> list = FXCollections.observableArrayList("Male","Female","Other");
        genderBox.setItems(list);
    }


    public void stateClick(MouseEvent mouseEvent) {
        ObservableList<String> list = FXCollections.observableArrayList("Alabama",
                "Alaska",
        "Arizona",
        "Arkansas",
        "California",
        "Colorado",
        "Connecticut",
        "Delaware",
        "Florida",
        "Georgia",
        "Hawaii",
        "Idaho",
        "Illinois",
        "Indiana",
        "Iowa",
        "Kansas",
        "Kentucky",
        "Louisiana",
        "Maine",
        "Maryland",
        "Massachusetts",
        "Michigan",
        "Minnesota",
        "Mississippi",
        "Missouri",
        "Montana",
        "Nebraska",
        "Nevada",
        "New Hampshire",
        "New Jersey",
        "New Mexico",
        "New York",
        "North Carolina",
        "North Dakota",
        "Ohio",
        "Oklahoma",
        "Oregon",
        "Pennsylvania",
        "Rhode Island",
        "South Carolina",
        "South Dakota",
        "Tennessee",
        "Texas",
        "Utah",
        "Vermont",
        "Virginia",
        "Washington",
        "West Virginia",
        "Wisconsin");
        addState.setItems(list);
    }

    public void mailStateClick(MouseEvent mouseEvent) {
        ObservableList<String> list = FXCollections.observableArrayList("Alabama",
                "Alaska",
                "Arizona",
                "Arkansas",
                "California",
                "Colorado",
                "Connecticut",
                "Delaware",
                "Florida",
                "Georgia",
                "Hawaii",
                "Idaho",
                "Illinois",
                "Indiana",
                "Iowa",
                "Kansas",
                "Kentucky",
                "Louisiana",
                "Maine",
                "Maryland",
                "Massachusetts",
                "Michigan",
                "Minnesota",
                "Mississippi",
                "Missouri",
                "Montana",
                "Nebraska",
                "Nevada",
                "New Hampshire",
                "New Jersey",
                "New Mexico",
                "New York",
                "North Carolina",
                "North Dakota",
                "Ohio",
                "Oklahoma",
                "Oregon",
                "Pennsylvania",
                "Rhode Island",
                "South Carolina",
                "South Dakota",
                "Tennessee",
                "Texas",
                "Utah",
                "Vermont",
                "Virginia",
                "Washington",
                "West Virginia",
                "Wisconsin");
        mailState.setItems(list);
    }

    public void sameAddressBox(ActionEvent actionEvent) {
        mailStreet.setText(addStreet.getText());
        mailCity.setText(addCity.getText());
        mailApt.setText(addApt.getText());
        mailCity.setText(addCity.getText());
        mailState.setValue(addState.getValue());
        mailZip.setText(addZip.getText());
    }

    public void copyPhoneNum(ActionEvent actionEvent) {
        cellNum.setText(phoneNum.getText());
    }

    public boolean fieldCheck()
    {
        if(firstName.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Please enter first name");
            String s = "Please enter first name";
            alert.setContentText(s);
            alert.showAndWait();
            firstName.setStyle("    -fx-background-color: #FFF0F0");
            return false;
        }
        if(lastName.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Please enter last name");
            String s = "Please enter last name";
            alert.setContentText(s);
            alert.showAndWait();
            lastName.setStyle("    -fx-background-color: #FFF0F0");
            return false;
        }
        if(SSN.getText().equals(confirmSSN.getText()) == false || SSN.getText().isEmpty()||confirmSSN.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Check SSN");
            String s = "SSN field missing or mismatch please check again";
            alert.setContentText(s);
            alert.showAndWait();
            return false;
        }

        if(CUNYID.getText().equals(confirmCUNYID.getText()) == false || CUNYID.getText().isEmpty()||confirmCUNYID.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Check CUNYID");
            String s = "CUNY ID field missing or mismatch please check again";
            alert.setContentText(s);
            alert.showAndWait();
            return false;
        }

        if(DOB.getValue()==null)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Please select DOB");
            String s = "Please select DOB";
            alert.setContentText(s);
            alert.showAndWait();
            DOB.getEditor().setStyle("    -fx-background-color: #FFF0F0");
            return false;
        }

        if(genderBox.getValue()==null)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Please select gender");
            String s = "Please select gender";
            alert.setContentText(s);
            alert.showAndWait();
            genderBox.setStyle("    -fx-background-color: #FFF0F0");
            return false;
        }

        return true;
    }


}