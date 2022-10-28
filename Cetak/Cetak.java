package Cetak;

public class Cetak {

  static double maxNumber(double a, double b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  static int maxNumber(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public static void main(String[] argrs) {
    System.out.println("\nProgram Mencari Angka Terbesar");
    System.out.println("Angka Maxnya adalah:" + " " + maxNumber(120, 182));
    System.out.println("Angka Maxnya adalah:" + " " + maxNumber(45, 78));
  }

}