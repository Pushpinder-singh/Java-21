package Codility;

public class BinaryGap {

public static int  solution(int N){
           String binaryNum = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;
        Boolean counting = false;
        System.out.println("binaryNum: "+binaryNum);

        for(char c : binaryNum.toCharArray()){

            if(c == '1'){
                if(counting){
                    maxGap = Math.max(maxGap, currentGap);
                }
                counting = true;
                currentGap = 0;
            } else if (counting) {
                currentGap++;
            }
        
    }
    return maxGap;
    }

    public static void main(String[] args) {
     int biniaryGap = solution(1041);
     System.out.println("Biniary Gap: "+biniaryGap);
    }
    
}
