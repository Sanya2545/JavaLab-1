package Stack;

public class STACK_Array {
    private int mSize = 0;
    private double[] stackArray;
    private int top;
    public STACK_Array(int m)
    {
            this.mSize = m;
            stackArray = new double[mSize];
            top = -1;
    }
    STACK_Array(double [] array)
    {
        this.stackArray = array;
    }
    public void Push(double element) {// It's not working cuz of Out of fucking bounds exception


        if (!this.IsFull()) {
            ++top;
            stackArray[top] = element;

        }
        else
        {
            System.out.println("Stack is full !");
        }

    }
    public double Remove()
    {
        double [] NewStack = new double[mSize - 1];
        for(int i = 0; i < NewStack.length; ++i)
        {
            NewStack[i] = stackArray[i];
        }
        stackArray = NewStack;
        --top;
        return stackArray[top];
    }
    public int GetLength()
    {
        return mSize;
    }
    public String ToString()
    {

        String s = "[";
        for(int i =0; i < stackArray.length; ++i)
        {
            if(i == stackArray.length - 1)
            {
                s+=stackArray[i] + " ]";
            }
            else
            {
                s += stackArray[i] + ", ";
            }

        }
            return s;
    }
    public double ReadTop()
    {
        return stackArray[top];
    }
    public boolean IsFull()
    {
        return (top == mSize-1);
    }
    public boolean IsEmpty(){return (top == -1);}
}
