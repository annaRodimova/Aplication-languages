/*package Graphics;

import Databases.DataBases;
import Databases.Methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Add_word implements Methods {
    private ArrayList<Component> add_bubttons = new ArrayList<>();
    public void add_words() {
        JButton button_Save = new JButton("Save");
        JTextField add_word_textField = new JTextField("add word");
        JTextField add_tranlation_textField = new JTextField("add tranlation");
        JButton button_back = new JButton("<- Back");

        add_bubttons.add(button_Save);
        add_bubttons.add(add_word_textField);
        add_bubttons.add(add_tranlation_textField);
        add_bubttons.add(button_back);

        add_word_textField.setBounds(150, 200, 200, 100);
        add_word_textField.setBackground(new Color(0xEF9FF5));
        add_tranlation_textField.setBounds(650, 200, 200, 100);
        add_tranlation_textField.setBackground(new Color(0xEF9FF5));
        button_Save.setBounds(400, 400, 200, 100);
        button_Save.setBackground(new Color(0x740572));
        button_back.setBounds(100, 700, 100, 50);
        button_back.setBackground(new Color(0x685754));




        button_Save.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DataBases dataBases = new DataBases();
                String word = add_word_textField.getText();
                String translation = add_tranlation_textField.getText();
                try {
                    add_new_word(word, translation, "dict");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
        }});



        button_back.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Start_learning().create_frame();
            }
        });

    }
    public ArrayList<Component> return_word() {

        return add_bubttons;
    }
}

 */
