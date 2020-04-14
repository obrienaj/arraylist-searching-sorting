1. I was looking for a blue M&M in the line of M&Ms. In the random arrangement, I found it towards the end of the line, after checking around 6 other M&Ms. When I arranged them in rainbow order and used the BinarySearch algorithm, I had to check less M&Ms to see if they were blue before finding the blue one.

2. An efficient algorithm has to run less code to complete its job. Binary search is more efficient because it is guaranteed to find the desired item if it exists in only a fraction of the tries that it takes the search algorithm.

3.  i. Search: check each item, beginning with apple and ending with   
    watermelon, to see if it is "blueberry." Return -1.
    BinarySearch: check the middle term, "lime," to see if it is "blueberry." When it is not, compare "lime" and "blueberry" to decide that "blueberry" comes first alphabetically. Find the middle term of the list that goes from "apple" to "lemon" and compare it to "blueberry." Since "banana" is not "blueberry" and "blueberry" comes after "banana" alphebetically, find the middle term of the list that goes from "cherry" to "lemon." Since "cherry" is not "blueberry" and comes after "blueberry" alphabetically, the selected list length is now zero, so return -1.

    ii. Search: 11
    BinarySearch: 3

    iii. Search is still equal to the number of items in the list (1000) but BinarySearch only checks 9 items