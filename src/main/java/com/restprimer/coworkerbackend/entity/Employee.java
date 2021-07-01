package com.restprimer.coworkerbackend.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name= "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String fullName; //Полное имя

    @Column(name = "uuid")
    private String uuid = UUID.randomUUID().toString();

    @Column(name = "joined")
    @Temporal(TemporalType.DATE)
    private Date joinedDate; //Дата приема

    @Column(name = "dismissed")
    @Temporal(TemporalType.DATE)
    private Date dismissed; //Дата увольнения

    @Column(name = "salary")
    private double salary; //Зарплата


    public Employee() {
    }

    public Employee(String fullName, Date joinedDate, Date dismissed, double salary) {
        this.fullName = fullName;
        this.joinedDate = joinedDate;
        this.dismissed = dismissed;
        this.salary = salary;
    }

    public String getUuid() {
        return uuid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Date getDismissed() {
        return dismissed;
    }

    public void setDismissed(Date dismissed) {
        this.dismissed = dismissed;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
