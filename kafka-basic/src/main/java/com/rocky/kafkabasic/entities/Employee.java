package com.rocky.kafkabasic.entities;

public class Employee {
    private int eId;
    private String eName;
    private int eAge;

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eAge=" + eAge +
                ", eSal=" + eSal +
                '}';
    }

    private double eSal;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        this.eAge = eAge;
    }

    public double geteSal() {
        return eSal;
    }

    public void seteSal(double eSal) {
        this.eSal = eSal;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }
}
