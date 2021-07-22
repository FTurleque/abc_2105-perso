package interfaceGraphic;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Ma super APP");
        frame.setSize(600, 480);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        JButton button = new JButton("Mon Bouton");
        panel.add(button);
    }
    
}
