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
