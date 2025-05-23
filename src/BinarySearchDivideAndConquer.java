/**
 * Description: This algorithm is a Divide and Conquer implementation of Binary Search.
 * @author Halmuhammet Muhamedorazov
 * @since 22.05.2025
 * Note: Program return -1 when the target number is not in the array
 *       And base case is when the lowIndex is equal to highIndex
 */

 
class BinarySearchDivideAndConquer {
    public static void main(String[] args) {
        int[] myArray = {-57,-8,3,5,8,9,10};
        int foundIndex = binarySearch_divide_and_conquer(myArray, 0,myArray.length -1,1);
        System.out.println(foundIndex);
    }

    public static int binarySearch_divide_and_conquer(int[] array, int lowIndex, int highIndex, int target){

        //if the selected number is equal to the target number or if it is not in the array, program returns -1.
        //if the selected number is less than the target number, then we set the lower index of array equal
        //to the index of the target number, and apply the same logic to the new array with constricted range
        //if the selected number is greater than the target number, then we set the upper index of array equal
        //to the index of the target number, and apply the same logic to the new array with constricted range.

        // When we are left with lowIndex == highIndex, it means there is only one element in the array
        // We need to check whether this element is a target.

        if (lowIndex == highIndex && array[lowIndex] != target) {
            return -1; // Base case: target not in the array
        }
        else if(lowIndex == highIndex && array[lowIndex] == target){
            return lowIndex; // this is the index of target value

        // Recursive case is when we miss the target value to go through the search process again.
        }else {
            int updatedLowIndex = lowIndex;
            int updatedHighIndex = highIndex;
            // Select the index of middle number in an array
            int selectedNumberIndex = (updatedLowIndex + updatedHighIndex) / 2;
            int selectedNumber = array[selectedNumberIndex];

            // Update the lower and upper boundaries of array to narrow it down (divide)
            if (selectedNumber < target) {
                updatedLowIndex = selectedNumberIndex + 1;
            }else if(selectedNumber > target){
                updatedHighIndex = selectedNumberIndex - 1;
            }else{
                updatedHighIndex = updatedLowIndex;
            }

            // Make a recursive call with narrowed array range
            return binarySearch_divide_and_conquer(array, updatedLowIndex, updatedHighIndex, target);
        }
    }
}