package sample;

import javax.swing.*;

import static javax.swing.SwingConstants.CENTER;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //create the components
        canvas = new DrawingPanel(this);
         //de facut

        //arrange the components in the container (frame)
        add(canvas, CENTER); //this is BorderLayout.CENTER
        //de facut
        //invoke the layout manager
        pack();
    }
}

