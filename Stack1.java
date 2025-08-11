import java.util.Stack;

public class Stack1{
    public static void main(String[] args){
        /*
         * stack = LIFO data structure, last in first out
         * it stores object into a sort of "vertical tower"
         * push() to add to the top
         * pop() to remove from the top
         * 
         * USES OF STACKS
         * 1.Undo/redo features in text editors
         * 2.Move back/ forward through browser history
         * 3.Backtracking algorithms (maze, file directories)
         * 4.calling functions (call stack)
        */

        Stack<String> stack = new Stack<>();
        //System.out.println(stack.empty());

        stack.push("minecraft");//we are adding to the stack
        stack.push("Skyrim");
        stack.push("doom");
        stack.push("borderlands");
        stack.push("ffvii");
        //stack.pop(); //we don't need to put anything in the brackets because itll automatically remove what's on top
        String myFavorite = stack.pop();


        System.out.println(stack);
        System.out.println("my favourite game is:" + myFavorite);
        System.out.println("The top most element now is: " + stack.peek());
        System.out.println(stack.search("borderlands")); //the first item in a stack is index 1
        //if search does not find the element it will return -1

        



    }
}