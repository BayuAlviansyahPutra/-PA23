package gambar;

import java.awt.*;
import javax.swing.*;

public class login extends JPanel {
    
    private final Image image;
    
    public login(){
        image =  new ImageIcon(getClass().getResource("/gambar/LoginAdmin.png")).getImage();

    }
    @Override
    
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        
        Graphics2D gd = (Graphics2D) graphics.create();
        gd.drawImage(image, 0,0, getWidth(),getHeight(),null);
        gd.dispose();
    }
}
