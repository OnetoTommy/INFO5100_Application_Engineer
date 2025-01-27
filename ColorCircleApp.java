package edu.neu.mgen;

// The GUI (Graphical User Interface) to your Java program consists of a circle, one text entry field (dropdown choices) and a text output field.
// Initially the circle is clear (no color inside)
// The dropdown entry box contains a selection of different colors loke “Red, Blue, Green”.
// You choose a color in the text entry dropdown box.
// In response to the selection, the circle is filled with the appropriate color and the text output field shows the name of this color.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorCircleApp {

    public static void main(String[] args) {
        // Run the program in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new ColorCircleWindow());
    }
}

class ColorCircleWindow {
    private JFrame frame;
    private CirclePanel circlePanel;
    private JComboBox<String> colorComboBox;
    private JTextField colorTextField;

    public ColorCircleWindow() {
        frame = new JFrame("Color Circle Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Initialize circle panel to draw the circle
        circlePanel = new CirclePanel();
        frame.add(circlePanel, BorderLayout.CENTER);

        // Create the color selection dropdown (JComboBox)
        String[] colors = {"Red", "Blue", "Green"};
        colorComboBox = new JComboBox<>(colors);
        colorComboBox.addActionListener(new ColorSelectionListener());

        // Create the text field to show selected color
        colorTextField = new JTextField(10);
        colorTextField.setEditable(false);

        // Panel to hold the combo box and text field
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(colorComboBox);
        bottomPanel.add(colorTextField);

        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Custom panel to draw the circle
    class CirclePanel extends JPanel {
        private Color circleColor = Color.WHITE;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set the color and draw the circle
            g.setColor(circleColor);
            g.fillOval(100, 50, 200, 200); // x, y, width, height
        }

        public void setCircleColor(Color color) {
            this.circleColor = color;
            repaint(); // Repaint the panel to update the circle color
        }
    }

    // Listener to handle color selection from the JComboBox
    class ColorSelectionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedColor = (String) colorComboBox.getSelectedItem();
            Color color = Color.WHITE;

            // Update the circle color and text field based on the selection
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
            }

            circlePanel.setCircleColor(color); // Update the circle color
            colorTextField.setText(selectedColor); // Display the color name in the text field
        }
    }
}
