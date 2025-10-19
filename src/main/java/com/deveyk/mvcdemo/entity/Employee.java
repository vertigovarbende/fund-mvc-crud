package com.deveyk.mvcdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    // private instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;


    // Constructors

    // No-arg/Default constructors
    // +Employee()
    public Employee() {

    }

    // Smart constructor
    // +Employee(firstName:String, lastName:String, email:String)
    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getter and Setter methods

    // Getter method for private instance variable 'id'
    public int getId() {
        return id;
    }

    // Setter method for private instance variable 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for private instance variable 'firstName'
    public String getFirstName() {
        return firstName;
    }

    // Setter method for private instance variable 'firstName'
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter method for private instance variable 'lastName'
    public String getLastName() {
        return lastName;
    }

    // Setter method for private instance variable 'lastName'
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter method for private instance variable 'email'
    public String getEmail() {
        return email;
    }

    // Setter method for private instance variable 'email'
    public void setEmail(String email) {
        this.email = email;
    }

    // toString
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
