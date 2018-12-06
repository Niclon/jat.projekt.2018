package com.github.adminfaces.starter.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(schema = "jat")
public class Customer extends AbstractPerson {
    @OneToMany(mappedBy = "customer")
    private Set<Order> orders;

    public Customer() {
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
