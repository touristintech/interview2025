package com.touristintech.java.main.design_patterns.creational_dp;

public class BuilderDP {

    // private constructor passing the builder inner class object so that object can not be made directly
    private BuilderDP(BuilderDPBuilder builder) {
        this.dept = builder.dept;
        this.name = builder.name;
        this.salary = builder.salary;
        this.empCode = builder.empCode;
    }

    // Required fields should be private with getter methods only.
    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmpCode() {
        return empCode;
    }

    private String name;
    private String dept;
    private double salary;
    private int empCode;

    // For creating the builder object we take the help of static inner
    // classes having the same required fields inside it, and the fields which
    // are not required are provided with optional method inside this class.
    public static class BuilderDPBuilder {
        private String name;
        private String dept;
        private double salary;
        private int empCode;

        public BuilderDPBuilder(int empCode, double salary) {
            this.empCode = empCode;
            this.salary = salary;
        }

        public BuilderDPBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BuilderDPBuilder withDepartment(String dept) {
            this.dept = dept;
            return this;
        }

        public BuilderDP build() {
            return new BuilderDP(this);
        }
    }

}
