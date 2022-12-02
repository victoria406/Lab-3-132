package org.example;


class CommissionEmployee extends Employee{
    double commissionRate;
    double grossSales;
    CommissionEmployee(double commissionRate, double grossSales){
        super("Amanda","Banana",5678);
        this.commissionRate=commissionRate;
        this.grossSales=grossSales;
    }

    public String toString() {
        return getClass().getName() + "\n"
                + "The Commission Employee first name is " + super.firstName + "\n"
                + "The Commission Employee Last Name is " + super.lastName + "\n"
                + "The Commission Employee Id Number is " + super.idNumber + "\n"
                + "The Commission Employee gross sales is " + this.grossSales + "\n"
                + "The Commission Employee commission rate is " + this.commissionRate;
    }
}