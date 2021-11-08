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
    private JButton button_play = new JButton(">");
    private JButton button_stop = new JButton("||");
    private JButton button_next = new JButton(">>");
    private JButton button_previous = new JButton("<<");
    private JButton button_queue = new JButton("Queue");
    private JButton button_delete = new JButton("Delete");
    private JLabel crnt_Song = new JLabel("ITEMS HERE");
    private JCheckBox show_Alben = new JCheckBox("Alben anzeigen");
    private JList list_view ;
    private JList list_Alben;
    private JList list_playlist;
    private Musikverwaltungsprogramm player = new Musikverwaltungsprogramm();
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

        String[] list_viewItems = {"ITEMS HERE"};
        String[] list_AlbenItems = {"ITEM HERE", "ITEM HERE", "ITEM HERE"};
        String[] list_playlistItems = {"ITEMS HERE"};

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
        crnt_Song.setText("ITEMS HERE");
        cp.add(crnt_Song);
        show_Alben.setBounds (370, 0, 125, 25);
        show_Alben.setToolTipText ("Hier klicken, um die Auswahl der Alben anstatt den einzelnen Liedern anzuzeigen");        
        show_Alben.setOpaque(false);
        cp.add(show_Alben);
        list_view = new JList (list_viewItems);
        list_view.setBounds (5, 5, 360, 565);
        cp.add(list_view);
        list_Alben = new JList (list_AlbenItems);
        list_Alben.setBounds (370, 25, 210, 450);
        cp.add(list_Alben);
        list_playlist = new JList (list_playlistItems);
        list_playlist.setBounds (585, 5, 355, 535);
        cp.add(list_playlist);
        // Ende Komponenten

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
        player.queue();
    } // end of button_queue_ActionPerformed

    public void button_delete_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        player.delete();
    } // end of button_delete_ActionPerformed

    // Ende Methoden
} // end of class GUI