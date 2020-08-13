import java.util.*;
public class PrimeFactorization{
  public static ArrayList<Integer> primeFactors(int n){
    ArrayList<Integer> factors = new ArrayList<Integer>();
    for(int i=2;i<=n;i++){
      if(isPrime(i) && (n%i == 0)){
        factors.add(i);
      }
    }
    return factors;
  }
  public static boolean isPrime(int n){
    if(n==2){
      return true;
    }
    for(int i=3; i<n/2; i++){
      if(n%i == 0){
        return false;
      }
    }
    return true;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> factors = primeFactors(n);
    for(int i: factors){
      System.out.println(i);
    }
  }
}
