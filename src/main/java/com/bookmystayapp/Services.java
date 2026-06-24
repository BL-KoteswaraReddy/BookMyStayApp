package com.bookmystayapp;

public class Services
{
    public Services() {
    }

    private String serviceName;
    private double serviceCost;

    public String getServiceName() {
        return serviceName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public Services(String serviceName, double serviceCost) {
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    @Override
    public String toString() {
        return "Services{" +
                "serviceName='" + serviceName + '\'' +
                ", serviceCost='" + serviceCost + '\'' +
                '}';
    }

}
