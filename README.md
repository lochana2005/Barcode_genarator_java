
---

# Barcode Generator - Java GUI Application

A powerful and user-friendly Java-based barcode generator application that allows users to generate and save **CODE 128** barcodes in PNG format. The application utilizes the **ZXing** library for barcode generation, providing a smooth and modern interface powered by **FlatLaf**.

## Features

- **Barcode Generation**: Easily generate a barcode from a text string (e.g., product ID, serial number).
- **Dynamic Display**: View the generated barcode instantly on the GUI.
- **Save Barcode**: Save the generated barcode as a PNG image file to your local storage.
- **Customization**: Adjust the size of the barcode (height and width) to fit your needs.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [License](#license)
- [Acknowledgments](#acknowledgments)

---

## Project Overview

This project is a desktop Java application built to generate **CODE 128** barcodes. The application is designed to be both efficient and easy to use with a modern user interface (UI) built using **Swing** and the **FlatLaf** look and feel. The **ZXing** library is used for barcode generation, which ensures high-quality output and compatibility with most barcode scanners.

### Architecture Overview

The application follows a **Model-View-Controller (MVC)** pattern:

1. **Model**: 
   - Handles barcode generation logic via the `BarcodeGenerator` class.
2. **View**: 
   - The graphical user interface (GUI) where users input text and interact with the application.
3. **Controller**: 
   - Handles user input, generates the barcode, and displays or saves it based on user actions.

---

## Installation

Before you begin, ensure that you have **Java 8 or higher** installed.

### Steps to Clone and Set Up

1. **Clone the repository**:
   ```bash
   git clone https://github.com/lochana2005/Barcode_genarator_java.git
   ```

2. **Import the project into your IDE**:
   - You can open this project in any Java IDE (Eclipse, IntelliJ IDEA, etc.).
   
3. **Add dependencies**:
   This project uses the following libraries:
   - **ZXing**: Barcode generation library
   - **FlatLaf**: A modern, flat look-and-feel for Swing

   If you're using Maven, add the following dependencies to your `pom.xml`:
   
   ```xml
   <dependency>
       <groupId>com.google.zxing</groupId>
       <artifactId>core</artifactId>
       <version>3.4.1</version>
   </dependency>
   <dependency>
       <groupId>com.formdev</groupId>
       <artifactId>flatlaf</artifactId>
       <version>2.0</version>
   </dependency>
   ```

   Alternatively, if you're not using Maven, you can download the JAR files and add them to your project's classpath manually.

---

## Usage

1. **Run the Application**: 
   - Launch the `how_to_work.java` class to start the application. You should see a window with an input text field, a "Generate" button, and an option to save the barcode.

2. **Generate a Barcode**:
   - In the text input field, enter the string you want to encode (e.g., product ID or serial number).
   - Click the "Generate" button to create the barcode. It will be displayed below the input field.

3. **Save the Barcode**:
   - Click the "Save Barcode" button to choose a location and save the generated barcode as a PNG file.
   
---

## Code Structure

### 1. `BarcodeGenerator.java` (Model)

This class is responsible for generating the barcode image. It uses the **ZXing** library to encode a string into a barcode and returns the image.

- **Method**: 
  - `generateBarcode(JLabel label, String text, int width, int height)`: Generates a barcode and displays it in the provided `JLabel`. 

### 2. `how_to_work.java` (Controller + View)

This is the main class that powers the user interface (UI). It contains the input field for barcode text, buttons for generating and saving the barcode, and the logic for handling user interactions.

- **Components**:
  - `JTextField`: For entering the text to encode.
  - `JButton`: To trigger the barcode generation and saving.
  - `JLabel`: To display the generated barcode.

- **Important Methods**:
  - `jButton1ActionPerformed()`: Handles the event when the "Generate" button is clicked.
  - `jButton2ActionPerformed()`: Handles the event when the "Save Barcode" button is clicked.

### 3. `Manifest` (if applicable)
   
If you're building the application into an executable JAR, consider adding a `META-INF/MANIFEST.MF` file to specify the main class, like so:
   
```plaintext
Manifest-Version: 1.0
Main-Class: test_model.how_to_work
```

---

## License

This project is licensed under the **MIT License** - see the LICENSE file for details.

```
MIT License

Copyright (c) 2025 Lochana

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```

---

## Acknowledgments

- **ZXing (Zebra Crossing)**: Barcode generation library used to create high-quality barcodes. [ZXing GitHub](https://github.com/zxing/zxing)
- **FlatLaf**: Modern look-and-feel for Java Swing. [FlatLaf GitHub](https://github.com/JFormDesigner/FlatLaf)

---

