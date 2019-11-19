package blackbox.stack;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> arr;
    int top;

    Stack() {
        this.top=-1;
        if(this.arr != null)
            this.arr.clear();
    }

    void pushToStack(int element) {
        if(this.arr == null)
            this.arr = new ArrayList<>();
        this.arr.add(element);
        this.top++;
    }

    int popFromStack() {
        int topOfTheStack = this.arr.get(this.top);
        this.arr.remove(this.top);
        this.top--;

        return topOfTheStack;
    }

    int getTopIndex() {
        return this.top;
    }
}
