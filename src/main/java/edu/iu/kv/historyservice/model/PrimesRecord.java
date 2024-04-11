package edu.iu.kv.historyservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PrimesRecord {

    @Id
    @GeneratedValue

    private int id;
    priavte String customer;
    private String n;
    private boolean isPrime;

    public int getId() {return id;}
}
