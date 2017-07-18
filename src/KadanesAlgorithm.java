/**
 * Created by sumon.chatterjee on 17/07/17.
 */
public class KadanesAlgorithm {

// find the maximum sum in the sub array
    private int findMaxSumInASubArray(int a[]){

        int max_so_far,max_ending;
        max_so_far=a[0];
        max_ending=0;


        int length =  a.length;
        for(int i=0;i<length;i++){

            max_ending = max_ending + a[i];
            if(max_so_far < max_ending){
                max_so_far = max_ending ;
            }

            if(max_ending < 0){

                max_ending  = 0 ;
            }


        }

        return max_so_far;


    }


    //find starting and ending index of the max sub array
    private void findIndexes(int[] a){

        int max_so_far,max_ending;
        max_so_far=a[0];
        max_ending=0;

        int s=0,end=0,start=0;


        int length =  a.length;
        for(int i=0;i<length;i++){

            max_ending = max_ending + a[i];
            if(max_so_far < max_ending){
                max_so_far = max_ending ;
                start=s;
                end=i;

            }

            if(max_ending < 0){

                max_ending  = 0 ;
                s=i+1;
            }


        }


        System.out.println("index of max sub array is " + start + "---" +end);

    }



    public static void main(String[] args){


        int a[] = {3,-2,9,10,-5 ,8,-5};
        KadanesAlgorithm algorithm =  new KadanesAlgorithm();
        int sum = algorithm.findMaxSumInASubArray(a);

        System.out.println("maximum sum is "+ sum +"");

        algorithm.findIndexes(a);
    }

}
