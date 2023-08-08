public class Stack {
}
/*
           Stack -->  It is a data structure that follows to a particular order in which
                      the operations performed on it.

                      The order which stack is follows is LIFO.

           LIFO -->   Last in First out.
                      that means the element which is inserted last, comes out first.

           Operations -->  1. Push  --> to push the elements in the stack.
                           2. Pop   --> to remove the last element ( top element).
                           3. Peek  --> to take the value of the peek(top) element.

           Note  --> All those operations in stack are applied on the top element.

           Some real life examples :

           1.  Plates stacked over one another in Hotels.                          | plate3  |  stack of
                                                                                   | plate2  |   plates
           when we put another plate we can put it on the top (push).  ----->      | plate1  |
           we can remove a plate from the top everytime. (pop).                    |_________|

           2.  Books are stacked over one another on the table.
                                                                                   |  newBook | stack of
           when we put a new books on them, that is push in stack.     ----->      |  C.S     |  Books
           when we remove a book from the top, that is pop in stack.               |  math    |
                                                                                   |__________|
  Note --->   for a better experience use stack with Array list or linked list.
              time complexity is O(1) of the push, pop and peek normally.
 */
