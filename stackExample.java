public class stackExample{
    public static void main(string[] args){
    stack<integer> stack=new stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    while(!stack.isEmpty()){
        System.err.println(stack.pop());
    }
}
}
