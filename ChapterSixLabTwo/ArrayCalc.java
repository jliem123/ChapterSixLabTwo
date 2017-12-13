
/**
 * Write a description of class ArrayCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayCalc
{
    public double averageArray(int[][] nums) {
        int sum = 0;
        for (int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[0].length; col++){
                sum += nums[row][col];
            }
        }
        int total = nums.length * nums[0].length;
        return (double)sum/total;
    }
    
    public int[] sumColumns(int[][] nums) {
        int[] result = new int[nums[0].length];
        for(int col = 0; col < nums[0].length; col++){
            int total = 0;
            for(int row = 0; row < nums.length; row++){
                total += nums[row][col];
            }
        }
        return result;
    }
    
    public int[][] squareArray(int[][] nums) {
        int[][] result = new int[nums.length][nums[0].length];
        for (int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[0].length; col++){
                int value[row][col];
                
            }
        }
        return Math.sqrt(value);
    }
}
