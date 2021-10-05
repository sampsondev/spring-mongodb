package com.rbt.model;

import java.util.List;

import lombok.Data;



@Data
public class Program {
    public String _class;
    public String programName;
    public String customerName;
    public List<Contract> contracts;

}



