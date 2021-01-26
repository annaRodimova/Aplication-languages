package Graphics_new;

import Databases.Methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_addWord implements Methods {
    private ArrayList<Component> all_buttons_add = new ArrayList<>();
    public Components_addWord () {
        JButton learn_button =  new JButton("<- Back");
        learn_button.setBackground(new Color(0xA6B8B8));
        learn_button.setBounds(10, 700, 150, 50);
        JButton random_button = new JButton("Save");
        random_button.setBackground(new Color(0x5DBFBF));
        random_button.setBounds(266, 700, 150, 50);
        JButton addWord_button = new JButton("Forward ->");
        addWord_button.setBackground(new Color(0xA6B8B8));
        addWord_button.setBounds(532, 700, 150, 50);

        all_buttons_add.add(learn_button);
        all_buttons_add.add(random_button);
        all_buttons_add.add(addWord_button);

        JTextField text_name = new JTextField("Add Words");
        text_name.setBackground(new Color(0x5DBFBF));
        text_name.setBounds(250, 0, 200, 50);
        JTextField text_word = new JTextField("WORD (english)");
        text_word.setBackground(new Color(0xF8FAFA));
        text_word.setBounds(10, 150, 300, 200);
        JTextField text_translation = new JTextField("Translation (russian)");
        text_translation.setBackground(new Color(0x969999));
        text_translation.setBounds(395, 400, 300, 200);

        all_buttons_add.add(text_name);
        all_buttons_add.add(text_word);
        all_buttons_add.add(text_translation);

        random_button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    add_new_word(text_word.getText(), text_translation.getText(), "dict");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
        learn_button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Frame_Home().home_frame();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
        addWord_button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_word.setText(null);
                text_translation.setText(null);
            }
        });

    }
    public ArrayList<Component> return_array_buttons_add() {

        return all_buttons_add;
    }
}
