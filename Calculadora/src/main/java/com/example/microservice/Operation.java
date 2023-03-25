package com.example.microservice;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Document
public class Operation {

    @Id
    private String id;

    @Field
    private String operation;

    @Field
    private double valueA;

    @Field
    private double valueB;

    @Field
    private double result;

    public void setId(String s) {
    }

    public void setOperation(String operation) {
    }

    public void setValueA(double a) {
    }

    public void setValueB(double b) {
    }

    public void setResult(double result) {
    }

    // Constructor, getters y setters
}