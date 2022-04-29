package com.example.demo4;

public class InfoBase
{
    protected String firstName;      //must require a input
    protected String lastName;      //must require a input
    protected String middleName;   //optional
    protected String email;         //must require a input
    protected String address;       //must require a input
    protected String mailAddress;   // optional
    protected String SSN;              //must require a input
    protected String CUNYID;           //must require a input
    protected String primaryPhone;     //must require a input
    protected String cellPhone;        //must require a input
    protected Object DOB;              //must require a input
    protected Object gender;           //must require a input


    @Override
    public String toString() {
        return "InfoBase{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", SSN=" + SSN +
                ", CUNYID=" + CUNYID +
                ", primaryPhone=" + primaryPhone +
                ", cellPhone=" + cellPhone +
                ", DOB=" + DOB +
                ", gender=" + gender +
                '}';
    }
}
