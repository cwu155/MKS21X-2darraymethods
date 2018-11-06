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


}
