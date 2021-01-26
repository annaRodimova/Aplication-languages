package Graphics_new;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Frame_Random {
    public void random_frame() throws SQLException, ClassNotFoundException {
        JFrame learn_home = new JFrame("Start");
        learn_home.setSize(770, 1200);
        learn_home.getContentPane().setBackground(new Color(0x3A3B3B));
        learn_home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        learn_home.setLayout(null);
        learn_home.setVisible(true);
        Components_Random buttons_random = new Components_Random();

        for (int i = 0; i< buttons_random.return_array_buttons_random().size(); i ++) {
            learn_home.add(buttons_random.return_array_buttons_random().get(i));
        }
    }
}
