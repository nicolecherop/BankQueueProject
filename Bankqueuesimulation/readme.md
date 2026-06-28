# Bank Queue Simulation
# Group Members : Nicole Cheruiyot, Albert Jonathan, Kian Muchemi, Trina Kinyua
# Admission Numbers: 167216, 166343, 159377, 168111
## Overview
This project is a Java Swing application developed for the ICS 4106 Computer Simulation and Modelling course. It simulates a single-server bank queue using the First Come First Served queue discipline.

Inter-arrival times are generated using a Uniform(1,8) distribution while service times are generated using a Uniform(1,6) distribution.

The application allows the user to enter the number of customers, performs the simulation, and displays customer information together with queue performance statistics.
---

## Features
- Java Swing graphical user interface
- Input validation
- Random inter-arrival times
- Random service times
- Customer results displayed in a table
- Queue statistics calculated automatically
---

## Queue Statistics

The application calculates:

- Average Waiting Time
- Probability Customer Waits
- Server Idle Proportion
- Server Busy Probability
- Average Service Time
- Average Waiting Time 
- Average Inter-arrival Time
- Average Time in System

---

## Project Structure

src/
│
├── Main.java
├── Customer.java
├── Statistics.java
├── Simulation.java
├── InputFrame.java
└── OutputFrame.java

---

## How to Run

1. Open the project in IDE.
2. Run Main.java.
3. Enter the number of customers.
4. Click Run Simulation.
