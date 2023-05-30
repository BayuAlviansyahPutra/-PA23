package gambar;

import java.awt.*;
import javax.swing.*;

public class riwayat extends JPanel {
    
    private final Image image;
    
    public riwayat(){
        image =  new ImageIcon(getClass().getResource("/gambar/Riwayatt.jpg")).getImage();

    }
    @Override
    
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        
        Graphics2D gd = (Graphics2D) graphics.create();
        gd.drawImage(image, 0,0, getWidth(),getHeight(),null);
        gd.dispose();
    }
}
