import java.util.Arrays;

public class MinAgeDifference {
    private static int calculateMinDifference(){
        int[] ages ={4, 2, 14, 5, 7, 17, 22, 7, 19, 50, 18, 9 };

        Arrays.sort(ages); //complexity: O(nlog(n))
        System.out.println("Age list after sorting : " + Arrays.toString(ages));

        int l = ages.length;
        //initialize minDifference with a big integer value
        int minDifference = Integer.MAX_VALUE;

        int i = 0;
        //complexity: O(n))
        while( i<l-1){
            int diff = Math.abs(ages[i] - ages[i+1]);
            if(diff == 0) return diff;
            else if(diff<minDifference) {
                minDifference = diff;
            }
            i++;
        }
        return minDifference;
    }


    public static void main(String[] args) {
        int minDifference = calculateMinDifference();
        System.out.println("the minimum difference between ages = {} " + minDifference);

        // the complexity of the algorithm is O(nlog(n))
    }
}
