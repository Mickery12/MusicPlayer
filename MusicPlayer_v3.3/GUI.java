import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 27.10.2021
 * @author 
 */

public class GUI extends JFrame {
    // Anfang Attribute
    private MVP player = new MVP();
    private JButton button_play = new JButton(">");
    private JButton button_stop = new JButton("||");
    private JButton button_next = new JButton(">>");
    private JButton button_previous = new JButton("<<");
    private JButton button_queue = new JButton("Queue");
    private JButton button_delete = new JButton("Delete");
    private JLabel crnt_Song = new JLabel("ITEMS HERE");
    private JList list_AllSongs;
    private JList list_Alben;
    private JList list_queue;

    // Ende Attribute

    public GUI() {
        
        // Frame-Initialisierung
        super();
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 950; 
        int frameHeight = 575;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("GUI");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        // Anfang Komponenten

        String[] list_AllSongsItems = {"AllSongsItems", "und hier"};
        String[] list_queueItems = {"queueItems"};
        String[] list_AlbenItems = {"AlbenItems"};

        player.addFirst10ToQueue();
        
        button_play.setBounds(445, 480, 60, 20);
        button_play.setMargin(new Insets(2, 2, 2, 2));
        button_play.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button_play_ActionPerformed(evt);
                }
            });
        cp.add(button_play);
        button_stop.setBounds(445, 480, 60, 20);
        button_stop.setMargin(new Insets(2, 2, 2, 2));
        button_stop.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button_stop_ActionPerformed(evt);
                }
            });
        button_stop.setVisible(false);
        cp.add(button_stop);
        button_next.setBounds(520, 480, 60, 20);
        button_next.setMargin(new Insets(2, 2, 2, 2));
        button_next.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button_next_ActionPerformed(evt);
                }
            });
        cp.add(button_next);
        button_previous.setBounds (370, 480, 60, 20);
        button_previous.setMargin(new Insets(2, 2, 2, 2));
        button_previous.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button_previous_ActionPerformed(evt);
                }
            });
        cp.add(button_previous);
        button_queue.setBounds(482, 510, 80, 20);
        button_queue.setMargin(new Insets(2, 2, 2, 2));
        button_queue.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button_queue_ActionPerformed(evt);
                }
            });
        cp.add(button_queue);
        button_delete.setBounds(388, 510, 80, 20);
        button_delete.setMargin(new Insets(2, 2, 2, 2));
        button_delete.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button_delete_ActionPerformed(evt);
                }
            });
        cp.add(button_delete);
        crnt_Song.setBounds (370, 545, 570, 25);
        crnt_Song.setText("CRNT SONG");
        cp.add(crnt_Song);
        list_AllSongs = new JList (player.getAllSongs());
        list_AllSongs.setBounds (5, 5, 360, 535);
        cp.add(list_AllSongs);
        list_Alben = new JList (player.getAlben());
        list_Alben.setBounds (370, 5, 210, 535);
        cp.add(list_Alben);
        list_queue = new JList (player.getQueue());
        list_queue.setBounds (585, 5, 355, 535);
        cp.add(list_queue);
        // Ende Komponenten

        hideAllButtons();
        setVisible(true);
    } // end of public GUI

    // Anfang Methoden

    public static void main(String[] args) {
        new GUI();
    } // end of main

    public void button_play_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        player.play();
        button_play.setVisible(false);
        button_stop.setVisible(true);
    } // end of button_play_ActionPerformed

    public void button_stop_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        player.stop();
        button_play.setVisible(true);
        button_stop.setVisible(false);
    } // end of button_stop_ActionPerformed

    public void button_next_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        player.next();
    } // end of button_next_ActionPerformed

    public void button_previous_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        player.previous();
    } // end of button_previous_ActionPerformed

    public void button_queue_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        player.getQueue();
    } // end of button_queue_ActionPerformed

    public void button_delete_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        player.delete();
    } // end of button_delete_ActionPerformed

    public void debug() {
        player.debug();
    }

    public void update() {
        list_AllSongs = new JList (player.getAllSongs());
        list_queue = new JList (player.getQueue());
        list_Alben = new JList (player.getAlben());
    }

    public void hideAllButtons() {
        button_play.setVisible(false);
        button_stop.setVisible(false);
        button_next.setVisible(false);
        button_previous.setVisible(false);
        button_queue.setVisible(false);
        button_delete.setVisible(false);
    }

    public void addFirst10ToQueue() {
        player.addFirst10ToQueue();
        update();
    }

    // Ende Methoden
} // end of class GUI