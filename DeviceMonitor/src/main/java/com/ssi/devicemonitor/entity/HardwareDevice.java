package com.ssi.devicemonitor.entity;

public class HardwareDevice extends Device {
   public HardwareDevice(String name, String manufacturer, DeviceType deviceType, String version, String location, String macAddress) {
        super(name, manufacturer, deviceType, version);
        setLocation(location);
        setMacAddress(macAddress);
    }
    private String location;
    private String macAddress;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}
