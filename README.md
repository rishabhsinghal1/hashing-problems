# hashing-problems

Problem - 1:

Problem name - The Great Kingdom’s Divisibility Challenge

In the Great Kingdom of Numerica, the wise King Arithmos loves challenges related to numbers. To entertain his subjects and promote mathematical knowledge, he devised an intriguing problem and announced a grand prize for the one who could solve it.

Problem Description - 
The Kingdom is represented by two magical scrolls. The first scroll, Scroll A, contains a list of sacred numbers. The second scroll, Scroll B, contains a list of powerful divisors. The King has challenged his subjects to determine how many numbers in Scroll A are divisible by each number in Scroll B.

The Quest
Alice, a brilliant mathematician, and her friend Bob, an avid coder, take up the challenge. To win the grand prize, they need to create a function that returns an array where each element indicates the count of numbers in Scroll A that are divisible by the respective element in Scroll B.

Your Task
Help Alice and Bob by implementing a function that solves the King's challenge efficiently. The function should be optimized to handle large lists of numbers and divisors.

Input
Two integer arrays:
a (Scroll A): Contains the sacred numbers.
b (Scroll B): Contains the powerful divisors.

Output
An array of the same size as b where the i-th index contains the number of integers in a that are divisible by b[i].

Constraints
The length of array a is between 1 and 10^5.
The length of array b is between 1 and 100.
Each element in array a and b is a positive integer between 1 and 10^9.


TEST CASES:

Test Case 1: Minimum Input Size
Scroll A: {1}
Scroll B: {1}
Expected Output: {1}

Test Case 2: No Common Divisors
Scroll A: {5, 7, 11, 13, 17}
Scroll B: {2, 3}
Expected Output: {0, 0}

Test Case 3: All Elements are Divisors
Scroll A: {6, 12, 18, 24, 30}
Scroll B: {3}
Expected Output: {5}

Test Case 4: Mixed Divisors
Scroll A: {10, 15, 20, 25, 30, 35, 40, 45, 50}
Scroll B: {5, 10}
Expected Output: {9, 5}

Test Case 5: Large Values
Scroll A: {1000000000, 2000000000, 3000000000, 4000000000, 5000000000}
Scroll B: {1000000000}
Expected Output: {5}

Test Case 6: Large Input Size
Scroll A: [1, 2, 3, ..., 100000] (all numbers from 1 to 100000)
Scroll B: {2, 5, 10}
Expected Output: {50000, 20000, 10000}

Test Case 7: Multiple Divisors with Common Factors
Scroll A: {30, 60, 90, 120, 150}
Scroll B: {2, 3, 5}
Expected Output: {5, 5, 5}

Test Case 8: Elements of Scroll A are Powers of Two
Scroll A: {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}
Scroll B: {2, 4, 8, 16}
Expected Output: {10, 9, 8, 7}

Test Case 9: Single Element in Scroll B
Scroll A: {10, 20, 30, 40, 50}
Scroll B: {10}
Expected Output: {5}

Test Case 10: Large Scroll A with Primes in Scroll B
Scroll A: [1, 2, 3, ..., 100000] (all numbers from 1 to 100000)
Scroll B: {101, 103, 107}
Expected Output: {990, 970, 936}

----------------------------------------------------------------------------------------------------------------------------------------------------------

Problem - 2:

Problem Statement

You have an array of integers that is the result of several "Copy-Paste" operations. A "Copy-Paste" operation allows you to copy any subarray (contiguous sequence) of the array and paste it after any position in the array. Given the final array, determine the smallest possible original array that could have resulted in the given array using these operations.

Input
The first line contains an integer T representing the number of test cases. Each test case consists of two lines:

The first line contains an integer 𝑁, the length of the array.

The second line contains 𝑁 space-separated integers representing the array.

Output

For each test case, output the length of the smallest possible original array.

Example 1: 

input: 

N = 5
array = [1,1,1,1,1]

output: 1

Example 2:

input:

N = 5
array = [1,2,3,1,2]

output: 3


TESTCASES

input
5
1 2 3 4 5
output
5

input
6
1 2 3 1 2 3
output
3

input
10
3 1 4 1 5 9 2 6 5 3
output
8

input 
10
8 8 8 8 8 8 8 8 8 8
output
1
