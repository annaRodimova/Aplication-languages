/*package Graphics;

import Databases.DataBases;
import Databases.Methods;
import Databases.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;

public class Buttons implements Methods {
    private ArrayList<Component> objects_buttons = new ArrayList<>();
    public void buttons_add() throws SQLException, ClassNotFoundException {

        JMenu menu = new JMenu("Menu");
        JMenuBar menuBar = new JMenuBar();
        JMenuItem item = new JMenuItem("Add word");
        JMenuItem item1 = new JMenuItem("Random");
        menu.add(item);
        menu.add(item1);
        menuBar.add(menu);
        JButton button_GO = new JButton("GO");
        JTextField word_textField = new JTextField("word");
        JTextField tranlation_textField = new JTextField("tranlation");
        JButton button_back = new JButton("<- Back");

        objects_buttons.add(menu);
        objects_buttons.add(menuBar);
        objects_buttons.add(button_GO);
        objects_buttons.add(word_textField);
        objects_buttons.add(tranlation_textField);
        objects_buttons.add(button_back);

        word_textField.setBounds(150, 200, 200, 100);
        word_textField.setBackground(new Color(0xEF9FF5));
        tranlation_textField.setBounds(650, 200, 200, 100);
        tranlation_textField.setBackground(new Color(0xEF9FF5));
        button_GO.setBounds(400, 400, 200, 100);
        button_GO.setBackground(new Color(0x740572));
        button_back.setBounds(100, 700, 100, 50);
        button_back.setBackground(new Color(0x685754));

        item.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { // переделай
                String word = "";
                try {
                    add_new_word(word_textField.getText(), word, "dict");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
        item1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button_GO.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataBases dataBases = new DataBases();
                String word = null;
                try {
                    word = dataBases.search(word);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
                tranlation_textField.setText(word);
            }
        });



        button_back.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Start_learning().create_frame();
            }
        });
    }

    public ArrayList<Component> return_array() {

        return objects_buttons;
    }

}

 */
