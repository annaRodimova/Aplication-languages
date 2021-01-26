package Graphics_new;

import Databases.DataBases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_learn {
    private ArrayList<Component> all_buttons_learn = new ArrayList<>();
    public Components_learn() {
        JButton learn_button =  new JButton("<- Back");
        learn_button.setBackground(new Color(0xA6B8B8));
        learn_button.setBounds(10, 700, 150, 50);
        JButton start_button = new JButton("Go");
        start_button.setBackground(new Color(0x5DBFBF));
        start_button.setBounds(266, 700, 150, 50);
        JButton addWord_button = new JButton("Forward ->");
        addWord_button.setBackground(new Color(0xA6B8B8));
        addWord_button.setBounds(532, 700, 150, 50);

        all_buttons_learn.add(learn_button);
        all_buttons_learn.add(start_button);
        all_buttons_learn.add(addWord_button);

        JTextField text_name = new JTextField("Learning");
        text_name.setBackground(new Color(0x5DBFBF));
        text_name.setBounds(250, 0, 200, 50);
        JTextField text_word = new JTextField("WORD");
        text_word.setBackground(new Color(0xF8FAFA));
        text_word.setBounds(10, 150, 300, 200);
        JTextField text_translation = new JTextField("Translation");
        text_translation.setBackground(new Color(0x969999));
        text_translation.setBounds(395, 400, 300, 200);

        all_buttons_learn.add(text_name);
        all_buttons_learn.add(text_word);
        all_buttons_learn.add(text_translation);

        start_button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String translation_Word = new DataBases().search(text_word.getText());
                    text_translation.setText(translation_Word);
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
    }
    public ArrayList<Component> return_array_buttons_learn() {

        return all_buttons_learn;
    }
}
