import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.text.*;
public class GUI extends JPanel {
    private JList list_view;
    private JCheckBox show_Alben;
    private JLabel crnt_Song;
    private JButton button_queue;
    private JButton button_delete;
    private JButton button_play;
    private JButton button_next;
    private JButton button_previous;
    private JList list_Alben;
    private JList list_playlist;

    public GUI() {
        //construct preComponents
        String[] list_viewItems = {"ITEMS HERE"};
        String[] list_AlbenItems = {"Item 1", "Item 2", "Item 3"};
        String[] list_playlistItems = {"ITEMS HERE"};

        //construct components
        list_view = new JList (list_viewItems);
        show_Alben = new JCheckBox ("Alben anzeigen");
        crnt_Song = new JLabel ("ITEMS HERE");
        button_play = new JButton (">");
        button_next = new JButton (">>");
        button_previous = new JButton ("<<");
        button_queue = new JButton("Queue");
        button_delete = new JButton("Delete");
        list_Alben = new JList (list_AlbenItems);
        list_playlist = new JList (list_playlistItems);

        //set components properties
        show_Alben.setToolTipText ("Hier klicken, um die Auswahl der Alben anstatt den einzelnen Liedern anzuzeigen");

        //adjust size and set layout
        setPreferredSize (new Dimension (950, 575));
        setLayout (null);

        //add components
        add (list_view);
        add (show_Alben);
        add (crnt_Song);
        add (button_play);
        add (button_next);
        add (button_previous);
        add (button_queue); 
        add (button_delete);
        add (list_Alben);
        add (list_playlist);
   /* button_delete.setMargin(new Insets(2, 2, 2, 2));
        button_delete.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button_delete_ActionPerformed(evt);
      }
    });**/
        //set component bounds (only needed by Absolute Positioning)
        list_view.setBounds (5, 5, 360, 565);
        show_Alben.setBounds (370, 0, 125, 25);
        crnt_Song.setBounds (370, 545, 570, 25);
        button_play.setBounds (445, 480, 60, 20);
        button_next.setBounds (520, 480, 60, 20);
        button_previous.setBounds (370, 480, 60, 20);
        button_queue.setBounds(482, 510, 80, 20);
        button_delete.setBounds(388, 510, 80, 20);
        list_Alben.setBounds (370, 25, 210, 450);
        list_playlist.setBounds (585, 5, 355, 535);
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("GUI");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GUI());
        frame.pack();
        frame.setVisible (true);
    }
    public void addActionListener(ActionListener l){
        
    }
}

