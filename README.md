# InterviewQuestions
Repository for solutions to interview questions

Purpose of this file is to provide an explanation and directions to run this project euler solution set

# Steps to execute this project
1) Verify the permissions on run.sh or make it executable using chmod +x run.sh
2) run the project using ./run.sh

# Sample of the output

25164150
Problem 6 took 0 milliseconds
1366
Problem 16 took 3 milliseconds
906609
Problem 4 took 72 milliseconds

# Why I chose the problems

The problems I chose were a combination of two or more problems, hence an opportunity to solve the problems using a multi step solution

# Description of the process

1) Problem 4 - This problem is a combination of two problems, hence suggested a two step approach -
i) Find all possible products of 3 digit numbers
ii) if the product is a palindromic number, add to a treeset
iii) Get the last number in the tree set since it would be ordered in ascending order

Time taken: 20 mins

2) Problem 6 - The approach assumes sum of squares and square sum are within the range and calculates the difference

Time Taken: 12 mins

3) Problem 14 - The solution of this problem computes the total value of the 1000th power of 2, since this is a value out of the range of primitives, 
stores it in a biginteger, each digit of the large number is added together using mod 10 and dividing the residual of the number by 10 until the residual number is not 0

Time taken: 25-30 mins 
