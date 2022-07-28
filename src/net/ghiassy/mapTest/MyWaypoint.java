/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.ghiassy.mapTest;

import java.awt.event.ActionEvent;
import javax.annotation.Nonnull;
import javax.swing.JButton;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author saeed
 */
public class MyWaypoint extends DefaultWaypoint {

    private final User user;
    private final JButton button;

    public User getUser() {
        return user;
    }

    public JButton getButton() {
        return button;
    }

    public MyWaypoint(@Nonnull User user, EventWaypoint event, GeoPosition coord) {
        super(coord);
        this.user = user;
        this.user.setPosition(coord);

        button = new LocationButton();
        button.addActionListener((ActionEvent ae) -> {
            System.out.println(
                    "User Info:\n----------------\nUsername: " + user.getUserName()
                    + "\nUserID: " + user.getId()
                    + "\nUser Geo Location: " + user.getPosition().toString());
            event.selected(MyWaypoint.this);
        });

    }

}
