import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ControlPanel extends JPanel {
    private final MainFrame frame;
    private final JLabel classNameLabel = new JLabel("Swing component");
    private final JTextField classNameField = new JTextField(20);
    private final JLabel textLabel = new JLabel("Default text");
    private final JTextField textField = new JTextField(10);
    private final JButton createButton = new JButton("Add component");
    private final JButton saveButton = new JButton("Save");
    private final JButton loadButton = new JButton("Load");


    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        add(classNameLabel);
        add(classNameField);
        add(textLabel);
        add(textField);
        add(createButton);
        add(saveButton);
        add(loadButton);

        createButton.addActionListener(e -> {
            JComponent component = createDynamicComponent(classNameField.getText());
            setComponentText(component, textField.getText());
            frame.designPanel.randomLocation(component);
        });
    }

    private void setComponentText(JComponent component, String txt) {

        Class clazz = component.getClass();
        Method m = null;
        try {
            m = clazz.getMethod("setText", String.class);
            m.invoke(component, txt);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private JComponent createDynamicComponent(String className) {
        try {
            Class clazz = Class.forName(className);
            return (JComponent) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}