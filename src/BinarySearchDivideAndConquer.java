/**
 * This algorithm is a Divide and Conquer implementation of Binary Search.
 * Base case is when the lowIndex is equal to highIndex
 * or when lowIndex is greater than highIndex (when target is not in the array).
 * Recursive case is when the function calls itself to apply the same algorithm on constricted array range.
 */

class BinarySearchDivideAndConquer {
    public static void main(String[] args) {
        int[] myArray = {4,5,6,7,8,9};
        int foundIndex = binarySearch_divide_and_conquer(myArray, 0,myArray.length -1,0);
        System.out.println(foundIndex);
    }

    public static int binarySearch_divide_and_conquer(int[] array, int lowIndex, int highIndex, int target){
        //base case is when the target number is equal to the selected number
        //now we need to think about how binary search works
        //from what i remember it works by taking the selected number and
        //comparing it against the target number to check weather
        //it is equal to or greater or less than the target number.

        //if the selected number is equal to the target number, then the algorithm terminates.
        //if the selected number is less than the target number, then we set the lower index of array equal
        //to the index of the target number, and apply the same logic to the new array with constricted range
        //if the selected number is greater than the target number, then we set the upper index of array equal
        //to the index of the target number, and apply the same logic to the new array with constricted range.

        // Now, to select a number in the array, we always divide the range of array by half and select resulting index

        // Base case is when the array contains only 1 element, which would be the target



        if (lowIndex > highIndex) {
            return -1; // Base case: target not found
        }
        if(lowIndex == highIndex){
            return lowIndex; // this is the target value

            // Recursive case is when we miss the target value to go through the search process again.
        }else {
            int updatedLowIndex = lowIndex;
            int updatedHighIndex = highIndex;
            // Select the index of middle number in an array
            int selectedNumberIndex = (updatedLowIndex + updatedHighIndex) / 2;
            int selectedNumber = array[selectedNumberIndex];

            if (selectedNumber < target) {
                updatedLowIndex = selectedNumberIndex + 1;
            }else if(selectedNumber > target){
                updatedHighIndex = selectedNumberIndex - 1;
            }else{
                updatedHighIndex = updatedLowIndex;
            }


            return binarySearch_divide_and_conquer(array, updatedLowIndex, updatedHighIndex, target);
        }
    }
}