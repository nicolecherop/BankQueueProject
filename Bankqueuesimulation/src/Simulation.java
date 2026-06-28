import java.util.ArrayList;
import java.util.Random;

public class Simulation {

    private ArrayList<Customer> customers;
    private Statistics statistics;

    public Simulation() {
        customers = new ArrayList<>();
        statistics = new Statistics();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void runSimulation(int numberOfCustomers) {

        customers.clear();
        statistics = new Statistics();

        Random random = new Random();

        double totalWaiting = 0;
        double totalService = 0;
        double totalSystem = 0;
        double totalInterArrival = 0;
        double totalIdle = 0;

        int customersWhoWaited = 0;

        double previousArrival = 0;
        double previousFinish = 0;

        for (int i = 1; i <= numberOfCustomers; i++) {

            Customer customer = new Customer();

            customer.setCustomerNumber(i);

            // Generating Interarrival Time U(1,8)
            double interArrival = 1 + random.nextDouble() * 7;

            // Generate Service Time U(1,6)
            double serviceTime = 1 + random.nextDouble() * 5;

            // Arrival time
            double arrivalTime = previousArrival + interArrival;

            // Service start time
            double serviceStart = Math.max(arrivalTime, previousFinish);

            // Service end Time
            double serviceEnd = serviceStart + serviceTime;

            // Waitingtime
            double waitingTime = serviceStart - arrivalTime;

            // Time in System
            double timeInSystem = waitingTime + serviceTime;

            // Idle time
            double idleTime = Math.max(0, arrivalTime - previousFinish);

            // Store values
            customer.setInterArrivalTime(interArrival);
            customer.setArrivalTime(arrivalTime);
            customer.setServiceTime(serviceTime);
            customer.setServiceStartTime(serviceStart);
            customer.setServiceEndTime(serviceEnd);
            customer.setWaitingTime(waitingTime);
            customer.setTimeInSystem(timeInSystem);
            customer.setIdleTime(idleTime);

            customers.add(customer);

            // Update totals
            totalInterArrival += interArrival;
            totalWaiting += waitingTime;
            totalService += serviceTime;
            totalSystem += timeInSystem;
            totalIdle += idleTime;

            if (waitingTime > 0) {
                customersWhoWaited++;
            }

            previousArrival = arrivalTime;
            previousFinish = serviceEnd;
        }

        // Calculate statistics
        double averageWaitingTime = totalWaiting / numberOfCustomers;

        double probabilityCustomerWaits =
                (double) customersWhoWaited / numberOfCustomers;

        double serverIdleProportion =
                totalIdle / previousFinish;

        double serverBusyProbability =
                (previousFinish - totalIdle) / previousFinish;

        double averageServiceTime =
                totalService / numberOfCustomers;

        double averageWaitingTimeWaiters;

        if (customersWhoWaited == 0) {
            averageWaitingTimeWaiters = 0;
        } else {
            averageWaitingTimeWaiters =
                    totalWaiting / customersWhoWaited;
        }

        double averageInterArrivalTime =
                totalInterArrival / numberOfCustomers;

        double averageTimeInSystem =
                totalSystem / numberOfCustomers;

        // Save statistics
        statistics.setAverageWaitingTime(averageWaitingTime);

        statistics.setProbabilityCustomerWaits(probabilityCustomerWaits);

        statistics.setServerIdleProportion(serverIdleProportion);

        statistics.setServerBusyProbability(serverBusyProbability);

        statistics.setAverageServiceTime(averageServiceTime);

        statistics.setAverageWaitingTimeWaiters(
                averageWaitingTimeWaiters);

        statistics.setAverageInterArrivalTime(
                averageInterArrivalTime);

        statistics.setAverageTimeInSystem(
                averageTimeInSystem);
    }
}