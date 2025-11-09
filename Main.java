import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// going to over comment everything initially, just because i want to understand what is going on
public class Main 
{
    public static void main(String [] args)
    {
        // creates the actual window, and also sets the title of the application to test
        JFrame window = new JFrame("Midnight - Text Editor");
        // sets the window size
        window.setSize(800, 600);

        // This is used to put some uneditable text inside the window
        JLabel label = new JLabel("also some test text");
        // adds the label
        window.add(label);

        // for getting file paths, remember to use double quotes
        ImageIcon icon = new ImageIcon("media/test.png");
        window.setIconImage(icon.getImage());

        // setHorizontalAlignment basically acts as justifyContent for whatever direction i need. hopefully nicer than css
        label.setHorizontalAlignment(window.WIDTH / 2);

        // creating a menu bar
        JMenuBar menuBar = new JMenuBar();
        // creating a file menu
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // creating options for a file menu || i can use this for later when actually creating a file system
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        // using the panel to add the button
        JPanel panel = new JPanel();
        JButton button = new JButton("click me please senpai uwu :3");
        panel.add(button);

        // event handler for the ts button vro, ts is so much more difficult than js </3
        button.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(window, "twin i just came xd");
            }    
        });

        // adding all the ts to the window
        window.setLayout(new BorderLayout());
        window.setJMenuBar(menuBar);
        window.add(panel);

        // sets the default close operation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE /* which in this case is just closing */);

        // makes the window visible
        window.setVisible(true);
    }
}
