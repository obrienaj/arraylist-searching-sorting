SEARCHING

1. I was looking for a blue M&M in the line of M&Ms. In the random arrangement, I found it towards the end of the line, after checking around 6 other M&Ms. When I arranged them in rainbow order and used the BinarySearch algorithm, I had to check less M&Ms to see if they were blue before finding the blue one.

2. An efficient algorithm has to run less code to complete its job. Binary search is more efficient because it is guaranteed to find the desired item if it exists in only a fraction of the tries that it takes the search algorithm.

3.  i. Search: check each item, beginning with apple and ending with   
    watermelon, to see if it is "blueberry." Return -1.
    BinarySearch: check the middle term, "lime," to see if it is "blueberry." When it is not, compare "lime" and "blueberry" to decide that "blueberry" comes first alphabetically. Find the middle term of the list that goes from "apple" to "lemon" and compare it to "blueberry." Since "banana" is not "blueberry" and "blueberry" comes after "banana" alphebetically, find the middle term of the list that goes from "cherry" to "lemon." Since "cherry" is not "blueberry" and comes after "blueberry" alphabetically, the selected list length is now zero, so return -1.

    ii. Search: 11
    BinarySearch: 3

    iii. Search is still equal to the number of items in the list (1000) but BinarySearch only checks 9 items


SORTING

1.  I used paper scraps ("cards") numbered 1-8. The SelectionSort only required one pass through. It took the total number of items minus one moves to have it in order. However, I had to scan through each of the cards to find the one I was looking for for each swap since it was at an unknown, random index.
The InsertionSort also only required one pass through. Unlike the SelectionSort, it never required me to scan through all of the cards in order: I always knew the indices of the cards I was swapping. However, some cards had to be moved several times to land in the correct position.
The BubbleSort was similar to the InsertionSort in that the indices of the cards I swapped were known and adjacent. However, I ended up shifting cards great distances to the right instead of to the left, and cards that needed to be moved a great distance to the left had to be revisited several times in several different passes through the list.

2.  Selection
    i. 55 comparisons are needed to find the nth smallest item
    ii. Still 55
    iii. 55 when n = 10, or (n^2 + n) / 2

    Insertion
    i. 9
    ii. 45
    iii. 25ish for 10, 250/2500 for 100/1000

    Bubble
    i. 9
    ii. 28
    iii. 15ish for 10, 150/1500 for 100/1000

3. With the normal search, each item would be checked to the search. However, it would only take as many comparisons as there are items in the list. In order to prepare the list for the binary search, the items must be compared to each other a greater number of times than there are items, so it is perhaps more efficient to use the basic search algorithm.