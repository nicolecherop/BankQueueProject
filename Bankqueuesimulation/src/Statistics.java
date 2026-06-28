public class Statistics {

    private double averageWaitingTime;
    private double probabilityCustomerWaits;
    private double serverIdleProportion;
    private double serverBusyProbability;
    private double averageServiceTime;
    private double averageWaitingTimeWaiters;
    private double averageInterArrivalTime;
    private double averageTimeInSystem;

    public Statistics() {
    }

    public double getAverageWaitingTime() {
        return averageWaitingTime;
    }

    public void setAverageWaitingTime(double averageWaitingTime) {
        this.averageWaitingTime = averageWaitingTime;
    }

    public double getProbabilityCustomerWaits() {
        return probabilityCustomerWaits;
    }

    public void setProbabilityCustomerWaits(double probabilityCustomerWaits) {
        this.probabilityCustomerWaits = probabilityCustomerWaits;
    }

    public double getServerIdleProportion() {
        return serverIdleProportion;
    }

    public void setServerIdleProportion(double serverIdleProportion) {
        this.serverIdleProportion = serverIdleProportion;
    }

    public double getServerBusyProbability() {
        return serverBusyProbability;
    }

    public void setServerBusyProbability(double serverBusyProbability) {
        this.serverBusyProbability = serverBusyProbability;
    }

    public double getAverageServiceTime() {
        return averageServiceTime;
    }

    public void setAverageServiceTime(double averageServiceTime) {
        this.averageServiceTime = averageServiceTime;
    }

    public double getAverageWaitingTimeWaiters() {
        return averageWaitingTimeWaiters;
    }

    public void setAverageWaitingTimeWaiters(double averageWaitingTimeWaiters) {
        this.averageWaitingTimeWaiters = averageWaitingTimeWaiters;
    }

    public double getAverageInterArrivalTime() {
        return averageInterArrivalTime;
    }

    public void setAverageInterArrivalTime(double averageInterArrivalTime) {
        this.averageInterArrivalTime = averageInterArrivalTime;
    }

    public double getAverageTimeInSystem() {
        return averageTimeInSystem;
    }

    public void setAverageTimeInSystem(double averageTimeInSystem) {
        this.averageTimeInSystem = averageTimeInSystem;
    }
}