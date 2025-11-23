# 🏴‍☠️ One Piece World

![GitHub contributors](https://img.shields.io/github/contributors/pedrocorsini/ecot12?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/pedrocorsini/ecot12?style=for-the-badge)
![GitHub issues](https://img.shields.io/github/issues/pedrocorsini/ecot12?style=for-the-badge)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)

This repository is a Java Project about the **One Piece World**, the goal is to develop around 20 classes and interacting them with inheritances, polymorphism etc.

## 📚 Project Overview

- Built with **Java** (Maven project structure).
- Includes **source code, UML diagrams, and project configuration**.

## 📂 Repository Structe

```plaintext
one-piece-world/
├── src/
│   └── main/
│       └── java/br/eng/corsini/        
│           └── onepiece_en           # English Package  
│           └── onepiece_ptbr         # Brazilian Portuguese Package  
│           └── MainBr.java           # Brazilian Portuguese Main Class
│           └── MainEn.java           # English Main Class  
│       └── resources/                # Resources folder  
|   └── test/
├── .gitignore                        # Git ignore file
├── LICENSE                           # MIT Student License
├── README.md                         # Project documentation
└── pom.xml                           # Maven configuration file
```

---

## 🛠️ Tools & Technologies

- **Java** (main programming language)
- **Maven** (dependency and build management)
- **Dia** (diagram design tool)
- **Git/GitHub** (version control and hosting)

---

## 🖼️ Project Diagram

- English version:
<img src="src/main/resources/english-onepiece-diagram.png" alt="english-diagram">

- Portuguese version:
<img src="src/main/resources/onepiece-diagram.png" alt="portuguese-diagram">

---

## How to run

1. **Clone the repository**  
   ```bash
   git clone git@github.com:pedrocorsini/one-piece-world.git
   ```
2. **Pull the lastest changes**
   ```bash
   git pull origin main
   ```
3. **Compile the project**
   ```bash
   mvn clean compile
   ```
4. **Run the project**
   ```bash
   mvn exec:java -Dexec.mainClass="br.eng.corsini.<MainClass>"
   ```

## ✨ Author

👤 **Pedro Corsini**  

---

⭐ If you like this project, consider giving it a star!  
