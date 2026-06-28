public class Customer {

    private int customerNumber;
    private double interArrivalTime;
    private double arrivalTime;
    private double serviceTime;
    private double serviceStartTime;
    private double serviceEndTime;
    private double waitingTime;
    private double timeInSystem;
    private double idleTime;

    public Customer() {
    }
    public int getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    public double getInterArrivalTime() {
        return interArrivalTime;
    }
    public void setInterArrivalTime(double interArrivalTime) {
        this.interArrivalTime = interArrivalTime;
    }
    public double getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public double getServiceTime() {
        return serviceTime;
    }
    public void setServiceTime(double serviceTime) {
        this.serviceTime = serviceTime;
    }
    public double getServiceStartTime() {
        return serviceStartTime;
    }
    public void setServiceStartTime(double serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }
    public double getServiceEndTime() {
        return serviceEndTime;
    }
    public void setServiceEndTime(double serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }
    public double getWaitingTime() {
        return waitingTime;
    }
    public void setWaitingTime(double waitingTime) {
        this.waitingTime = waitingTime;
    }
    public double getTimeInSystem() {
        return timeInSystem;
    }
    public void setTimeInSystem(double timeInSystem) {
        this.timeInSystem = timeInSystem;
    }
    public double getIdleTime() {
        return idleTime;
    }
    public void setIdleTime(double idleTime) {
        this.idleTime = idleTime;
    }
}