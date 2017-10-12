# PART1_PrimitiveArrays
To store objects of the same type in an indexed list of set length, we use arrays.

It's common in programming to group our data. We group characters in Strings, methods
in classes, and classes in modules. We can group any data of the same type together
effeciently using primitive arrays. You simply use the format
```
type[] name = new type[length];
```
of whatever type of data you want to store, what you want to name this collection of data -
called an array - and specify how many elements it contains. Note: primitive arrays are of
a fixed length, so once you create them using a specified length, you cannot change that length.
Also, if you try to reference an index out of the bounds of the array, you will throw an
IndexOutOfBoundsException. Arrays with variable length will be covered in PART2 of our Java journey.

An array can also store other arrays. These arrays are called *multidimensional* arrays, and an array
that stores other arrays that store some type of data would be called a two-dimensional array. Careful:
while the ".length" property of the multidimensional array refers to the length of itself, it 
does not have any relation with the ".length" property of the arrays it contains. To get this property,
you must reference a specific array in multidimensional_array, like with the statement
```
int length_of_contained_array = multidimensional_array[0].length;
```

We commonly iterate through arrays with two loops, the *for* loop, and the *for-each* loop. These loops
are described in more detail in the [Control Statements](https://github.com/TheGreyhounds/PART1_ControlStatements) repository,
but essentially increment through each element of the array, allowing the programmer to manipulate the elements
how he or she chooses.

The key takeaway from this repository is that primitive arrays are one of the principle ways we group our
data, can contain other arrays, and are fixed-length, meaning that you cannot change the size of a primitive
array once you have initialized it.