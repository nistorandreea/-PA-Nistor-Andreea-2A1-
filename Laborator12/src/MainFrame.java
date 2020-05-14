import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MainFrame extends JFrame {
    DesignPanel designPanel;
    ControlPanel controlPanel;

    public MainFrame() {
        super("Add component");
        this.setLayout(new BorderLayout());
        rootPane.setPreferredSize(new Dimension(800, 600));
        init();
        addComponents();
        this.setVisible(true);
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.designPanel = new DesignPanel(this);
        this.controlPanel = new ControlPanel(this);
        pack();
    }

    private void addComponents(){
        this.add(designPanel, BorderLayout.CENTER);
        this.add(controlPanel, BorderLayout.NORTH);
    }
}
