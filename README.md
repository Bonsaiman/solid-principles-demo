# SOLID Principles in Java

To demonstrate the **SOLID** principles in Java with good and bad examples, explaining how each principle is adhered to or violated.

## **S - Single Responsibility Principle (SRP)**

### **Bad Example**
```java
class Report {
    private String title;
    private String content;

    public void saveToFile(String filePath) {
        System.out.println("Saving report to file...");
    }

    public void print() {
        System.out.println("Printing report...");
    }
}
```
**Issue:** The class has multiple responsibilities: data handling, saving, and printing.

### **Good Example**
```java
class Report {
    private String title;
    private String content;
    // Getters only
}

class ReportSaver {
    public void saveToFile(Report report, String filePath) {
        System.out.println("Saving report to file: " + filePath);
    }
}

class ReportPrinter {
    public void print(Report report) {
        System.out.println("Printing report: " + report.getTitle());
    }
}
```
**Reason:** Each class has a single, focused responsibility.

---

## **O - Open/Closed Principle (OCP)**

### **Bad Example**
```java
class AreaCalculator {
    public double calculateArea(String shapeType, double... dimensions) {
        if ("circle".equals(shapeType)) {
            return Math.PI * dimensions[0] * dimensions[0];
        } else if ("rectangle".equals(shapeType)) {
            return dimensions[0] * dimensions[1];
        }
        throw new IllegalArgumentException("Unsupported shape type");
    }
}
```
**Issue:** Adding new shapes requires modifying existing code.

### **Good Example**
```java
abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;
    public Rectangle(double width, double height) { this.width = width; this.height = height; }
    @Override
    public double calculateArea() {
        return width * height;
    }
}
```
**Reason:** New shapes can be added without changing existing code.

---

## **L - Liskov Substitution Principle (LSP)**

### **Bad Example**
```java
class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
```
**Issue:** A subclass violates the behavior of its superclass.

### **Good Example**
```java
interface Flyable {
    void fly();
}

class Sparrow implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}

class Penguin {
    public void walk() {
        System.out.println("Penguin walking...");
    }
}
```
**Reason:** Penguins are not forced to implement flying behavior.

---

## **I - Interface Segregation Principle (ISP)**

### **Bad Example**
```java
interface Worker {
    void work();
    void eat();
}

class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot working...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}
```
**Issue:** RobotWorker is forced to implement an irrelevant method.

### **Good Example**
```java
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human working...");
    }

    @Override
    public void eat() {
        System.out.println("Human eating...");
    }
}

class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot working...");
    }
}
```
**Reason:** Interfaces are split to ensure classes implement only relevant behaviors.

---

## **D - Dependency Inversion Principle (DIP)**

### **Bad Example**
```java
class EmailSender {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

class NotificationService {
    private EmailSender emailSender = new EmailSender();

    public void notify(String message) {
        emailSender.sendEmail(message);
    }
}
```
**Issue:** `NotificationService` depends directly on `EmailSender`, making it hard to extend or test.

### **Good Example**
```java
interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {
    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notify(String message) {
        messageSender.sendMessage(message);
    }
}
```
**Reason:** `NotificationService` depends on abstraction (`MessageSender`), allowing flexible implementation.
