# Lecture 4

## CPU Architecture (in a nutshell)

- Level 1 cache $\rightarrow$ embed in a core of CPU
- Level 2 cache $\rightarrow$ embed in a group of CPU core
- Level 3 cache $\rightarrow$ embed in the board

## Instruction

To complete an instruction we need to do 5 steps (1 per a CLK cycle)
1. Fetch
2. Decode
3. Execute
4. Memory
5. Store

## How Pipelining work

| Fetch | Decode | Execute | Memory | Store |
| :---: | :----: | :-----: | :----: | :---: |
| I1 | - | - | - | - |
| I2 | I1 | - | - | - |
| I3 | I2 | I1 | - | - |
| I4 | I3 | I2 | I1 | - |
| I5 | I4 | I3 | I2 | I1 |
| I6 | I5 | I4 | I3 | I2 |
| ... | ... | ... | ... | ... |

## Why most electroic devices not use a single processor?

## First Assembly Program

```asm
global _start

_start:
    MOV r0, #42
    MOV r1, 
```


## Objective

- Know the basic ARM Assembly Instruction and how to use it (Cheat Sheet Provided for most frequent used instructions)
- Know the parts of `.s` code $\rightarrow$ E.g. `.text` `.data` `.global _start`
- Must use 32 bit format of ARM Assembly
