package Graphics_new;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Frame_Learn {
    public void learn_frame() throws SQLException, ClassNotFoundException {
        JFrame learn_home = new JFrame("Start");
        learn_home.setSize(770, 1200);
        learn_home.getContentPane().setBackground(new Color(0x3A3B3B));
        learn_home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        learn_home.setLayout(null);
        learn_home.setVisible(true);
        Components_learn buttons_learn = new Components_learn();

        for (int i = 0; i< buttons_learn.return_array_buttons_learn().size(); i ++) {
            learn_home.add(buttons_learn.return_array_buttons_learn().get(i));
        }
    }
}
