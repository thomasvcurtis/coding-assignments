/*
Thomas Curtis
Intro. Software Security
Homework 5
*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>
#include "queueManager.c"

int main(int argc, const char * argv[]) {

    printf("Welcome. Just a skeleton, NO meat\n\n");

    QUEUE *node;
    QUEUE** queuepoiner = &node;
    int a = 5;
    int* b = &a;

    queueManage(queuepoiner,1,5); //create queue with size of 5

    addToQueue(node, 1);   // add node to queue with a '1' in data
    addToQueue(node, 2);   // add node to queue with a '2' in data
    addToQueue(node, 3);   // add node to queue with a '3' in data
    addToQueue(node, 4);   // add node to queue with a '4' in data
    removeFromQueue(node, b); // removes node

    for ( int i = 0; i < node->size; i++ ) {
        printf( "item at position %d is %d\n", i, node->que[ i ] );
    }

  
return 0;

}

/*
Item 1
    queueManage function creates or deletes a queue. It function takes 
    in 3 parameters, pointer to the queue, a flag for creation or deletion,
    and size, respective. When the function is give a 1, it creates a queue.
    The function allocates memory using 'malloc()'. When the function is given
    a 0 as a flag it deletes the queue using pointers and 'free()' 

    addToQueue function adds a node to the queue data structure. It takes in
    2 parameters, the pointer to the queue and a int for the data in the node. 
    The pointer adds the node at the end of the queue and then increase the 
    pointer count by 1

    removeFromQueue function removes a node from the queue data structure.
    It takes in 2 parameters, the pointer to the queue and a int for 
    the data in the node. The function removes the pointer and the subtracts
    1 from the pointer count 
*/

/*
Item 2

    Vulnerability 1: all of the functions does not have any error checking and 
    safeguards. For queueMange function the function is able to delete delete
    memory which it does not has access to because there is no checking that a 
    queue is created, this will lead to a segmentation fault. addToQueue and
    removeFromQueue both have the same vulnerability that if call they could access
    memory they are not allowed to 

    Vulnerability 2: Not using the standard library for queue data structure. C/C++ has a 
    standard library that has the queue data structure that has been well tested and vetting my
    software security specialist. Implementing the data structure from with by 'hand' with 
    primitives can lead to vulnerabilities because key security aspects that the person did not 
    implement.  

    Vulnerability 3: removeFromQueue does not deallocate memory. The queueManage function uses 
    malloc to allocate memory for the queue data structure. The removeFromQueue does not deallocate
    memory, that would would lead to mismanagement of memory. 
*/



/*
Item 4
To fix the vulnerability of when the number of calls of 'addToQueue' is greater than the size of
the queue (which is given by the 3 parameter of the 'manageQueue' function) is to had a section of
code that checks the size of the queue. If the number of function calls is greater than the size the 
code should not execute.
*/
