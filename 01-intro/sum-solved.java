int[][] arr = {{1, 2}, {1, 2}, {3, 4, {1, 2, 3}}};

public static int sum(int[][] arr) {
  int sum = 0;
  for (int[] row : arr) {
    for (int num : row) {
      sum += num;
    }
  }
  return sum;
}

