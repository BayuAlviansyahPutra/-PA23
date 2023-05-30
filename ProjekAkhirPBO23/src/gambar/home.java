package gambar;

import java.awt.*;
import javax.swing.*;

public class home extends JPanel {
    
    private final Image image;
    
    public home(){
        image =  new ImageIcon(getClass().getResource("/gambar/Homee.png")).getImage();

    }
    @Override
    
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        
        Graphics2D gd = (Graphics2D) graphics.create();
        gd.drawImage(image, 0,0, getWidth(),getHeight(),null);
        gd.dispose();
    }
}
