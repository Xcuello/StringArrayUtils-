package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];

    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {


        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (String v : array) {

            if (value == v) {

                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String temp = "";

        for (int i = 0; i < array.length / 2; i++) {

            temp = array[i];

            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for (int i = 0; i < array.length; i++) {

            if (!array[i].equals(array[array.length - 1 - i])) {

                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String combo = "";

        for (int i = 0; i < array.length; i++){

            String temp = array[i].toLowerCase();
            String[] tempArray = temp.split(" ");

            for (int j = 0; j < tempArray.length; j++){
                combo += tempArray[j];
            }
        }
        String[] apart = combo.split("");
        String[] counter = new String[26];

        for (int i=0; i<apart.length; i++) { //z-z=0 ;  z-a=25 (26-26=0  ; 26-1=25)
            if (counter['z' - apart[i].charAt(0)] == null) {

                counter['z' - apart[i].charAt(0)] = apart[i];
            }
        }
        for (int i=0; i<26; i++){

            if (counter[i]==null){

                return false;
            }
        }
        return true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {

                count++;
            }
        }


        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        List<String> arrList = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {

            if (array[i] != valueToRemove) {

                arrList.add(array[i]);
            }
        }

        String[] stringArr = new String[arrList.size()];
        stringArr = arrList.toArray(stringArr);

        return stringArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> newArr = new ArrayList<String>();

        newArr.add(array[0]);
        String last = array[0];

        for (int i = 1; i < array.length; i++) {

            String nextWord = array[i];

            if(nextWord.equals(last)) {

                newArr.set(newArr.size()-1, newArr.get(newArr.size()-1));

            } else {

                newArr.add(nextWord);
                last = nextWord;
            }
        }

        return newArr.toArray(new String[newArr.size()-1]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        ArrayList<String> newArr = new ArrayList<String>();

        newArr.add(array[0]);
        String last = array[0];

        for (int i = 1; i < array.length; i++) {

            String nextWord = array[i];

            if(nextWord.equals(last)) {

                newArr.set(newArr.size()-1, newArr.get(newArr.size()-1)+nextWord);

            } else {

                newArr.add(nextWord);
                last = nextWord;
            }
        }
        return newArr.toArray(new String[newArr.size()-1]);
    }
}
