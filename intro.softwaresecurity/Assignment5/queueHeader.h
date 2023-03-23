/*
* line Manager Header file
*/
/*
* the queue structure
*/
typedef struct queue {
int *que; /* the actual array of queue elements */
int head; /* head index in que of the queue */
int count; /* number of elements in queue */
int size; /* max number of elements in queue */
} QUEUE;
/*
* the library functions
*/
void queueManage(QUEUE **, int, int); /* create or delete a queue */
void addToQueue(QUEUE *, int); /* add to queue */
void removeFromQueue(QUEUE *, int *); /* remove from queue */