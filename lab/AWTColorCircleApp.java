package edu.neu.mgen.lab;

import java.awt.*;
import java.awt.event.*;

public class AWTColorCircleApp {
    
    public static void main(String[] args) {
        // Create and show the application GUI
        new ColorCircleWindow();
    }
}

class ColorCircleWindow extends Frame {

    // Declare AWT components
    private Choice colorChoice;
    private TextField colorNameField;
    private CirclePanel circlePanel;

    public ColorCircleWindow() {
        // Frame setup
        super("AWT Color Circle App");
        setLayout(new BorderLayout());

        // Create the circle panel
        circlePanel = new CirclePanel();
        add(circlePanel, BorderLayout.CENTER);

        // Create a Choice (Dropdown) for color selection
        colorChoice = new Choice();
        colorChoice.add("Red");
        colorChoice.add("Blue");
        colorChoice.add("Green");
        colorChoice.add("Yellow");
        colorChoice.add("Black");

        // Create a TextField to display the selected color's name
        colorNameField = new TextField(15);
        colorNameField.setEditable(false);  // Make it non-editable

        // Add components to the bottom panel
        Panel bottomPanel = new Panel();
        bottomPanel.add(colorChoice);
        bottomPanel.add(colorNameField);
        add(bottomPanel, BorderLayout.SOUTH);

        // Add an event listener to the Choice (Dropdown)
        colorChoice.addItemListener(new ColorSelectionListener());

        // Setup Frame properties
        setSize(400, 400);
        setVisible(true);
        
        // Close the application when the window is closed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Custom Panel to draw a circle
    class CirclePanel extends Panel {
        private Color circleColor = Color.WHITE; // Default color is white

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(circleColor);
            g.fillOval(100, 50, 200, 200);  // Draw circle in the center of the panel
        }

        public void setCircleColor(Color color) {
            this.circleColor = color;
            repaint();  // Repaint the panel to reflect the color change
        }
    }

    // Event Listener to handle color selection from the dropdown
    class ColorSelectionListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            String selectedColor = colorChoice.getSelectedItem();
            Color color = Color.WHITE;  // Default color

            // Set color based on selection
            switch (selectedColor) {
                case "Red":
                    color = Color.RED;
                    break;
                case "Blue":
                    color = Color.BLUE;
                    break;
                case "Green":
                    color = Color.GREEN;
                    break;
                case "Yellow":
                    color = Color.YELLOW;
                    break;
                case "Black":
                    color = Color.BLACK;
                    break;
            }

            // Set the circle's color and update the text field
            circlePanel.setCircleColor(color);
            colorNameField.setText(selectedColor);
        }
    }
}

