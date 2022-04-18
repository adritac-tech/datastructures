# Queues 
* Reverse polish notation uses the operator at the end of the statement (so 4 + 2 would be 4 2 +)
* Linked lists are arrays of objects 
* Queues are created from objects in a linked list
* Since Queue is an interface you need to instantiate a concrete implementation of the interface in order to use it
* LinkedList is a pretty standard queue implementation
*   Elements in the queue are stored internally in a standard linked list data structure. 
*   This makes it fast to insert elements at the end (tail) of the list, and remove elements from the beginning (head) of the list
* PriorityQueue stores its elements internally according to their natural order (if they implement Comparable), or according to a Comparator passed to the PriorityQueue
* Functions: 
*   Adding
*   Removing 
*   Iterate
*   Take
* If any null operation is performed on BlockingQueues, NullPointerException is thrown.
* The Queues which are available in java.util package are Unbounded Queues.
* The Queues which are available in java.util.concurrent package are the Bounded Queues.
* All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively
* The Deques support element insertion and removal at both ends. 

# Sorts and Analysis 
* Bubble sort = sorts that swap adjacent elements 
*   We know that all elements are in order when we manage to do the whole iteration without swapping at all - then all elements we compared were in the desired order with their adjacent elements, and by extension, the whole array.
*   example: 

4 2 1 5 3: The first two elements are in the wrong order, so we swap them.
2 4 1 5 3: The second two elements are in the wrong order too, so we swap.
2 1 4 5 3: These two are in the right order, 4 < 5, so we leave them alone.
2 1 4 5 3: Another swap.
2 1 4 3 5: Here's the resulting array after one iteration.


* Insertion sorts are less effecient but they sort by doing two groups (sorted and unsorted)
*   Example: 
3 5 7 8 4 2 1 9 6: We take 4 and remember that that's what we need to insert. Since 8 > 4, we shift.
3 5 7 x 8 2 1 9 6: Where the value of x is not of crucial importance, since it will be overwritten immediately (either by 4 if it's its appropriate place or by 7 if we shift). Since 7 > 4, we shift.
3 5 x 7 8 2 1 9 6
3 x 5 7 8 2 1 9 6
3 4 5 7 8 2 1 9 6


* Merge sorting is dividing the total group in two and sorting each group and then continuing to divide
*   Process: 
Sort the left half of the array (recursively)
Sort the right half of the array (recursively)
Merge the solutions

## Sort Analysis 
* Merge sorts are best for efficiently getting through large sets of data
* This is probably because it uses big groups of data rather than sorting through individual elements 

# Week 0
* Programs are a combination of algorithms and data structures
* Paradigm: Approach or a methodology or a strategy to be followed for writing software applications
* Imperative Programming: Programming paradigm that uses statements that change a program's state
* Object Oriented Programming: Programming paradigm that relies on the concept of classes and objects

# Week 1

* Head refers to the front of the queue, tail refers to the end of the queue
* Heads and Tails change based on how many objects are in queue
* Building a stack reverses the order of a queue
* Circular refer to the first in first out idea, so that the queue links up in a ring

# Week 2
* Uses reverse polish notation which separates out operations from numbers and rearranges them
* Integers get turned into tokens (seem to be similar to objects) which are then moved around because of the reverse polish notation
* Need to use different testers (drivers) that simulate possible expressions 
* Define operators and create tokenizer

# Week 3
# Week 4
# Week 5
# Week 6
# Week 7
# Week 8
# Week 9
# Week 10
# Week 11
