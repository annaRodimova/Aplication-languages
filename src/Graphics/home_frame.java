/* package Graphics;

import Databases.DataBases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class home_frame {
    public home_frame() throws SQLException, ClassNotFoundException {
        JFrame frame_home = new JFrame("Start");
        frame_home.setSize(1574, 770);
        frame_home.getContentPane().setBackground(new Color(0x777979));
        frame_home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_home.setLayout(null);
        frame_home.setVisible(true);
        Buttons buttons = new Buttons();

        for (int i = 0; i< buttons.return_array().size(); i ++) {
            frame_home.add(buttons.return_array().get(i));
        }
    }

}

 */
