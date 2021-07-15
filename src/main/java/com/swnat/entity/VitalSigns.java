package com.swnat.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Table(name = "COR_VITAL_SIGNS")
@Entity(name = "cor_VitalSigns")
public class VitalSigns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "BLOOD_PRESSURE", nullable = false)
    @NotNull
    private Integer bloodPressure;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "REGISTRATION_DATE", nullable = false)
    private Date registrationDate;

    @Column(name = "SYSTOLIC", nullable = false)
    @NotNull
    private Integer systolic;

    @NotNull
    @Column(name = "DIASTOLIC", nullable = false)
    private Integer diastolic;

    @ManyToOne
    @JoinColumn(name = "PATIENT_ID")
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(Integer diastolic) {
        this.diastolic = diastolic;
    }

    public Integer getSystolic() {
        return systolic;
    }

    public void setSystolic(Integer systolic) {
        this.systolic = systolic;
    }

    public Integer getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Integer bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

}
