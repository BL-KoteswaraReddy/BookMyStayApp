# BookMyStayApp

## Overview

BookMyStayApp is a Core Java-based Hotel Booking Management System designed to demonstrate the practical use of Java Collections Framework and Object-Oriented Programming concepts through real-world hotel booking scenarios.

The application supports room inventory management, room search, booking requests, reservation confirmation, add-on service selection, and booking history reporting.

---

## Features

### UC1: Room Inventory Setup & Management

* Add room types (Single, Double, Suite)
* Maintain room counts
* Maintain room pricing
* Update room inventory dynamically
* View real-time room availability

### UC2: Room Search & Availability Check

* Search room details by room type
* View room availability
* Display room amenities
* View room pricing

### UC3: Booking Request (First-Come-First-Served)

* Accept booking requests
* Store requests in booking queue
* Process requests using FIFO principle

### UC4: Reservation Confirmation & Room Allocation

* Allocate unique room IDs
* Prevent duplicate room allocation
* Confirm reservations
* Update room availability automatically

### UC5: Add-On Service Selection

* Add optional services to reservations
* Breakfast
* Spa
* Airport Pickup
* Calculate total service cost

### UC6: Booking History & Reporting

* Store confirmed reservations
* View booking history
* Cancel reservations
* Generate reservation reports

---

## Technologies Used

* Java 17+ (Compatible with Java 25)
* Java Collections Framework

  * HashMap
  * HashSet
  * Queue (LinkedList)
  * ArrayList
* Object-Oriented Programming

---

## Project Structure

com.bookmystayapp

* Main
* RoomInventoryService
* BookingQueueService
* Reservation
* Services
* ServiceManagementModule
* ReportingService

---

## Data Structures Used

| Use Case | Data Structure               | Purpose                |
| -------- | ---------------------------- | ---------------------- |
| UC1      | HashMap<String,Integer>      | Room Inventory         |
| UC1      | HashMap<String,Double>       | Room Prices            |
| UC2      | HashMap<String,List<String>> | Room Amenities         |
| UC3      | Queue<Reservation>           | Booking Requests       |
| UC4      | HashSet<String>              | Unique Room Allocation |
| UC4      | HashMap<String,Set<String>>  | Room Assignments       |
| UC5      | Map<String,List<Service>>    | Reservation Services   |
| UC6      | List<Reservation>            | Booking History        |

---

## How to Run

1. Clone the repository

```bash
git clone <repository-url>
```

2. Navigate to project directory

```bash
cd BookMyStayApp
```

3. Compile and run

```bash
mvn clean compile
mvn exec:java
```

Or run the Main class directly from IntelliJ IDEA.

---

## Learning Objectives

This project demonstrates:

* Object-Oriented Design
* Encapsulation
* Composition
* Collection Framework Usage
* Queue-Based Processing
* HashMap Operations
* HashSet Uniqueness Handling
* Reporting and Audit Tracking
* Real-world System Design Concepts

---

## Future Enhancements

* File-based persistence
* Database integration
* Spring Boot REST APIs
* Authentication & Authorization
* Payment Integration
* Hotel Admin Dashboard
* Booking Notifications
* Microservices Architecture

---

## Author

Koti Reddy

Core Java
