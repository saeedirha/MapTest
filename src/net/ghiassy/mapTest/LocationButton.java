
package net.ghiassy.mapTest;

import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author saeed
 */
public class LocationButton extends JButton{

    public LocationButton() {
        
        setContentAreaFilled(false);
        setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/net/ghiassy/drawable/location24x24.png")));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setSize(new Dimension(24, 24));
        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
    }

}
