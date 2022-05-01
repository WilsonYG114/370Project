package com.example.QCApplication_BuilderPattern;

public class InfoBuilder extends InfoBase{
     //must require a input
     public InfoBuilder setFirstName(String firstName) {
          this.firstName = firstName;
          return this;
     }
     //must require a input
     public InfoBuilder setLastName(String lastName) {
          this.lastName = lastName;
          return this;
     }
     public InfoBuilder setMiddleName(String middleName) {
          this.middleName = middleName;
          return this;
     }
     //must require a input
     public InfoBuilder setEmail(String email) {
          this.email = email;
          return this;
     }
     //must require a input
     public InfoBuilder setAddress(String address) {
          this.address = address;
          return this;
     }
     //can be same as address if same copy from address
     public InfoBuilder setMailAddress(String mailAddress) {
          this.mailAddress = mailAddress;
          return this;
     }

     //must require a input
     public InfoBuilder setSSN(String SSN) {
          this.SSN = SSN;
          return this;
     }

     //must require a input
     public InfoBuilder setCUNYID(String CUNYID) {
          this.CUNYID = CUNYID;
          return this;
     }

     //must require a input
     public InfoBuilder setPrimaryPhone(String primaryPhone) {
          this.primaryPhone = primaryPhone;
          return this;
     }

     //must require a input
     public InfoBuilder setCellPhone(String cellPhone) {
          this.cellPhone = cellPhone;
          return this;
     }

     //must require a input
     public InfoBuilder setDOB(Object DOB) {
          this.DOB = DOB;
          return this;
     }

     //must require a input
     public InfoBuilder setGender(Object gender) {
          this.gender = gender;
          return this;
     }


     public InfoBase getInfo()
     {

          return new Info( firstName, lastName, middleName, email, address, mailAddress, SSN, CUNYID, primaryPhone, cellPhone, DOB, gender);
     }



     private class Info extends InfoBase
     {
          public Info(String firstName,String lastName, String middleName, String email, String address, String mailAddress, String SSN, String CUNYID, String primaryPhone, String cellPhone, Object DOB, Object gender)
          {
               this.firstName = firstName;
               this.lastName = lastName;
               this.middleName = middleName;
               this.email = email;
               this.address = address;
               this.mailAddress = mailAddress;
               this.SSN = SSN;
               this.CUNYID = CUNYID;
               this.primaryPhone = primaryPhone;
               this.cellPhone = cellPhone;
               this.DOB = DOB;
               this.gender = gender;
          }

     }
}