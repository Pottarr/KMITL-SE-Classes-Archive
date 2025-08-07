# Chapter 2: Time Complexity

## Characteristics of good algorithm and data structure
- Correctness
- Efficiency
    - Time
    - Space
- Readability

Atomicity -> Any transaction cannot be divided  

Empirical Analysis -> Analyze whether the algorithm is correct or not  

Asymptotic Analysis -> Analyze whether the algorithm is correct or
not FROM THE DESIGN PHASE  

Why sohuld we care about large `n`?

- It grows very fast.
- The growth will fall into a constant.

> [!IMPORTANT] Comparison based sorting algorithms cannot go faster than `O(nlog(n))`.

> [!WARNING] The problem is `O(g(n))` is too vague.

Why it is validate to eliminate the constant in `f(n)` just to get `g(n)` for `O(g(n))`?

Answer: Beacause if it reach infinity the constant will be worthless.

$log(n)$ VS $\sqrt{n}$?

Answer: $\sqrt{n}$ is slower.
