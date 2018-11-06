public class ArrayMethods{


  public static int rowSum(int[][] ary, int x){
    //returns the sum of the elements in Row x of ary.
    //When x is past the last row count it as a zero. (NO indexOutOfBounds should ever occur)
    int sum = 0;
    if (x >= ary.length){
      return 0;
    }

    for (int i = 0; i < ary[x].length; i++){
      sum += ary[x][i];
    }
    return sum;
  }


  public static int columnSum(int[][] ary, int x){
    //returns the sum of the elements in Column x of ary (careful with rows of different lengths!).
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
    int sum = 0;

    for (int i = 0; i < ary.length; i++){
      if (x >= ary[i].length){
        sum += 0;
      } else {
      sum += ary[i][x];
      }
    }
    return sum;
  }


  public static int[] allRowSums(int[][] ary){
    //returns an array of the row sums for each row of ary.
    //Index i of the return array contains the sum of elements in row i.
    int[] result = new int [ary.length];
    for (int i = 0; i < ary.length; i++){
      result[i] = rowSum(ary, i);
    }
    return result;
  }


  public static int[] allColSums(int[][] ary){
    //Returns an array with the column sum of each column of ary.
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
    //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
    //The length of the returned array should be the length of the LONGEST array in ary.
    int max = 0;
    for (int i = 0; i < ary.length; i++){
      if (ary[i].length > max){
        max = ary[i].length;
      }
    }

    int[] result = new int [max];
    for (int i = 0; i < max; i++){
      result[i] = columnSum(ary, i);
    }
    return result;
  }



}
