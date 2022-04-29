package com.example.demo4;

import java.security.ProtectionDomain;

public class EducationBase {
    protected Object HSDip;
    protected String HSName;
    protected Object HSGradDate;
    protected Object equivalencyDip;
    protected Object equivalencyDipDate;
    protected Object EDUBeyondHS;
    protected String universityName;
    protected Object lastSemesterOfAttendance;
    protected Object dateOfGrad;
    protected Object attendCUNY;
    protected Object attendQC;



    @Override
    public String toString() {
        return "EducationBase{" +
                "HSDip=" + HSDip +
                ", HSName='" + HSName + '\'' +
                ", HSGradDate=" + HSGradDate +
                ", equivalencyDip=" + equivalencyDip +
                ", equivalencyDipDate=" + equivalencyDipDate +
                ", EDUBeyondHS=" + EDUBeyondHS +
                ", universityName='" + universityName + '\'' +
                ", lastSemesterOfAttendance=" + lastSemesterOfAttendance +
                ", dateOfGrad=" + dateOfGrad +
                ", attendCUNY=" + attendCUNY +
                ", attendQC=" + attendQC +
                '}';
    }


}
