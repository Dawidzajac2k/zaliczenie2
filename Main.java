
class Main {
  public static void main(String[] args) {
   int[] tab = { 54, 2, 30, 35, 65, 34, 5, 8, 23, 65, 4, 5, 6, 3, 59, 55, 3, 2, 54, 5, 5 };
        int dlugosc = tab.length;
        int max = tab[0];
        for (int i = 0; i < dlugosc; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        System.out.println(max);
  }
}