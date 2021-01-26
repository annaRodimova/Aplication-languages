package Graphics;

import Databases.DataBases;
import Databases.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

/* public class Random_word  {
    public void rand_word () throws SQLException, ClassNotFoundException {
        JFrame frame_home = new JFrame("Start");
        frame_home.setSize(1000, 1000);
        frame_home.getContentPane().setBackground(new Color(0xFDE335));

        frame_home.add(button_GO);
        frame_home.add(button_start);
        button_GO.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String rand_word = new learning().random_russian_word();
                    word_textField.setText(rand_word);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });


        frame_home.setJMenuBar(menuBar);


        frame_home.add(word_textField);
        frame_home.add(tranlation_textField);


        frame_home.add(button_back);

        frame_home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_home.setLayout(null);
        frame_home.setVisible(true);

    }
}


 */