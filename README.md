# Java OOP Practice Exercises

This set of exercises is designed to practice **Object-Oriented Programming concepts in Java**, including abstraction, inheritance, interfaces, static/final attributes, and method implementation.

---

## Level 1

### Exercise 1: Musical Instruments
In a music band there are different types of musical instruments: **wind**, **string**, and **percussion**.

- All instruments must have the attributes:
  - `name`
  - `price`

- All instruments must also have a method `play()`:
  - This method is **abstract** in the `Instrument` class.
  - It must be implemented in the child classes.

The method should print to the console depending on the type of instrument:
- Wind → `A wind instrument is playing`
- String → `A string instrument is playing`
- Percussion → `A percussion instrument is playing`

The **class loading process** only happens once.  
Demonstrate that class loading can be triggered either by:
1. Creating the first instance of the class.
2. Accessing one of its static members.

👉 Research **initialization blocks** and **static blocks** in Java.

---

### Exercise 2: Car Class
Create a class `Car` with the attributes:
- `brand` → `static final`
- `model` → `static`
- `horsepower` → `final`

Tasks:
1. Demonstrate the difference between the three.
2. Which of them can be initialized in the constructor?

Add two methods to the `Car` class:
- **Static method** `brake()` → prints:
- **Non-static method** `accelerate()` → prints:

From the application’s `main()` method, demonstrate how to invoke both the static and non-static methods.

---

## Level 2

### Exercise 1: Smartphone
1. Create a class `Phone` with the attributes:
 - `brand`
 - `model`

 Add a method `call(String number)` that prints:

2. Create two interfaces:
- `Camera` → with the method `takePhoto()`
- `Watch` → with the method `alarm()`

3. Create a class `Smartphone` that:
- Extends `Phone`
- Implements both `Camera` and `Watch`

Implement the interface methods:
- `takePhoto()` → prints:
- `alarm()` → prints:

4. From the application’s `main()` method, create a `Smartphone` object and call all the methods (`call()`, `takePhoto()`, `alarm()`).

