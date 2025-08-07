# Storage and File System

## Basic Unix File System

- Inodes
- Directories
- Links
- Devices

### Inodes

- Each file is represneted by an inode
- Each inode contain the descriptions of the file: file type, access
rights, owners, timestamps, size, pointers to data blocks
- The addresses of data blocks allocated to a file are in its inode

> Data blocks
> - Size: 8KB
> - Behaviour: Like Linked List but more physical
> - Defracmentation: 
>   - Windows: Manually
>   - MacOS and Linux: Automatically


### Linux File System Layout

- Normally the part of the partition which crash the system is the
Super Blocks

## Secure Digital (SD) Card

### Tyes of Cells

- SLC: Single-Level Cell
- MLC: Multi-Level Cell
- TLC: Triple-Level Cell
- QLC: QUad-Level Cell

## SSD

### Block / Page

#### Page

A page is the `smallest` unit of data that can be read or written in
NAND flash memory.  
The size of a page typically ranges from 4KB to 16 KB, depending on
the specific type of NAND flash memory.

#### Block

A block is a larger unit that consists of multiple pages.  
Block are the smallest unit that can be erased in NAND flash memory.  
The size of a block typically ranges from 128KB to 4MB, depending on
the memory of the memory architecture.  
A block usually contains 64 to 256 pages.  



## Redundant Array of Independent Disks (RAID)

### RAID 0

- 2 Disks
- Split in half and save into each disk
- Benefit
    - Fast
- Drawback
    - If lose 1 disk, the whole file system is gone due to the half of
    the data might be corrupted by the lost of another half.

### RAID 1

- 2 Disks
- Duplicate all data and save into both disks
- Benefit
    - Safe for your data when system corrupted
- Drawback
    - Has the same speed as the RAID 0

### RAID 5

- 4 Disks

### RAID 6

- 5 Disks


## Optical Memory


