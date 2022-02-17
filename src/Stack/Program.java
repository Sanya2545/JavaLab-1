package Stack;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class Program extends Application {


    public static void main(String[] args) {
        launch(args);
    }
    public STACK_Array CreateStack()
    {
        System.out.println("Creating Stack ...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Set size of stack : ");
        int size = Integer.parseInt(sc.nextLine());
        STACK_Array stack = new STACK_Array(size);
        for(int i = 0; i < stack.GetLength(); ++i)
        {
            System.out.println("Set value which will be added to stack : ");
            double value = Integer.parseInt(sc.nextLine());
            stack.Push(value);
        }
        return stack;
    }
    public void ShowStack(STACK_Array stack)
    {
        System.out.println(stack.ToString());
    }
    public void DeleteElementsFromStack(STACK_Array stack)
    {
        stack.Remove();
    }
    @Override
    public void start(Stage primaryStage) {
        STACK_Array stack;
        stack = CreateStack();
        ShowStack(stack);
        System.out.println("Deleting element from stack !!!");
        DeleteElementsFromStack(stack);
        ShowStack(stack);
    }
}
