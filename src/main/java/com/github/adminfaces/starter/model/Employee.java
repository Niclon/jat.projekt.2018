package com.github.adminfaces.starter.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "jat")
public class Employee extends AbstractPerson {
    int salary;

    public Employee() {
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
