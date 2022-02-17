package Queue;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import javafx.application.Application;
import javafx.scene.input.InputMethodTextRun;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jdk.internal.util.xml.impl.Parser;

import java.util.Scanner;
import java.util.Stack;

public class Program extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void InsertQueue(Queue queue)
    {
        String convert = Integer.toOctalString(10);
        queue.push(convert);
        convert = Integer.toOctalString(15);
        queue.push(convert);
        convert = Integer.toOctalString(8);
        queue.push(convert);
        convert = Integer.toOctalString(16);
        queue.push(convert);
    }
    public Stack<String> ToStack(Queue queue)
    {
        List.Node<String> node = queue.list.GetHead();
        Stack stack = new Stack<String>();
        while(node.next != null)
        {
            int temp = Integer.parseInt(node.Data);
            String convert =
                    Integer.toBinaryString(temp);
            temp = Integer.parseInt(convert, 2);
            if(temp < 200)
            {
                temp *= 2;
            }
            else if(temp > 200)
            {
                temp /= 2;
            }
            node.Data = Integer.toString(temp);
            stack.push(Integer.toString(temp));
            node = node.next;
        }
        return stack;
    }
    public void ShowStack(Stack stack)
    {
        System.out.println("~~Stack~~");
        for (int i = 0; i < stack.size(); ++i) {
                        System.out.println("\n\n" +  stack.pop());
        }
        System.out.println("\n\n" + stack.lastElement());
    }
    public void ShowQueue(Queue queue)
    {
        queue.Show();
    }
    @Override
    public void start(Stage primaryStage) {
        System.out.println("Enter capacity of queue please : ");
        Scanner sc = new Scanner(System.in);
        int capacity = Integer.parseInt(sc.nextLine());
        Queue<String> queue = new Queue<String>(capacity);
        InsertQueue(queue);
        ShowQueue(queue);
        Stack stack = ToStack(queue);
        ShowStack(stack);
    }
}
