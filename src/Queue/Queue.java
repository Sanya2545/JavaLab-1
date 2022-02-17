package Queue;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import jdk.nashorn.internal.IntDeque;

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class Queue<T> implements IQueue<T>
{
    public int capacity = 0;
    List<T> list;

    public Queue(int capacity) {
        this.capacity = capacity;
        list = new List<T>();
    }
    @Override
    public void push(T item) {
        list.Insert(list, item);
    }
    public void Show(){
            if(this.list.GetHead() == null)
            {
                return;
            }
            else
            {
                List.Node<T> node;
                node = this.list.GetHead();
                while(node.next != null)
                {
                    System.out.println(node.Data);
                    node = node.next;
                }
                System.out.println(node.Data);
                return;
            }

    }
    /*public static int convertBinaryToDecimal(int binaryDigit) {
        int decimal = 0;
        int n = 0;
        int temp = 0;
        while (binaryDigit > 0) {
            temp = binaryDigit % 10;
            decimal += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / 10;
            n++;
        }
        return decimal;
    }*/

    @Override
    public T pop() {
        return list.DeleteAndReturnHead().Data;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}

