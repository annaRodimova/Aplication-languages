package Graphics;

import Databases.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

/*public class Random_buttons {
    public void random_word() {
        Menu menu = new JMenu("Menu");
        JMenuBar menuBar = new JMenuBar();
        JMenuItem item = new JMenuItem("random word");
        menu.add(item);
        menuBar.add(menu);
        JTextField word_textField = new JTextField("random word");
        JTextField tranlation_textField = new JTextField("translation");
        JButton button_GO = new JButton("GO");
        JButton button_start = new JButton("check");
        JButton button_back = new JButton("<- Back");

        button_start.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new learning().check(word_textField.getText(), tranlation_textField.getText());
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });

        word_textField.setBounds(150, 200, 200, 100);
        word_textField.setBackground(new Color(0xEF9FF5));
        tranlation_textField.setBounds(650, 200, 200, 100);
        tranlation_textField.setBackground(new Color(0xEF9FF5));
        button_GO.setBounds(100, 400, 200, 100);
        button_GO.setBackground(new Color(0x740572));
        button_start.setBounds(500, 400, 200, 100);
        button_start.setBackground(new Color(0x740572));
        button_back.setBounds(100, 700, 100, 50);
        button_back.setBackground(new Color(0x685754));


        button_back.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Start_learning().create_frame();
            }
        });
    }
}

 */
