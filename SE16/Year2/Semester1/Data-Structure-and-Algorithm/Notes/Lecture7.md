# Recursion

Why is recursion so powerful?

- Because we break big problem into same problem but smaller data size.
- It is simple to read. We let the recursion solve the problem.

## Master Theorem

### Official

### Cookbook (Simpler Way)

$$T(n) = a T (\frac{n}{b}) + O(n^{d}) \forall a, b, c, d ; a > 0, b > 1, c = log_{b}a, d \ge 0$$

$$
T(n) = 
\begin{cases}
O(n^{d}) &; d > c \\
O(n^{d} log(n)) &; d = c \\
O(n^{c}) &; d < c \\
\end{cases}
$$

> [!NOTE]
> Limitations of Master Theorem  
> - $T(n) = 2T(n - 1) \rightarrow$ Size of $n$ does not scale as a ratio
> - $T(n) = 3T(\frac{n}{4}) + 6T(\frac{n}{8}) \rightarrow$ Summation of different sizes
> - $T(n) = 2nT(\frac{n}{3}) \rightarrow$ Number of subproblem is not constant


## Single/Multiple Recursion

> Tail Recursion  
> is a recursion where the recursive call is at the very end of the method.

- All recursion can be written in code using loop(s) and stack(s).
    - Tail recursion can be rewrite without using stack.

## Memoization

If the recursive calls are being called more than once, adding records
of the call results from each given inputs improves time complexity.  

> [!TIP]
> In a nutshell: It's literally Recursion with Cache.

## Dynamic Programming

> [!IMPORTANT]
> Memoization $\ne$ Dynamic Programming  

### Buttom-Up Dynamic Programming

- Find the way to fill the cache
- There are also ways to optimize code by disregarding the unused variables and safe more memory and time.
