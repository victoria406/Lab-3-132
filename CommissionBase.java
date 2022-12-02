package org.example;

public class CommissionBase extends CommissionEmployee{
    double baseSalary;
    CommissionBase(double baseSalary){
        super(12.5,1200.50);
        this.baseSalary=baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBasesSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public String toString() {
        return getClass().getName() + "\n"
                + "The Commission Base Plus first name is " + super.firstName + "\n"
                + "The Commission Base Plus Last Name is " + super.lastName + "\n"
                + "The Commission Base Plus Id Number is " + super.idNumber + "\n"
                + "The Commission Base Plus starting salary is " + this.baseSalary + "\n"
                + "The Commission Base Plus gross sales is " + super.grossSales + "\n"
                + "The Commission Base Plus commission rate is " + super.commissionRate;
    }
}