package sample;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    //create all buttons (Load, Reset, Exit)
    //de facut
    public ControlPanel(MainFrame frame) {
        this.frame = frame; init();
    }
    private void init() {
        setLayout(new GridLayout(1, 4));
        //add all buttons . de facut
        //configure listeners for all buttons
        saveBtn.addActionListener(this::save);
        // de facut
    }
    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "JPG", new File("/img/image.jpg"));
        } catch (IOException ex) { System.err.println(ex); }
    }
//de facut
}

