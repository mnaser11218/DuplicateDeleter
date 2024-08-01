package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] results = new String[0];

      // return Arrays.stream(array).filter(ele-> numberOfOccurances(ele) < maxNumberOfDuplications).toArray(String[]::new);


        for(String ele: array){
            if(numberOfOccurances(ele) < maxNumberOfDuplications){
                results = Arrays.copyOf(results, results.length +1);
                results[results.length-1] = ele;
            }
        }
        return results;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] results = new String[0];

         // return Arrays.stream(array).filter(ele-> numberOfOccurances(ele) != exactNumberOfDuplications).toArray(String[]::new);
        for(String ele: array){
            if(numberOfOccurances(ele) != exactNumberOfDuplications){
                results = Arrays.copyOf(results, results.length +1);
                results[results.length-1] = ele;
            }
        }
        return results;
    }


    public int numberOfOccurances(String e){

      //  return Arrays.stream(array).filter(ele-> ele.equals(e)).toArray(String[]::new ).length;
        int count = 0;
        for(String ele: array){
            if(ele.equals(e)){
                count++;
            }
        }
        return count;
    }
}
