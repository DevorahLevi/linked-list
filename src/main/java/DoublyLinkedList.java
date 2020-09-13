/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList<T>
{
    List<T> list = new ArrayList<T>();

    public void push(T x)
    {
        list.add(x);
    }

    public T pop()
    {
        return remove(list.size() - 1);
    }

    public T shift()
    {
        return remove(0);
    }

    private T remove(int index)
    {
        return list.remove(index);
    }

    public void unshift(T x)
    {
        list.add(0, x);
    }
}
