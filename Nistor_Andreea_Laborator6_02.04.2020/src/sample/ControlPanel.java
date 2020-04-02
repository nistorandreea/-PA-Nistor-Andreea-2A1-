package sample;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {
    //create all buttons (Load, Reset, Exit)

    final MainFrame frame;
    Frame MainFrame=new Frame("New window");
    JButton saveButton = new JButton("Save");
    JButton loadButton = new JButton("Load");
    JButton resetButton = new JButton("Reset");
    JButton exitButton = new JButton("Exit");

    public ControlPanel(MainFrame frame) {
        this.frame = frame; init();
    }
    private void init() {
        //add all buttons
        setLayout(new GridLayout(1, 4));
        MainFrame.setLayout(new GridLayout(1, 4));
        frame.add(saveButton);
        frame.add(loadButton);
        frame.add(resetButton);
        frame.add(exitButton);

        //configure listeners for all buttons
        saveButton.addActionListener(this::save);
        loadButton.addActionListener(this::load);
        resetButton.addActionListener(this::reset);
        exitButton.addActionListener(this::exit);

    }
    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "JPG", new File("/img/image.jpg"));
        } catch (IOException ex) { System.err.println(ex); }
    }
//de facut
}

