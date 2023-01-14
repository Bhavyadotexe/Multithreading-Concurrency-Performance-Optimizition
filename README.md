# Multithreading-Concurrency-Performance-Optimizition

# Case Study:


Design a secure Vault where I am planing to store my money. 

I want to know how long will it takes to a Hacker to break into the vault bu guessing my password.

We will have few Hacker Threads, trying to brute force my code concurrently.

In addition to that we will have a police thread, this thread will come to our rescue by counting down 10 secs.

And if the Hacker havent brocken into the vault by then, and ran away with the money, the policyman will arrest them.

While counting down the police thread is going to show us the progress of its arrival.
