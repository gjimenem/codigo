/* Queue.java */

package list;

public interface Queue {

  /** 
   *  size() returns the size of this Queue.
   *  @return the size of this Queue.
   *  Performance:  runs in O(1) time.
   **/
  public int size();

  /**
   *  isEmpty() returns true if this Queue is empty, false otherwise.
   *  @return true if this Queue is empty, false otherwise. 
   *  Performance:  runs in O(1) time.
   **/
  public boolean isEmpty();

  /**
   *  enqueue() inserts an object at the end of the Queue.
   *  @param element the element to be enqueued.
   **/
  public void enqueue(Object element);

  /**
   *  dequeue() removes and returns the object at the front of the Queue.
   *  @return the element dequeued.
   *  @throws a QueueEmptyException if the Queue is empty.
   **/
  public Object dequeue() throws QueueEmptyException;

  /**
   *  dequeue() returns the object at the front of the Queue.
   *  @return the element at the front of the Queue.
   *  @throws a QueueEmptyException if the Queue is empty.
   **/
  public Object front() throws QueueEmptyException;

}