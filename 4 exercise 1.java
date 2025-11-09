// Chapter 4 Exercise 1
// Find the error in each of the following code segments, and explain how to correct it.

// a)
// Error: There is a semicolon (;) after the while condition, which makes it an empty loop.
// Also, there is an extra closing brace (}) without an opening brace.
// Correction: Remove the semicolon and the extra brace.

// b)
// Error: The loop uses a floating-point variable and checks for equality (k != 1.0).
// Due to floating-point precision, this can cause an infinite loop.
// Correction: Use < instead of !=, or use an integer counter.

// c)
// Error: Missing 'break' statement after case 1, which causes fall-through to case 2.
// Correction: Add a 'break;' after case 1.

// d)
// Error: The condition (n < 10) causes the loop to stop at 9.
// Correction: Change the condition to (n <= 10) to print 1 through 10.
