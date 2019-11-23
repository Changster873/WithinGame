package view;

import controller.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Screen {

    /**
     * Store the frames in which the game will create.
     */
    public JFrame frame;
    public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    public int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    public Screen() {
        this.frame = new JFrame();
        frame.setSize(width, height);
        frame.setLayout(null);

        JPanel panel = new Panel();
        panel.setBounds(0,0,1000,1000);
        panel.setBackground(Color.white);
        panel.setFocusable(true);

        frame.add(panel);

        frame.setVisible(true);
    }
}

class Panel extends JPanel implements ActionListener, KeyListener {

    Timer timer = new Timer(200,this);
    // delay time
    int delay = 0;

    // player position
    int playerX = 100;
    int playerY = 0;
    Graphics graphics;
    // dimensions of each block
    int xDimension = 100;
    int yDimension = 100;
    // current player sprite
    Image img = Toolkit.getDefaultToolkit().getImage("/Users/chansocheatchheang/Desktop/WithinGame/src/down.png");

    // state (down)

    // state (up)

    // state (left)

    // state (right)

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // get the map that the game currently wants to render
        int[][] gameMap = Game.map.getMap();

        // start drawing the map out
        int startY = 0;
        for (int i=0; i<gameMap.length; i++) {
            int startX = 0;
            for (int j=0; j<gameMap[i].length; j++) {
                if (gameMap[i][j] == 0) {
                    Graphics2D g2 = (Graphics2D)g;
                    g2.drawImage(Toolkit.getDefaultToolkit().getImage("/Users/chansocheatchheang/Desktop/WithinGame/src/wall.png"),startX,startY,xDimension,yDimension,this);
                }
                else if (gameMap[i][j] == 1) {
                    Graphics2D g2 = (Graphics2D)g;
                    g2.drawImage(Toolkit.getDefaultToolkit().getImage("/Users/chansocheatchheang/Desktop/WithinGame/src/grass.png"),startX,startY,xDimension,yDimension,this);
                }
                else if (gameMap[i][j] == 2) {
                    Graphics2D g2 = (Graphics2D)g;
                    g2.drawImage(Toolkit.getDefaultToolkit().getImage("/Users/chansocheatchheang/Desktop/WithinGame/src/path.png"),startX,startY,xDimension,yDimension,this);
                }
                else if (gameMap[i][j] == 3) {
                    Graphics2D g2 = (Graphics2D)g;
                    g2.drawImage(Toolkit.getDefaultToolkit().getImage("/Users/chansocheatchheang/Desktop/WithinGame/src/water.png"),startX,startY,xDimension,yDimension,this);
                }
                startX += xDimension;
            }
            startY += yDimension;
        }

        // draw player on map

        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(img,playerX,playerY,xDimension,yDimension,this);
        this.addKeyListener(this);
        graphics = g;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        delay += 100;
        playerY += 50;
        Graphics2D g2 = (Graphics2D)graphics;
        img = Toolkit.getDefaultToolkit().getImage("/Users/chansocheatchheang/Desktop/WithinGame/src/walkDown.png");
        if (delay == 200) {
            img = Toolkit.getDefaultToolkit().getImage("/Users/chansocheatchheang/Desktop/WithinGame/src/down.png");
            timer.stop();
            delay = 0;
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        timer.start();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
