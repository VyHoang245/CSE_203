package picture;

import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GetImage {
    public static Icon malePic = new ImageIcon(
            Toolkit.getDefaultToolkit().
                    createImage(GetImage.class.getResource("male1.png")));
    public static Icon femalePic = new ImageIcon(
            Toolkit.getDefaultToolkit().
                    createImage(GetImage.class.getResource("female.png")));
    public static Icon backIcon = new ImageIcon(
            Toolkit.getDefaultToolkit().
                    createImage(GetImage.class.getResource("back.png")));
}
