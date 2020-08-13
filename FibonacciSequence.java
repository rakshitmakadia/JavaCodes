import java.util.*;
public class FibonacciSequence{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> fs = new ArrayList<Integer>();
    fs.add(1);
    fs.add(1);
    while(true){
      int temp = fs.get(fs.size()-2) + fs.get(fs.size()-1);
      if(temp<=n){
        fs.add(temp);
      }
      else{
        break;
      }
    }
    for(int i: fs){
      System.out.println(i);
    }
  }
}
