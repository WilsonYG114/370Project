package com.example.QCApplication_BuilderPattern;

public class EducationBuilder extends EducationBase{
    public EducationBuilder setHSDip(Object HSDip)
    {
        this.HSDip = HSDip;
        return this;
    }

    public EducationBuilder setHSName(String HSName)
    {
        this.HSName = HSName;
        return this;
    }

    public EducationBuilder setHSGradDate(Object HSGradDate)
    {
        this.HSGradDate = HSGradDate;
        return this;
    }

    // public EducationBuilder set
    public EducationBuilder setEquivalencyDip(Object equivalencyDip)
    {
        this.equivalencyDip = equivalencyDip;
        return this;
    }

    public EducationBuilder setEquivalencyDipDate(Object equivalencyDipDate)
    {
        this.equivalencyDipDate = equivalencyDipDate;
        return this;
    }

    public EducationBuilder setEDUBeyondHS(Object EDUBeyondHS)
    {
        this.EDUBeyondHS = EDUBeyondHS;
        return this;
    }
    public EducationBuilder setUniversityName(String universityName)
    {
        this.universityName = universityName;
        return this;
    }

    public EducationBuilder setLastSemesterOfAttendance(Object lastSemesterOfAttendance)
    {
        this.lastSemesterOfAttendance = lastSemesterOfAttendance;
        return this;
    }
    public EducationBuilder setDateOfGrad(Object dateOfGrad)
    {
        this.dateOfGrad = dateOfGrad;
        return this;
    }

    public EducationBuilder setAttendCUNY(Object attendCUNY)
    {
        this.attendCUNY = attendCUNY;
        return this;
    }

    public EducationBuilder setAttendQC(Object attendQC)
    {
        this.attendQC = attendQC;
        return this;
    }

    public EducationBase getEDUInfo()
    {
        return new EDUInfo(HSDip,HSName,HSGradDate
                            ,equivalencyDip,equivalencyDipDate,EDUBeyondHS
                            ,universityName,lastSemesterOfAttendance,dateOfGrad
                            ,attendCUNY,attendQC);
    }

    public class EDUInfo extends EducationBase
    {
        public EDUInfo(Object HSDip,String HSName,Object HSGradDate,Object equivalencyDip,Object equivalencyDipDate,Object EDUBeyondHS,String universityName,Object lastSemesterOfAttendance,Object dateOfGrad,Object attendCUNY,Object attendQC)
        {
            this.HSDip = HSDip;
            this.HSName = HSName;
            this.HSGradDate = HSGradDate;
            this.equivalencyDip = equivalencyDip;
            this.equivalencyDipDate = equivalencyDipDate;
            this.EDUBeyondHS = EDUBeyondHS;
            this.universityName = universityName;
            this.lastSemesterOfAttendance = lastSemesterOfAttendance;
            this.dateOfGrad = dateOfGrad;
            this.attendCUNY = attendCUNY;
            this.attendQC = attendQC;
        }
    }


}
