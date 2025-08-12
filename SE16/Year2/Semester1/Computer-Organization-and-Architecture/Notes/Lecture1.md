# Lecture 1: Introduction

## What is Computer Architecture?

Computer Architecture fill the gap between Physical and Abstraction in Computer

## The Three Y's

- Hierarchy
- Modularity
- Regularity

## Number Systems

- Decimal, Binary, Hexadecimal
- Byte (8bit)
- Nibble (4bit)
- Word size (32/64bit)
- Range of unsigned int

## CISC VS RISC

Complex Instruction System Computer $\rightarrow$ Intel AMD
Reduced Instruction System Computer $\rightarrow$ ARM

## Organized of a Computer

- Input
- Datapath
- Control
- Memory
- Output

## Why do we need memory?

Because CPU is very fast.
E.G.: We need CPU to slow down by keeping it in the memory to let user
see the output bcuz users are slow

## Von Neumann Machine

- Main Memory
- Arithmetic Logic
- Program Control
- I/O

## IAS Machine

- Main memory
- 1 Word can store 40 bits of Data
- Store numbers in FixedPoints
- 1 word 20 bits Opcode 8 bits Adress 12 bits (1 word 2 Instructions)

### IAS Machine Registers

1. Accumulator (AC) and Multiplier quotient (MQ) $\rightarrow$ store
data and result from operations from ALU (Arithmetic Logic Unit)  
2. Memory Buffer Register (MBR) $\rightarrow$ store the 1 word data
in buffer memory or read from memory  
3. Instructions Buffer Register (IBR) $\rightarrow$ store 20 bits of
instruction waiting for processing (collect temp data)
4. Program Counter (PC) $\rightarrow$ store the address of the next
instruction
5. Instruction Register (IR) $\rightarrow$ store the opcode of the
instruction to be processed
6. Memory Address Register (MAR) $\rightarrow$ store the upcoming
address in size of 1 word to be recorded next in the MBR

Example of ARM Assembly Code:

| Memory | Command |
| :----: | :-----: |
| 1 | 10 -> R0 |
| 2 | 5 -> R1 |
| 3 | R0 + R1 -> R0 |
| 4 | R0 -> 111 |
| ... | ... |
| 111 | ... |

```
STR R1, 5
```

```
Instruction Destination, Source
```

> Frequency: 1 CLK cycle $\rightarrow$ Unit: Hz

## Level of Representation in Computer System

- Applicatioon/Software
- OS
- Architecture
- Microarchitecture
- Logic
- Digital Circuits
- Devices
- Physics

## HS: High Speed Architecture

- Performance Optimization -> High Performance
- Power Efficiency -> Balance Performance and Power consumption
- Advance Power Modes -> Power Saving Modes etc.
- Multi-Vt Construction -> Multi Threshold Voltage
- Fast Cache Instances -> Reducing Latency by Caches

## Execution cycle

- Instruction Fetch
- Instruction Decode
- Operand Fetch
- Execution
- Result Store
- Next Instruction

> RISC is mostly Pipelining, therefore require more RAM  
> CISC doesn't have smooth Pipelining
