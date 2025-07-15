# restaurant_menu_card

🍽 Restaurant Menu Card App

A simple Android application that displays a restaurant menu and allows users to order food using a clean, user-friendly interface. Built using Android Studio with XML layouts and Java/Kotlin, this app demonstrates basic UI/UX design for food ordering functionality.


---

📱 Features

🍕 Browse food items categorized by type (e.g., Starters, Main Course, Desserts, Drinks).

🛒 Add items to the order/cart.

💵 View total price of selected items.

✅ Place order with confirmation.

✨ Material Design components for a modern look.



---

🛠 Technologies Used

Android Studio

XML for UI Design

Java/Kotlin for Backend Logic

Material Components for enhanced UI/UX



---

📄 UI Screens (Designed in XML)

1. Home Screen – Displays restaurant logo and "Start Order" button.


2. Menu Screen – Categorized list of food items with images, descriptions, and "Add" buttons.


3. Cart Screen – Shows selected items, quantity, price, and "Place Order" button.


4. Order Confirmation – Shows success message with summary.




---

💡 How It Works

All UI screens are created using XML layout files.

On selecting a menu item, it is added to an in-memory cart.

Prices are calculated dynamically.

Clicking “Place Order” confirms the order and clears the cart.



---

📂 Folder Structure

RestaurantMenuApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/         # Contains all Java/Kotlin files
│   │   │   ├── res/
│   │   │   │   ├── layout/   # XML layout files (activity_main.xml, menu.xml, etc.)
│   │   │   │   ├── drawable/ # Icons and food images
│   │   │   │   ├── values/   # Colors, styles, strings
├── build.gradle
└── README.md


---

🚀 Future Improvements

Firebase integration for live orders.

Admin panel to update menu.

Payment gateway integration.

Jetpack Compose version for modern UI.



---

👨‍🍳 Author

Developed by Aishwary Pratap Singh
Feel free to contribute or fork this repo for your own learning!


