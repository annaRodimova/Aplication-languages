package Graphics_new;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_Home {
    private ArrayList <Component> all_buttons_home = new ArrayList<>();
    public Components_Home () {
        JButton learn_button =  new JButton("Learning");
        learn_button.setBackground(new Color(0xA6B8B8));
        learn_button.setBounds(250, 50, 300, 200);
        JButton random_button = new JButton("Random");
        random_button.setBackground(new Color(0x80B8B8));
        random_button.setBounds(250, 270, 300, 200);
        JButton addWord_button = new JButton("Add word");
        addWord_button.setBackground(new Color(0x5DBFBF));
        addWord_button.setBounds(250, 500, 300, 200);

        all_buttons_home.add(learn_button);
        all_buttons_home.add(random_button);
        all_buttons_home.add(addWord_button);

        learn_button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Frame_Learn().learn_frame();
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
                try {
                    new Frame_Random().random_frame();
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
                try {
                    new Frame_addWord().add_frame();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
    }
    public ArrayList<Component> return_array_buttons_home() {

        return all_buttons_home;
    }
}
