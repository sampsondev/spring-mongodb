package com.rbt.model;

import lombok.Data;
import org.joda.time.DateTime;

import java.util.List;

@Data
public class Contract {
    public String contractNumber;
    public String chargeCode;
    public String contractName;
    public String pointOfContactName;
    public String pointOfContactEmail;
    public List<Object> messageOrders;
    public String status;
    public List<Object> users;
    public List<Device> devices;
    public DateTime serviceEndDate;
    public List<Object> pointsOfContact;
}