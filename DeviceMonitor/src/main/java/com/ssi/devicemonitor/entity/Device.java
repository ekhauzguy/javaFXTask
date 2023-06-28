package com.ssi.devicemonitor.entity;

public abstract class Device {
    private String name;
    private String status;
    private String manufacturer;
    private DeviceType deviceType;
    private String version;
    public Device(String name){
        setName(name);
        setStatus("Offline"); // Set initial status to Offline
    }
    public Device(String name, String manufacturer, DeviceType deviceType, String version) {
        this(name);
        setManufacturer(manufacturer);
        setDeviceType(deviceType);
        setVersion(version);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
