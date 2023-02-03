import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median;

        List<Double> doubleList = new ArrayList<>();

        //Concat both arrays into one list of Double numbers
        for(int numInNums1 : nums1) {
            doubleList.add((double) numInNums1);
        }
        for(int numInNums2 : nums2) {
            doubleList.add((double) numInNums2);
        }

        //Sort numbers of my list in ascending order
        Collections.sort(doubleList);

        //Validate if the list size is even or odd, if its even, I must get the two numbers in the middle
        //of the list, otherwise I must get the middle number.

        if(doubleList.size() % 2 == 0) {
           median = (doubleList.get(doubleList.size() / 2 - 1) + doubleList.get(doubleList.size() / 2)) / 2;
        }
        else median = doubleList.get(doubleList.size() / 2);

        return median;
    }
}