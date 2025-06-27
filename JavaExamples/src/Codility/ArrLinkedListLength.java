package Codility;

public class ArrLinkedListLength {

    public static int solution(int a[]){

        int count = 0;
        int index = 0;

        while(index != -4) {
            count++;
            index = a[index];
        }
        return count;

    }

    public static void main(String[] args) {
        int A[] = {1,2,-4,6,1};
        int len = solution(A);
    System.out.println("Lenght of Linked List is :;"+len);
    }
}
