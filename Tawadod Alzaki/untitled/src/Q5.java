import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        int x [] ={0, 1, 2, 3, 4};
    print(x);
    input(x);
    print(x);

    }
    public static void print(int arr[]){}

    public static void input(int arr[]){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
    }

}
