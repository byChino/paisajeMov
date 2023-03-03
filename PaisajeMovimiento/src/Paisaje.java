
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.geom.Ellipse2D;
import java.awt.GradientPaint;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Paisaje extends JFrame {

    private JPanel panel;

    private int elipsex = 300, Eancho = 200, Elargo = 200;
    // Definicion de coordenas de los triangulos
    private int[] Xpuntos1 = { 0, 10, 55 };
    private int[] Ypuntos1 = { 255, 133, 255 };

    private int[] Xpuntos2 = { 25, 88, 139 };
    private int[] Ypuntos2 = { 255, 178, 255 };

    private int[] Xpuntos3 = { 133, 160, 245 };
    private int[] Ypuntos3 = { 255, 149, 255 };

    private int[] Xpuntos4 = { 140, 251, 300 };
    private int[] Ypuntos4 = { 255, 152, 255 };

    private int[] Xpuntos5 = { 251, 300, 362 };
    private int[] Ypuntos5 = { 255, 200, 255 };

    private int[] Xpuntos6 = { 325, 441, 497 };
    private int[] Ypuntos6 = { 255, 185, 255 };

    private int[] Xpuntos7 = { 465, 540, 609 };
    private int[] Ypuntos7 = { 255, 189, 255 };

    private int[] Xpuntos8 = { 607, 680, 729 };
    private int[] Ypuntos8 = { 255, 136, 255 };

    private int[] Xpuntos9 = { 727, 754, 800 };
    private int[] Ypuntos9 = { 255, 166, 255 };

    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Paisaje frame = new Paisaje();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }// fin de la clase main

    // clase JFrame
    public Paisaje() {
        // JFrame o lieanzo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Paisaje de una amanecer");
        setSize(800, 400);
        setLocationRelativeTo(null);
        agregarPanel();

    }// fin de la clase main

    public void agregarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.add(panel);
        panel.setFocusable(true);

        eventosDelTeclado();
    }

    // clase de eventos de las flechas del teclado
    private void eventosDelTeclado() {
        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Movemos la luna hacia el lado izquierdo y disminuimos los valores que tiene
                // x1 y x2
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    elipsex -= 10;

                    Xpuntos1[0] -= 10;
                    Xpuntos1[1] -= 10;
                    Xpuntos1[2] -= 10;

                    Xpuntos2[0] -= 10;
                    Xpuntos2[1] -= 10;
                    Xpuntos2[2] -= 10;

                    Xpuntos3[0] -= 10;
                    Xpuntos3[1] -= 10;
                    Xpuntos3[2] -= 10;

                    Xpuntos4[0] -= 10;
                    Xpuntos4[1] -= 10;
                    Xpuntos4[2] -= 10;

                    Xpuntos5[0] -= 10;
                    Xpuntos5[1] -= 10;
                    Xpuntos5[2] -= 10;

                    Xpuntos6[0] -= 10;
                    Xpuntos6[1] -= 10;
                    Xpuntos6[2] -= 10;

                    Xpuntos7[0] -= 10;
                    Xpuntos7[1] -= 10;
                    Xpuntos7[2] -= 10;

                    Xpuntos8[0] -= 10;
                    Xpuntos8[1] -= 10;
                    Xpuntos8[2] -= 10;

                    Xpuntos9[0] -= 10;
                    Xpuntos9[1] -= 10;
                    Xpuntos9[2] -= 10;
                }
                // Movemos la luna hacia el lado derecho y aumentados los valores que tiene x1 y
                // x2
                else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    elipsex += 10;

                    Xpuntos1[0] += 10;
                    Xpuntos1[1] += 10;
                    Xpuntos1[2] += 10;

                    Xpuntos2[0] += 10;
                    Xpuntos2[1] += 10;
                    Xpuntos2[2] += 10;

                    Xpuntos3[0] += 10;
                    Xpuntos3[1] += 10;
                    Xpuntos3[2] += 10;

                    Xpuntos4[0] += 10;
                    Xpuntos4[1] += 10;
                    Xpuntos4[2] += 10;

                    Xpuntos5[0] += 10;
                    Xpuntos5[1] += 10;
                    Xpuntos5[2] += 10;

                    Xpuntos6[0] += 10;
                    Xpuntos6[1] += 10;
                    Xpuntos6[2] += 10;

                    Xpuntos7[0] += 10;
                    Xpuntos7[1] += 10;
                    Xpuntos7[2] += 10;

                    Xpuntos8[0] += 10;
                    Xpuntos8[1] += 10;
                    Xpuntos8[2] += 10;

                    Xpuntos9[0] += 10;
                    Xpuntos9[1] += 10;
                    Xpuntos9[2] += 10;

                }

                // Aumnetamos el tamaño de la luna y aumentados los valores que tiene ancho y
                // largo
                else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    Eancho += 10;
                    Elargo += 10;

                }
                // Disminuimos el tamaño de la luna y restamos los valores que tiene ancho y
                // largo
                else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    Eancho -= 10;
                    Elargo -= 10;

                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        panel.addKeyListener(eventoTeclado);

    }// fin de la clase de eventos

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Dibujamos un rectangulo con un fondo degrado de color lila a naranja
        // representando el amanecer //
        Graphics2D g2F = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(0, 0, new Color(180, 70, 200), 0, getHeight() / 2,
                new Color(255, 165, 0));

        g2F.setPaint(gradient);
        g2F.fillRect(0, 0, getWidth(), getHeight());

        // Dibujo de un sol
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.YELLOW);

        Ellipse2D e1 = new Ellipse2D.Double(elipsex, (getHeight() / 2) - 50, Eancho, Elargo);
        g2.fill(e1);
        repaint();
        // Dibujo de montajas

        // Crear el objeto Polygon con las coordenadas definidas
        Graphics2D g2d = (Graphics2D) g;
        Polygon Triangulo1 = new Polygon(Xpuntos1, Ypuntos1, 3);
        Polygon Triangulo2 = new Polygon(Xpuntos2, Ypuntos2, 3);
        Polygon Triangulo3 = new Polygon(Xpuntos3, Ypuntos3, 3);
        Polygon Triangulo4 = new Polygon(Xpuntos4, Ypuntos4, 3);
        Polygon Triangulo5 = new Polygon(Xpuntos5, Ypuntos5, 3);
        Polygon Triangulo6 = new Polygon(Xpuntos6, Ypuntos6, 3);
        Polygon Triangulo7 = new Polygon(Xpuntos7, Ypuntos7, 3);
        Polygon Triangulo8 = new Polygon(Xpuntos8, Ypuntos8, 3);
        Polygon Triangulo9 = new Polygon(Xpuntos9, Ypuntos9, 3);

        // Dibujar el polígono utilizando fillPolygon
        g2d.setColor(new Color(25, 16, 9)); // color cafe oscuro
        g2d.fillPolygon(Triangulo1);
        g2d.fillPolygon(Triangulo2);
        g2d.fillPolygon(Triangulo3);
        g2d.fillPolygon(Triangulo4);
        g2d.fillPolygon(Triangulo5);
        g2d.fillPolygon(Triangulo6);
        g2d.fillPolygon(Triangulo7);
        g2d.fillPolygon(Triangulo8);
        g2d.fillPolygon(Triangulo9);

        // Dibujo del pasto

        Graphics2D g2P = (Graphics2D) g;
        GradientPaint gradientP = new GradientPaint(0, 0, Color.GREEN, 0, getHeight(), Color.black);

        g2P.setPaint(gradientP);
        g2P.fillRect(0, (getHeight() / 2) + 55, getWidth(), getHeight());

    }

}