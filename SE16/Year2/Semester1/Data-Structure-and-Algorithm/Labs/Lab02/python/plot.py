import matplotlib.pyplot as plt
# Sample input sizes
input_sizes = [100_000, 200_000, 300_000, 400_000, 500_000, 600_000, 700_000,
800_000, 900_000, 1_000_000]
# Sample runtimes in milliseconds (replace with real data)
runtime_A = [296, 1100, 2384, 4149, 6374, 9037, 12183, 15779, 20002, 24193]
# O(n)
runtime_B = [6, 12, 17, 25, 34, 44, 54, 65, 77, 89]
# O(n log n)
runtime_C = [2, 5, 6, 8, 12, 16, 19, 23, 27, 31]
# O(n^2)
#
#
#
# Plotting
plt.figure(figsize=(10, 6))
# plt.plot(input_sizes, runtime_A, marker='o', label='Algorithm A (IsPrime0) (O(n))')
plt.plot(input_sizes, runtime_B, marker='s', label='Algorithm B (IsPrime1) (O(n log n))')
plt.plot(input_sizes, runtime_C, marker='^', label='Algorithm C (IsPrime2) (O(n²))')
plt.title('Runtime Comparison of IsPrime1 and IsPrime2')
plt.xlabel('Input Size (n)')
plt.ylabel('Runtime (ms)')
plt.grid(True)
plt.legend()
plt.tight_layout()
plt.savefig('IsPrime1vsIsPrime2.png')
# plt.show()
