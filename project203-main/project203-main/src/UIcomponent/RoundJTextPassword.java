
package UIcomponent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author admin
 */
public class RoundJTextPassword extends JPasswordField{
    
    public RoundJTextPassword(){
        setBackground(new Color(255, 255, 255, 0));
        setOpaque(false);
        setBorder(new EmptyBorder(10 , 10, 10, 10));
        setFont(new Font("sansserrif", 0, 14));
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//smooth
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);//smooth
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(0, 0, width, height, height, height);//make round
        super.paintComponent(g);
    }
    
    
}
