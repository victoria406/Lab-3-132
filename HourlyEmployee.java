package org.example;

class HourlyEmployee extends Employee{
    double wage;
    double hoursWorked;
    HourlyEmployee(double wage, double hoursWorked){
        super("John","Nelson",1234);
        this.wage=wage;
        this.hoursWorked=hoursWorked;
    }
    public String toString() {
        return getClass().getName() + "\n"
                + "The Hourly Employee first name is " + super.firstName + "\n"
                + "The Hourly Employee Last Name is " + super.lastName + "\n"
                + "The Hourly Employee Id Number is " + super.idNumber + "\n"
                + "The Hourly Employee wage is " + this.wage + "\n"
                + "The Hourly Employee hours worked are "+ this.hoursWorked;
    }
}
