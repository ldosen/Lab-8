## _Try using a  `TreeMap`  instead of a  `HashMap`. Does this make any difference?_
No, the program runs identically to when a `HashMap` is used. This is due to the fact that both classes implement the `Map` interface and thus, have many of the same methods.
## _What happens if you invoke  `countWords`  multiple times for different String iterators?_
If I am understanding this question correctly, invoking`countWords` on different String iterators using the same fixture will add the entries of both iterators to the  same map that is associated with the fixture. If the same word exists in both iterators, calling `countWords` again will increment the number of times that word has occurred. 
## _What crucial role does the Iterator abstraction play in making  `WordCounter`  testable?_
Without the iterator, we would have no way to add the words to the Map. Sure, we could add an entire collection to the Map using the `addAll` method, but there would still have to be some sort of iteration over the collection to check for duplicate entries and increment them. With the Iterator, we can create any kind of collection we want (one with duplicates, etc.) and create an iterator from it. Since the iterator progresses one entry at a time, there's no need to worry about duplicates as that will be handled by the `put` method for the `Map` in the `countWords` body.
## Word totals from _Les Misérables_
the=33245
of=17985
and=12827
a=12434
to=12425
in=9371
was=7785
that=6591
he=6202
his=5529
