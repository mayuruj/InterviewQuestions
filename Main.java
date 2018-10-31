import java.math.BigInteger;
import java.util.TreeSet;
import java.math.BigInteger;
import java.lang.Character;

public class Main {

  public static void main(String[] args) {

    //solution to problem 6
    long startTime = System.currentTimeMillis();

    SolutionSumSquareDiff6 square = new SolutionSumSquareDiff6();
    System.out.println(square.getSquareOfSum(1, 100) - square.getSumOfSquare(1, 100));

    long endTime = System.currentTimeMillis();

    System.out.println("Problem 6 took " + (endTime - startTime) + " milliseconds");

    // solution to problem 16
    startTime = System.currentTimeMillis();

    SolutionPowerDigitSum16 powerDigitSum16 = new SolutionPowerDigitSum16();
    System.out.println(powerDigitSum16.getPowerDigitSum(2, 1000));

    endTime = System.currentTimeMillis();
    System.out.println("Problem 16 took " + (endTime - startTime) + " milliseconds");

    //solution to problem 4
    startTime = System.currentTimeMillis();

    SolutionLargestPalindromicProduct4 largestPalindromicProduct4 = new SolutionLargestPalindromicProduct4();
    System.out.println(largestPalindromicProduct4.getLargest3DigitPalindrome());
    endTime = System.currentTimeMillis();
    System.out.println("Problem 4 took " + (endTime - startTime) + " milliseconds");

  }
}

class SolutionLargestPalindromicProduct4 {

  /**
   * Get largest palindrome
   *
   * @return int
   */
  protected int getLargest3DigitPalindrome() {

    TreeSet<Integer> treeSet = new TreeSet<Integer>();
    SolutionLargestPalindromicProduct4 sp = new SolutionLargestPalindromicProduct4();
    // since we were able to find the maximum possible number as a result of multiplications on n digit numbers
    for (int i = 999; i>=100; i--) {
      for (int j = 999; j>=100; j--) {
        if (sp.isPalindrome(i*j)) {
          treeSet.add(new Integer(i*j));
        }
      }
    }
    return treeSet.last();
  }

  /**
   * Check if a number is a palindrome
   *
   * @param num number
   *
   * @return boolean
   */
  private boolean isPalindrome(int num) {

    char[] charNum = Integer.toString(num).toCharArray();
    int i = 0,j = charNum.length-1;

    while (charNum[i]==charNum[j] && i<j) {
      i++; j--;
    }

    if (i==j || j<i) {
      return true;
    }
    return false;
  }
}

class SolutionPowerDigitSum16 {

  /**
   * Get the power digit sum
   *
   * @param number passed in base number
   * @param power passed in power
   *
   * @return int
   */
  protected int getPowerDigitSum(int number, int power) {
    BigInteger baseNumber = new BigInteger(""+number);
    BigInteger largeNum = baseNumber.pow(power);

    // return the sum of digits of the large number
    return new SolutionPowerDigitSum16().getSumOfDigits(largeNum);
  }

  /**
   * Get sum of digits for a given number
   *
   * @param largeNum large number result of power
   *
   * @return int
   */
  private int getSumOfDigits(BigInteger largeNum) {

    // convert the digits to character array
    char[] digits = largeNum.toString().toCharArray();
    int i = 0, sum = 0;
    while (i<digits.length) {
      sum+=Character.getNumericValue(digits[i]);
      i++;
    }
    return sum;
  }

}

class SolutionSumSquareDiff6 {

  /**
   * Get the sum of squares
   *
   * @param min start the count with min
   * @param max stop the count with max
   *
   * @return int
   */
  protected int getSumOfSquare(int min, int max) {

    // handle the case of min being greater than max
    if (min > max) {
      int temp = max;
      max = min;
      min = temp;
    }

    int sumSquare = 0;

    //loop over and get the sum of squares
    for (int i = min; i<=max; i++) {
      sumSquare+=i*i;
    }
    return sumSquare;
  }

  /**
   * Get the square of sum
   *
   * @param min start the count for the sum
   * @param max stop the count for the sum
   *
   * @return int
   */
  protected int getSquareOfSum(int min, int max) {

    // handle the case of min being greater than max
    if (min > max) {
      int temp = max;
      max = min;
      min = temp;
    }

    int sum = 0;

    //loop over and get the sum of squares
    for (int i = min; i<=max; i++) {
      sum+=i;
    }

    return (sum*sum);
  }
}

