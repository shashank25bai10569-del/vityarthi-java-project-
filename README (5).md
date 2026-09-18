<div align="center">

# 🎓 CCRM — Campus Course & Records Manager

### A Console-Based Campus Management System
**Object-Oriented Programming Project · SHASHANK (25BAI10569)**

![Java](https://img.shields.io/badge/java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/paradigm-OOP-4B8BBE?style=for-the-badge)
![CLI](https://img.shields.io/badge/interface-CLI-2F855A?style=for-the-badge)
![Status](https://img.shields.io/badge/status-working-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/license-Academic%20Use-2F855A?style=for-the-badge)

*A Java console application for managing students, courses, and enrollments — built around core OOP principles so the codebase stays easy to extend, not just easy to run.*

</div>

---

## 📖 Table of Contents

- [Overview](#-overview)
- [What Makes This Special](#-what-makes-this-special)
- [Repository Structure](#-repository-structure)
- [Getting Started](#-getting-started)
- [Java History — Quick Overview](#-java-history--quick-overview)
- [Java Editions — Which One to Use](#-java-editions--which-one-to-use)
- [JVM, JRE, JDK Explained](#-jvm-jre-jdk-explained)
- [Windows Setup Guide](#-windows-setup-guide)
- [OOP Concepts Demonstrated](#-oop-concepts-demonstrated)
- [Running with Eclipse](#-running-with-eclipse)
- [Assertions & Manual Compilation](#-assertions--manual-compilation)
- [Screenshots Included](#-screenshots-included)
- [Future Improvements](#-future-improvements)

---

## 📖 Overview

CCRM is a campus management system built as a Java course project — but it's not just another console app that nobody wants to use. It's designed to make managing students, courses, and enrollments genuinely pleasant to work with, using the object-oriented principles taught in class so the result is maintainable, not just functional.

```
CCRM-Java-Project/
├── edu/ccrm/
│   ├── cli/           # Main menu — MainMenu.java
│   ├── config/        # App settings and configuration
│   ├── domain/        # Core classes — Student, Course, etc.
│   ├── service/       # Business logic
│   └── util/          # Utility classes and helpers
├── screenshots/       # Screenshots showing it in action
└── README.md          # This file
```

(Back to top)

---

## ✨ What Makes This Special?

Think of CCRM as a digital campus assistant. Whether you're tracking student enrollments, managing course catalogs, or backing up your data, it handles all of it — built on object-oriented principles so it's not just working, it's maintainable.

Need database integration later? No problem — the architecture is designed so future enhancements slot in cleanly, without reworking what's already there.

(Back to top)

---

## 🗂 Repository Structure

```
CCRM-Java-Project/
 ├─ edu/ccrm/
 │   ├─ cli/           ← main menu stuff (MainMenu.java)
 │   ├─ config/        ← App settings and configuration
 │   ├─ domain/        ← important classes (Student, Course, etc.)
 │   ├─ service/       ← where the business logic happens
 │   └─ util/          ← utility classes and helpers
 ├─ screenshots/       ← screenshots to show it works
 └─ README.md          ← this file
```

(Back to top)

---

## 🚀 Getting Started

**What you need:**

| Requirement | Detail |
|---|---|
| Java | Version 17 or newer (LTS — recommended by course instructor) |
| IDE | VS Code with Java Extension Pack, or Eclipse IDE |
| Time | About 5–10 minutes |

<img width="1596" height="650" alt="downloading java" src="https://github.com/user-attachments/assets/33b20a3d-bd8c-48a0-b5d5-571835a03300" />

**How to run:**

1. Open VS Code and load the `CCRM-Java-Project` folder.
2. Navigate to `edu/ccrm/cli/MainMenu.java`.
3. Click **Run** — it should start immediately.

The menu is intuitive enough to explore on your own.

(Back to top)

---

## 📜 Java History — Quick Overview

| Year | Milestone |
|---|---|
| 1995 | Java 1.0 released (Sun Microsystems) |
| 2004 | Java 5 adds Generics and Enums |
| 2014 | Java 8 brings Streams and Lambdas (functional programming) |
| 2017 | Oracle moves to a 6-month release cadence |
| Now | Project targets Java 17+ for Long Term Support (LTS) |

(Back to top)

---

## 🧩 Java Editions — Which One to Use

| What You Want to Build | Java Edition |
|---|---|
| Desktop apps, console programs | **Java SE** (used in this project) |
| Web applications, enterprise systems | **Java EE / Jakarta EE** |
| Mobile apps, embedded systems | **Java ME** |

(Back to top)

---

## 🏗 JVM, JRE, JDK Explained

| Component | Role |
|---|---|
| **JVM** | Runs the compiled bytecode |
| **JRE** | JVM + the libraries needed to run programs |
| **JDK** | Everything — JRE + compiler + development tools |

In short: the JDK contains the JRE, and the JRE contains the JVM.

(Back to top)

---

## 🪟 Windows Setup Guide

1. Download the JDK from the [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install it and set up the `JAVA_HOME` environment variable.
3. Verify the install:

   ```bash
   java -version
   javac -version
   ```

![java version](https://github.com/user-attachments/assets/7e7d0f3a-4650-426f-8c4a-de99b31cc124)

If you see version numbers printed, you're good to go.

(Back to top)

---

## 🧠 OOP Concepts Demonstrated

This project applies the core object-oriented concepts covered in the course:

| Concept | Where to Find It | Why It Matters |
|---|---|---|
| **Encapsulation** | `Student.java` — private fields | Keeps data secure |
| **Inheritance** | `Person → Student, Instructor` | Reuses code efficiently |
| **Abstraction** | `Person.java` — abstract class | Clean, consistent interfaces |
| **Polymorphism** | `printProfile()` overrides | Same method, different behavior |
| **Immutable Classes** | `CourseCode.java` | Thread-safe objects |
| **Nested Classes** | `Course.Builder` | Better internal organization |
| **Enums** | `Grade.java`, `Semester.java` | Type-safe constants |
| **Lambda Expressions** | Used throughout | Improves readability |
| **Design Patterns** | Singleton, Builder | Industry-standard practices |
| **File Operations** | `FileUtil.java` (NIO.2) | Modern file handling |
| **Date/Time API** | Student admission dates | Safer than the legacy `Date` class |

(Back to top)

---

## 🎨 Running with Eclipse

If you prefer Eclipse IDE:

1. **File → New → Java Project**
2. Name it `CCRM-Java-Project`
3. Copy the source files into the `edu/ccrm/` package structure
4. Run `MainMenu.java`

<img width="1091" height="544" alt="Eclipse setup" src="https://github.com/user-attachments/assets/f6758ac1-46c7-4056-8126-9ae414213a23" />
<img width="638" height="679" alt="eclipse install" src="https://github.com/user-attachments/assets/becaaee9-3832-49e6-b9c7-1632797ee4a5" />

(Back to top)

---

## ✅ Assertions & Manual Compilation

**Enabling assertions** (optional but recommended):

```java
// in your code:
assert credits > 0 : "Credits must be positive";
```

Run with assertions enabled:

```bash
java -ea edu.ccrm.cli.MainMenu
```

**Compiling everything manually:**

```bash
# compile all Java files
javac -d . $(find edu -name "*.java")

# run the program
java edu.ccrm.cli.MainMenu
```

(Back to top)

---

## 📸 Screenshots Included

Screenshots are included to show everything actually works:

- Java version check
- VS Code project structure
- CLI running
- Backup functionality working

(Back to top)

---

## 🔮 Future Improvements

This is just the beginning — the modular structure makes it straightforward to add:

- [ ] Database connectivity (JDBC integration)
- [ ] Web interface
- [ ] REST API
- [ ] Better reporting features
- [ ] Whatever else comes up along the way

The architecture is built to let new features come in without breaking what's already there.

(Back to top)

