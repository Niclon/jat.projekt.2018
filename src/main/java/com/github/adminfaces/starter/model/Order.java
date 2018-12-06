package com.github.adminfaces.starter.model;

import javax.persistence.*;

@Entity
@Table(schema = "jat")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oid;
    @ManyToOne
    private AbstractPerson person;
    @ManyToOne
    private Film film;


}
