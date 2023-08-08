public class Queue {
}
/*
         Queue -->  It is a linear data structure which is open at the both ends
                    and some operations are performed on it.
                    In general queue means a straight line.
                    It is based on the FIFO.

         FIFO -->  First In First Out.
         Means the element inserted first, that comes out first.

         In queue all insertion made at one end and all remove or deletion made at
         the other end. which element pushed in queue first the operation first
         performed on that.

                         ------|------|------|------|------|--------
    delete ----->      front   |   2  |  3   |  4   |  5   |    rear      <--------  add from rear
    from front           ------|------|------|------|------|-------

          Operations in queue :
          1. Enqueue (add) --> adding the elements
          2. Dequeue (remove) --> remove the elements.
          3. Front (peek) --> value of the front element.
          4. isEmpty -->  Queue is Empty or not.
          5. isFull  -->  Queue is Full or not.

         Real Life Example :

         A line at the front of movie ticket counter, person who comes first take ticket first
         and out from line also first.
         If you person add in the line it will add from the end of the line.
         Adding a person from the end is Enqueue
         After taking the ticket person comes out of the line is dequeue.

 */