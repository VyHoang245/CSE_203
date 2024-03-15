package services;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import picture.GetImage;



public class IconSize_Services {//Raven
    
    private String path;
    private JLabel lable;

    public IconSize_Services(String path, JLabel lable){
        this.path = path;
        this.lable = lable;
    }
    
    public Icon getIconAsLabelSize(){
        ImageIcon imageIcon = new ImageIcon(GetImage.class.getResource(path));//get imange from picture package through GetImage
        Image image = imageIcon.getImage();
        Image imgScale = image.getScaledInstance(lable.getWidth(), lable.getHeight(), Image.SCALE_SMOOTH);//Scale the picture
        ImageIcon tempt = new ImageIcon(imgScale);//Change Image to ImageIcon
        return tempt;
    }
    
}
