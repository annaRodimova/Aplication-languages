package Graphics_new;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Frame_addWord {
    public void add_frame() throws SQLException, ClassNotFoundException {
        JFrame learn_home = new JFrame("Start");
        learn_home.setSize(770, 1200);
        learn_home.getContentPane().setBackground(new Color(0x3A3B3B));
        learn_home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        learn_home.setLayout(null);
        learn_home.setVisible(true);
        Components_addWord buttons_add = new Components_addWord();

        for (int i = 0; i< buttons_add.return_array_buttons_add().size(); i ++) {
            learn_home.add(buttons_add.return_array_buttons_add().get(i));
        }
    }
}
