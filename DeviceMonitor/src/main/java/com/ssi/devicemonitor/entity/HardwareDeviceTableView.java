package com.ssi.devicemonitor.entity;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HardwareDeviceTableView {

    private final ObservableList<HWDevice> data =
            FXCollections.observableArrayList(
                    new HWDevice("Device1", "OfLine","Manufacturer1","HARDWAREDEVICES","Version1","Location1","macAddress1"),
                    new HWDevice("Device2", "OffLine","Manufacturer2","HARDWAREDEVICES","Version2","Location2","macAddress2"),
                    new HWDevice("Device3", "OffLine","Manufacturer1","HARDWAREDEVICES","Version3","Location3","macAddress3"),
                    new HWDevice("Device4", "OffLine","Manufacturer4","HARDWAREDEVICES","Version4","Location4","macAddress4")
            );

    public TableView<HWDevice> createTableView() {

        TableView<HWDevice> tableView = new TableView<HWDevice>();
        tableView.setEditable(true);

        TableColumn nameCol = new TableColumn("Name");
        nameCol.setMinWidth(100);
        nameCol.setCellValueFactory(new PropertyValueFactory<HWDevice, String>("name"));

        TableColumn statusCol = new TableColumn("Status");
        statusCol.setMinWidth(100);
        statusCol.setCellValueFactory(new PropertyValueFactory<HWDevice, String>("status"));

        TableColumn manufacturerCol = new TableColumn("Manufacturer");
        manufacturerCol.setMinWidth(100);
        manufacturerCol.setCellValueFactory(new PropertyValueFactory<HWDevice, String>("manufacturer"));

        TableColumn deviceTypeCol = new TableColumn("Device Type");
        deviceTypeCol.setMinWidth(100);
        deviceTypeCol.setCellValueFactory(new PropertyValueFactory<HWDevice, String>("deviceType"));

        TableColumn versionCol = new TableColumn("Version");
        versionCol.setMinWidth(100);
        versionCol.setCellValueFactory(new PropertyValueFactory<HWDevice, String>("version"));

        TableColumn locationCol = new TableColumn("location");
        locationCol.setMinWidth(100);
        locationCol.setCellValueFactory(new PropertyValueFactory<HWDevice, String>("location"));

        TableColumn macAddressCol = new TableColumn("MACAddress");
        macAddressCol.setMinWidth(100);
        macAddressCol.setCellValueFactory(new PropertyValueFactory<HWDevice, String>("macAddress"));

        tableView.setItems(data);

        tableView.getColumns().addAll(nameCol, statusCol, manufacturerCol, deviceTypeCol, versionCol, locationCol, macAddressCol);
        tableView.setEditable(true);
        tableView.setPrefWidth(500);
        tableView.setPrefHeight(300);
        tableView.setItems(data);

        return tableView;
    }




}

