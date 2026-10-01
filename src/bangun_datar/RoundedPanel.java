/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

//tambahan import untuk desain tambahan berupa border 
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

//import tambahan untuk efek seetelah mose diarahkan
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import javax.swing.border.EmptyBorder;
/**
 *
 * @author acer
 */
public class RoundedPanel extends JPanel {

    private int radius = 20;
    private int shadowSize = 7;
    private Color borderColor = new Color(33, 150, 243);
    private int borderWidth = 2;
    
    //import tambahan untuk efek seetelah mouse diarahkan
    private boolean hovered = false;
    //private Color normalBackground;
    
    //konstruktor
    public RoundedPanel() {

        setOpaque(false);
}
        //mengaktifkan hover
        public void aktifkanHover() {

    tambahHoverListener(this);

    for (java.awt.Component component : getComponents()) {

        if (component instanceof java.awt.Container container) {
            tambahHoverKeContainer(container);
        } else {
            tambahHoverListener(component);
        }
    }
}

private void tambahHoverKeContainer(java.awt.Container container) {

    tambahHoverListener(container);

    for (java.awt.Component component : container.getComponents()) {

        if (component instanceof java.awt.Container child) {
            tambahHoverKeContainer(child);
        } else {
            tambahHoverListener(component);
        }
    }
}

private void tambahHoverListener(java.awt.Component component) {

    component.addMouseListener(new MouseAdapter() {

        @Override
        public void mouseEntered(MouseEvent e) {
            hovered = true;
            shadowSize = 10;
            repaint();
        }

        @Override
        public void mouseExited(MouseEvent e) {
            hovered = false;
            shadowSize = 7;
            repaint();
        }
    });
        // Padding isi card
        //setBorder(new EmptyBorder(15, 15, 15, 15));
}

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        int width = getWidth();
        int height = getHeight();

        //shadow lembut
       for (int i = shadowSize; i > 0; i--) {

       int alpha = 5 + (shadowSize - i) * 3;

        g2.setColor(new Color(0, 0, 0, alpha));

        g2.fillRoundRect(
                i,
                i,
                width - i - 1,
                height - i - 1,
                radius,
                radius
        );
} 
        
        // SHADOW
//        g2.setColor(new Color(0, 0, 0, 35));
//
//        g2.fillRoundRect(
//                shadowSize,
//                shadowSize,
//                width - shadowSize - 1,
//                height - shadowSize - 1,
//                radius,
//                radius
//        );

        // BACKGROUND
        g2.setColor(getBackground());

        g2.fillRoundRect(
                0,
                0,
                width - shadowSize - 1,
                height - shadowSize - 1,
                radius,
                radius
        );

        // BORDER
        g2.setColor(borderColor);

        g2.setStroke(new BasicStroke(borderWidth));

        g2.drawRoundRect(
                borderWidth / 2,
                borderWidth / 2,
                width - shadowSize - borderWidth,
                height - shadowSize - borderWidth,
                radius,
                radius
        );

        g2.dispose();

        super.paintComponent(g);
    }

    public void setRadius(int radius) {
        this.radius = radius;
        repaint();
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint();
    }

    public void setShadowSize(int shadowSize) {
        this.shadowSize = shadowSize;
        repaint();
    }
}
