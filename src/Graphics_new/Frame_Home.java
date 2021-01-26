package Graphics_new;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Frame_Home {
    public void home_frame() throws SQLException, ClassNotFoundException {
        JFrame frame_home = new JFrame("Start");
        frame_home.setSize(770, 1200);
        frame_home.getContentPane().setBackground(new Color(0x3A3B3B));
        frame_home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_home.setLayout(null);
        frame_home.setVisible(true);
        Components_Home buttons_home = new Components_Home();

        for (int i = 0; i< buttons_home.return_array_buttons_home().size(); i ++) {
            frame_home.add(buttons_home.return_array_buttons_home().get(i));
        }
    }
}
