import java.util.*;
class StockSpanner {
    Stack<int[]> stk ;
    public StockSpanner() {
        stk  = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        while(!stk.isEmpty() && stk.peek()[0] <= price)
        {
            count += stk.pop()[1];
        }
        stk.push(new int[]{price , count});
        return count;
    }
}
public class Stock_span {
    public static void main(String[] args) {
    StockSpanner obj = new StockSpanner();

    int[] prices = {100, 80, 60, 70, 60, 75, 85};

    for (int price : prices) {
        int result = obj.next(price);
        System.out.print(result + " ");
    }
}
}
