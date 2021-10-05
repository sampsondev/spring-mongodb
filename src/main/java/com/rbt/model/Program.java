package com.rbt.model;

import java.util.List;
import org.joda.time.DateTime;

public class Program {
    public String _class;
    public String programName;
    public String customerName;
    public List<Contract> contracts;

}


class Contract {
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

class Device{
    public String deviceType;
    public int entityId;
    public String name;
}

