package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    Integer[] results = this.array;
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
      //  return Arrays.stream(array).filter(ele-> numberOfOccurances(ele) < maxNumberOfDuplications).toArray(Integer[]::new);


        Integer[] results = new Integer[0];

        for(Integer ele: array){
            if(numberOfOccurances(ele) < maxNumberOfDuplications){
                results = Arrays.copyOf(results, results.length +1);
                results[results.length-1] = ele;
            }
        }
        return results;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

      //   return Arrays.stream(array).filter(ele-> numberOfOccurances(ele) != exactNumberOfDuplications).toArray(Integer[]::new);


        Integer[] results = new Integer[0];

        for(Integer ele: array){
            if(numberOfOccurances(ele) != exactNumberOfDuplications){
                results = Arrays.copyOf(results, results.length +1);
                results[results.length-1] = ele;
            }
        }
        return results;
    }

    public int numberOfOccurances(int num){
        int count = 0;
        for(Integer ele: array){
            if(ele.equals(num)){
                count++;
            }
        }
        return count;
    }
}
