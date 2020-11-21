package ui.tabs;

import ui.OCafe;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Tab extends JPanel {
    protected static final String PLACE_ORDER_COMMAND = "Place Order";
    protected static final String SIGN_IN_COMMAND = "Sign In";
    protected static final String CREATE_ACCOUNT_COMMAND = "Create Account";

    protected OCafe controller;
    protected static final int INSET = 50;

    //REQUIRES: SmartHomeUI controller that holds this tab
    public Tab(OCafe controller) {
        this.controller = controller;
    }

    // creates a panel with a title
    public JPanel initializePane(String title) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel(title);
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(label);

        return panel;
    }


    //EFFECTS: creates Place Order button that switches to the menu tab on the console
    public void placeOrderButton(JPanel panel) {
        JButton placeOrderButton = new JButton(PLACE_ORDER_COMMAND);

        placeOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonPressed = e.getActionCommand();
                if (buttonPressed.equals(PLACE_ORDER_COMMAND)) {
                    controller.refreshTab(OCafe.ORDER_TAB_INDEX);
                    controller.getTabbedPane().setSelectedIndex(OCafe.MENU_TAB_INDEX);
                }
            }
        });

        placeOrderButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(placeOrderButton);
    }

    // creates rigid area
    public Component createRigidArea() {
        return Box.createRigidArea(new Dimension(50, 20));
    }

    //EFFECTS: returns the SmartHomeUI controller for this tab
    public OCafe getController() {
        return controller;
    }

}
