# Lecture 1: Introduction

What is Computer Architecture

ComArchi fill the gap between Physical and Abstraction in Computer

The Three Y's

- Hierarchy
- Modularity
- Regularity

Number Systems

- Decimal, Binary, Hexadecimal
- Byte (8bit)
- Nibble (4bits)
- Word size (32/64bit)
- Range of unsigned int

CISC VS RISC

Complex Instruction System Computer -> Intel AMD
Reduced Instruction System Computer -> ARM

Organized of a Computer

- Input
- Datapath
- Control
- Memory
- Output

Why do we need memory?

Bcuz CPU is very fast.
E.G.: We need CPU to slow down by keeping it in the memory to let user
see the output bcuz users are slow

Von Neumann Machine

- Main Memory
- Arithmetic Logic
- Program Control
- I/O

IAS Machine

- Main memory
- 1 World can store 40 bits of Data
- Store numbers in FixePoints
- 1 word 20 bits Opcode 8 bits Adress 12 bits (1 word 2 Instructions)

1. Accumulator (AC)
2. Memory Buffer Register (MBR)
3. Instructions Buffer Register (IBR)
4. Program Counter (PC)
5. Instruction Register (IR)
6. Memory Address Register (MAR)

E.G.:

| Memory | Command |
| ------ | ------- |
| 1 | 10 -> R0 |
| 2 | 5 -> R1 |
| 3 | R0 + R1 -> R0 |
| 4 | R0 -> 111 |
| ... | ... |
| 111 | ... |

```asm
STR R1, 5
```
```
Instruction Destination, Source
```

Frequency: 1 CLK cycle -> Unit: Hz

Level of Representation in Computer System

- Applicatioon/Software
- OS
- Architecture
- Microarchitecture
- Logic
- Digital Circuits
- Devices
- Physics

HS: High Spped Architecture

- Performance Optimization -> High Performance
- Power Efficiency -> Balance Performance and Power consumption
- Advance Power Modes -> Power Saving Modes etc.
- Multi-Vt Construction -> Multi Threshold Voltage
- Fast Cache Instances -> Reducing Latency by Caches

Execution cycle

- Instruction Fetch
- Instruction Decode
- Operand Fetch
- Execution
- Result Store
- Next Instruction

RISC is mostly Pipelining, therefore require more RAM
CISC doesn't have smooth Pipelining
