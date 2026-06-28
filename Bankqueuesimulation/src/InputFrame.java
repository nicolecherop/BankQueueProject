import javax.swing.*;
import java.awt.*;

public class InputFrame extends JFrame {

    private JTextField txtCustomers;
    private JButton btnRun;
    private JButton btnExit;

    public InputFrame() {

        setTitle("Bank Queue Simulation");
        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Title 
        JLabel lblTitle = new JLabel("BANK QUEUE SIMULATION", SwingConstants.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblTitle, BorderLayout.NORTH);

        // Center Panel 
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 10, 10));

        JLabel lblCustomers = new JLabel("Number of Customers:");

        txtCustomers = new JTextField("100");

        centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        centerPanel.add(lblCustomers);
        centerPanel.add(txtCustomers);

        add(centerPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel();

        btnRun = new JButton("Run Simulation");
        btnExit = new JButton("Exit");

        buttonPanel.add(btnRun);
        buttonPanel.add(btnExit);

        add(buttonPanel, BorderLayout.SOUTH);

        // Run Button
        btnRun.addActionListener(e -> runSimulation());

        // Exit Button
        btnExit.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private void runSimulation() {

        try {

            int customers = Integer.parseInt(txtCustomers.getText());

            if (customers <= 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter a positive number of customers.",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);

                return;
            }

            Simulation simulation = new Simulation();

            simulation.runSimulation(customers);

            new OutputFrame(simulation);

        }

        catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter a valid whole number.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}