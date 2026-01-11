# 🚘 Car Database Application (Android/Kotlin)

A native Android application designed to manage a repository of vehicle data. Built using **Kotlin** and **Android Studio**, this app allows users to catalog cars by storing details like brand, model type, engine capacity, and fuel type in a local database.

## 📖 Project Overview


This project serves as a digital garage manager. It replaces paper records with a mobile interface where users can perform full **CRUD** (Create, Read, Update, Delete) operations. It is useful for car dealerships, collectors, or anyone needing to track vehicle specifications on the go.

**Developed by:** Group 4 (CCIT-FTUI)
* **Gafrilatif Aviandi Putra Adnanta**
* **Muhamad Farhan Budiana**

## 🛠️ Tech Stack
* **Language:** Kotlin
* **IDE:** Android Studio
* **UI:** XML Layouts (ConstraintLayout, RecyclerView)
* **Database:** SQLite / Room Persistence Library
* **Architecture:** MVVM (Model-View-ViewModel) *[Optional: remove if you didn't use strict MVVM]*

## ✨ Key Features
Based on the application workflow:
* **🏠 Home Dashboard:** Displays a scrollable list of all registered vehicles.
* **➕ Add Car Data:** A dedicated form to input new vehicle details:
    * **Merk (Brand):** e.g., Toyota, Suzuki, Mercedes.
    * **Type:** e.g., MPV, SUV, Truck.
    * **Kubikasi (Engine CC):** e.g., 1500cc, 2500cc.
    * **Bahan Bakar (Fuel):** e.g., Petrol, Diesel, Electric.
* **✏️ Edit/Update:** Modify existing records (e.g., correct a typo in the engine capacity).
* **🗑️ Delete:** Remove vehicles from the database that are sold or no longer in stock.

## 📱 Screens
1.  **Homescreen:** Lists cars like "Indomobil Suzuki Ertiga" or "Mitsubishi Xpander Cross" with quick summaries.
2.  **Input Form:** Clean text fields for data entry with a "Simpan" (Save) button.
3.  **Edit Menu:** Options to "Change (Update)" or "Delete (Remove Stock)" for specific items.

## 🚀 How to Run
1.  **Prerequisites:** Install **Android Studio** and set up an Emulator (AVD) or connect a physical Android device.
2.  **Clone the Repo:**
    ```bash
    git clone [https://github.com/YourUsername/Car-Database-Android.git](https://github.com/YourUsername/Car-Database-Android.git)
    ```
3.  **Open Project:**
    * Launch Android Studio.
    * Select **Open an Existing Project** and choose the cloned folder.
    * Let Gradle sync the dependencies.
4.  **Run:** Click the green **Run** (Play) button.

## 📄 License
This project was submitted as a Mobile Development assignment for the **CCIT-FTUI** program (May 2023).
