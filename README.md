# Dwai's Mirror Balance

### Problem Statement

Dwai is designing a contest problem around numbers he calls mirror-balanced: numbers whose left-half digit sum equals their right-half digit sum. Formally, for a positive integer with d digits:

If d is even (d = 2m), compare the first m digits against the last m digits. If d is odd (d = 2m+1), ignore the middle digit and compare the first m against the last m. If d = 1, the number is trivially mirror-balanced.

Examples: 1221 ✓ (3 = 3), 909 ✓ (9 = 9), 12345 ✗ (3 ≠ 9), 1000 ✗ (1 ≠ 0).

Given A and B, count the mirror-balanced integers in [A,B], modulo 10⁹ + 7.

### Input Format
- A single line with two integers A and B.

### Constraints
- 1 ≤ A, B ≤ 10¹⁸

### Output Format
- A single integer — the count modulo 10⁹ + 7.

### Sample Input 0
```
1 100
```
### Sample Output 0
```
18
```
### Explanation 0
All 9 single-digit numbers qualify, plus 11, 22, …, 99 - giving 18.

### Sample Input 1
```
100 999
```
### Sample Output 1
```
90
```
### Explanation 1
For a three-digit number, Dwai's rule discards the middle digit and compares the first and last digits. So the number is balanced exactly when its first and last digits are equal. The first digit has 9 choices (1–9), the middle is free (10 choices), and the last is forced — giving 9 × 10 = 90.

### Sample Input 2
```
1221 1221
```
### Sample Output 2
```
1
```
