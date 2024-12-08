# Java ArithmeticException: Division by Zero Bug

This repository demonstrates a common Java bug: an `ArithmeticException` caused by division by zero. The `BuggyDivision.java` file contains the buggy code, while `FixedDivision.java` provides a solution.

## Bug Description

The code attempts to divide an integer by zero, which is undefined and results in an `ArithmeticException`.  The program crashes without gracefully handling the exception.

## Solution

The solution involves checking for a zero divisor before performing the division. If the divisor is zero, an alternative action is taken (e.g., printing an error message or returning a default value) to prevent the exception.

## How to reproduce

1. Clone this repository.
2. Compile and run `BuggyDivision.java`.  Observe the `ArithmeticException`.
3. Compile and run `FixedDivision.java`.  Observe the program's successful execution without the exception.