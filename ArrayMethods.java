public class ArrayMethods{

  //1.
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

  //2.
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

  //3.
  public static int[] allRowSums(int[][] ary){
    //returns an array of the row sums for each row of ary.
    //Index i of the return array contains the sum of elements in row i.
    int[] result = new int [ary.length];
    for (int i = 0; i < ary.length; i++){
      result[i] = rowSum(ary, i);
    }
    return result;
  }




}
