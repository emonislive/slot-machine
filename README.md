# 🎰 Java Slot Machine

A simple console-based **Slot Machine** game written in Java. Place your bets, spin the reels, and see if you hit the jackpot!

## Features

- 🎮 Interactive command-line gameplay
- 💰 Starting balance of $100
- 🔁 Continuous betting until balance runs out or user quits
- 🪙 Winnings based on matching symbols:
  - **"10"**: Jackpot — 200% return!
  - **"7"**: 50% return
  - **"5"**: 40% return
  - **"3"**: 30% return
  - **"1"**: 20% return

## How to Run

### Prerequisites

- Java 21 (OpenJDK)
- IDE (optional but recommended): JetBrains IntelliJ IDEA

### Steps

1. Clone the repository or download the `SlotMachine.java` file.
2. Open **JetBrains IntelliJ IDEA**.
3. Click on `File` > `Open...`, and select the folder containing `SlotMachine.java` (e.g., `slot-machine/`).
4. IntelliJ will detect it as a Java project. If prompted, select Java 21 SDK.
5. To run:
   - Right-click on `SlotMachine.java`
   - Choose `Run 'SlotMachine.main()'`

### Or run manually via terminal:

```bash
javac SlotMachine.java
java SlotMachine
```

## Game Rules

- You start with $100.
- Minimum bet is $1.
- After each spin, if all four symbols match, you win based on the symbol type.
- If not, you lose the bet.
- You can keep playing as long as you have balance and choose to continue.

## Developer Notes

- Written in plain Java (no external libraries)
- Easily extendable with more symbols or bonus features
- Contains basic error handling for invalid inputs and insufficient funds

## Tech Stack

- **Java Version**: OpenJDK 21
- **IDE Used**: JetBrains IntelliJ IDEA

## Project Preview

```
********************************
  WELCOME TO JAVA SLOT MACHINE
  SYMBOLS: 10 | 7 | 5 | 3 | 1
********************************
YOUR CURRENT BALANCE: 100.0
PLACE YOUR BET AMOUNT: 10
SPINNING...
5 | 5 | 5 | 5
YOU WON 40% OF THE BETTING MONEY!
YOU WON $4.0
YOUR CURRENT BALANCE: 94.0
```

## 📜 License

This project is open-source and available under the [MIT License](LICENSE).
