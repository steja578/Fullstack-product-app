System Architecture Diagram (High-Level)
         ┌───────────────────────────┐
         │        Frontend            │
         │  Angular (http://4200)     │
         │  Product UI                │
         └───────────▲────────────────┘
                     │ REST API Calls (JSON)
                     │
         ┌───────────┴────────────────┐
         │        Backend              │
         │  Spring Boot (http://8080) │
         │  Product API (Java 21)     │
         └───────────▲────────────────┘
                     │ Repository Layer
                     │
         ┌───────────┴────────────────┐
         │       Database              │
         │  MongoDB Atlas (Cloud)     │
         │  productdb / products      │
         └───────────▲────────────────┘
                     │ Logs & Metrics
                     │
         ┌───────────┴────────────────┐
         │        Monitoring           │
         │  AWS CloudWatch / Splunk   │
         │  Spring Boot Actuator      │
         └────────────────────────────┘

# 🌟 Fullstack Product App

A modern full-stack application built with:

- **Angular** (Frontend UI)
- **Spring Boot** (Backend REST API with Java 21)
- **MongoDB Atlas** (Cloud Database)
- **AWS-ready** for deployment
- **Monitoring** via CloudWatch / Splunk + Spring Boot Actuator

---

## 🚀 Features
- Add new products (name, price, description)
- View all products (fetched from MongoDB Atlas)
- Backend: Spring Boot REST APIs
- Frontend: Angular UI
- Database: MongoDB Atlas (`productdb` / `products` collection)

---

## 🏗️ Project Structure
fullstack-product-app/
│
├── backend/ → Spring Boot (product-api)
│ └── src/main/java/com/example/productapi
│
├── frontend/ → Angular (product-ui)
│ └── src/app
│
└── README.md

