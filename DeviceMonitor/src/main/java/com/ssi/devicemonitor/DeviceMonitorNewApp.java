package com.ssi.devicemonitor;


import com.ssi.devicemonitor.entity.HWDevice;
import com.ssi.devicemonitor.entity.HardwareDeviceTableView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DeviceMonitorNewApp extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Device Monitor");
        stage.setWidth(600);
        stage.setHeight(400);

        final Label label = new Label("Devices");
        label.setFont(new Font("Arial", 20));


        TableView<HWDevice> tableView  = new HardwareDeviceTableView().createTableView();


        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, tableView);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }




}
