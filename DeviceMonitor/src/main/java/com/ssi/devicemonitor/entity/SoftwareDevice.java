package com.ssi.devicemonitor.entity;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class SoftwareDevice extends Device {
    public SoftwareDevice(String name, String manufacturer, DeviceType deviceType, String version, String location, String macAddress) {
        super(name, manufacturer, deviceType, version);
    }

    private LocalDateTime installationDateTime;

    public LocalDateTime getInstallationDateTime() {
        return installationDateTime;
    }

    public void setInstallationDateTime(LocalDateTime installationDateTime) {
        this.installationDateTime = installationDateTime;
    }
}
