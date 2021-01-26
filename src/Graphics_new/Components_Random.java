package Graphics_new;

import Databases.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_Random {
    public boolean result = false;
    private ArrayList<Component> all_buttons_random = new ArrayList<>();
    public Components_Random() {
        JButton learn_button =  new JButton("<- Back");
        learn_button.setBackground(new Color(0xA6B8B8));
        learn_button.setBounds(10, 700, 150, 50);
        JButton random_button = new JButton("Check");
        random_button.setBackground(new Color(0x5DBFBF));
        random_button.setBounds(266, 700, 150, 50);
        JButton addWord_button = new JButton("Forward ->");
        addWord_button.setBackground(new Color(0xA6B8B8));
        addWord_button.setBounds(532, 700, 150, 50);

        all_buttons_random.add(learn_button);
        all_buttons_random.add(random_button);
        all_buttons_random.add(addWord_button);

        JTextField text_name = new JTextField("Random");
        text_name.setBackground(new Color(0x5DBFBF));
        text_name.setBounds(250, 0, 200, 50);
        JTextField text_word = new JTextField("WORD");
        text_word.setBackground(new Color(0xF8FAFA));
        text_word.setBounds(10, 150, 300, 200);
        JTextField text_result = new JTextField("RESULT");
        text_result.setBackground(new Color(0xE5E57D));
        text_result.setBounds(200, 620, 300, 50);
        JTextField text_translation = new JTextField("Translation");
        text_translation.setBackground(new Color(0x969999));
        text_translation.setBounds(395, 400, 300, 200);

        all_buttons_random.add(text_name);
        all_buttons_random.add(text_word);
        all_buttons_random.add(text_result);
        all_buttons_random.add(text_translation);

        addWord_button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String random_learn = new learning().random_russian_word();
                    text_word.setText(random_learn);
                    while (true) {
                        if(text_translation.getText().equals("null") && text_translation.getText().equals("Translation")) {
                            continue;
                        }
                        else
                            break;
                    }
                    result = new learning().check_learning_word(text_word.getText(), text_translation.getText());

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }

            }
        });
        random_button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (result == false) {
                    text_result.setText("You are wrong try again");
                }
                else {
                    text_result.setText("All right, good job");
                }
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
    public ArrayList<Component> return_array_buttons_random() {

        return all_buttons_random;
    }
}
