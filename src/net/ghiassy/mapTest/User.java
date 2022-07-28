package net.ghiassy.mapTest;

import java.util.UUID;
import javax.annotation.Nonnull;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author saeed
 */
public class User {

    private final UUID id;
    private GeoPosition mPosition = null;
    private String userName;

    public User(@Nonnull String userName) {
        this.id = UUID.randomUUID();
        this.userName = userName;
    }

    public UUID getId() {
        return id;
    }

    public GeoPosition getPosition() {
        return mPosition;
    }
    
    public void setPosition(GeoPosition Position) {
        this.mPosition = Position;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
