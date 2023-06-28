package com.ssi.devicemonitor.entity;

import javafx.beans.property.SimpleStringProperty;

public class HWDevice {

    public final SimpleStringProperty name;
    public final SimpleStringProperty status;
    public final SimpleStringProperty manufacturer;
    public final SimpleStringProperty deviceType;
    public final SimpleStringProperty version;
    public final SimpleStringProperty location;
    public final SimpleStringProperty macAddress;

    public HWDevice(String name, String status, String manufacturer, String deviceType, String version, String location, String macAddress) {
        this.name = new SimpleStringProperty(name);
        this.status = new SimpleStringProperty(status);
        this.manufacturer = new SimpleStringProperty(manufacturer);

        this.deviceType = new SimpleStringProperty(deviceType);
        this.version = new SimpleStringProperty(version);
        this.location = new SimpleStringProperty(location);
        this.macAddress = new SimpleStringProperty(macAddress);
    }

    public SimpleStringProperty getName() {
        return this.name;
    }

    public SimpleStringProperty getStatus() {
        return this.status;
    }

    public SimpleStringProperty getManufacturer() {
        return this.manufacturer;
    }

    public SimpleStringProperty getDeviceType() {
        return this.deviceType;
    }

    public SimpleStringProperty getVersion() {
        return this.version;
    }

    public SimpleStringProperty getLocation() {
        return this.location;
    }

    public SimpleStringProperty getMacAddress() {
        return this.macAddress;
    }

}
