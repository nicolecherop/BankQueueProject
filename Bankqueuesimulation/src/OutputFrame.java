import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class OutputFrame extends JFrame {

    public OutputFrame(Simulation simulation) {

        setTitle("Simulation Results");
        setSize(1000, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());

            
        // Title
            

        JLabel title = new JLabel("BANK QUEUE SIMULATION RESULTS", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title, BorderLayout.NORTH);

            
        // Customer Table
            

        String[] columns = {
                "Customer",
                "Inter-Arrival",
                "Arrival",
                "Service",
                "Start",
                "Finish",
                "Waiting",
                "System",
                "Idle"
        };

        DefaultTableModel model = new DefaultTableModel(columns, 0);

        ArrayList<Customer> customers = simulation.getCustomers();

        for (Customer c : customers) {

            model.addRow(new Object[]{
                    c.getCustomerNumber(),
                    String.format("%.2f", c.getInterArrivalTime()),
                    String.format("%.2f", c.getArrivalTime()),
                    String.format("%.2f", c.getServiceTime()),
                    String.format("%.2f", c.getServiceStartTime()),
                    String.format("%.2f", c.getServiceEndTime()),
                    String.format("%.2f", c.getWaitingTime()),
                    String.format("%.2f", c.getTimeInSystem()),
                    String.format("%.2f", c.getIdleTime())
            });

        }

        JTable table = new JTable(model);

        table.setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);

            
        // Statistics Panel
            

        Statistics s = simulation.getStatistics();

        JPanel statsPanel = new JPanel(new GridLayout(4, 2, 10, 5));

        statsPanel.setBorder(BorderFactory.createTitledBorder("Queue Statistics"));

        statsPanel.add(new JLabel("Average Waiting Time: "
                + String.format("%.2f", s.getAverageWaitingTime())));

        statsPanel.add(new JLabel("Probability Customer Waits: "
                + String.format("%.2f", s.getProbabilityCustomerWaits())));

        statsPanel.add(new JLabel("Server Idle Proportion: "
                + String.format("%.2f", s.getServerIdleProportion())));

        statsPanel.add(new JLabel("Server Busy Probability: "
                + String.format("%.2f", s.getServerBusyProbability())));

        statsPanel.add(new JLabel("Average Service Time: "
                + String.format("%.2f", s.getAverageServiceTime())));

        statsPanel.add(new JLabel("Average Waiting Time (Waiters): "
                + String.format("%.2f", s.getAverageWaitingTimeWaiters())));

        statsPanel.add(new JLabel("Average Inter-Arrival Time: "
                + String.format("%.2f", s.getAverageInterArrivalTime())));

        statsPanel.add(new JLabel("Average Time In System: "
                + String.format("%.2f", s.getAverageTimeInSystem())));

        
        // Buttons
            

        JPanel bottomPanel = new JPanel(new BorderLayout());

        bottomPanel.add(statsPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        JButton btnClose = new JButton("Close");

        JButton btnNew = new JButton("New Simulation");

        buttonPanel.add(btnNew);
        buttonPanel.add(btnClose);

        bottomPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(bottomPanel, BorderLayout.SOUTH);

            
        // Button Actions
            

        btnClose.addActionListener(e -> dispose());

        btnNew.addActionListener(e -> {

            new InputFrame();

            dispose();

        });

        setVisible(true);

    }

}