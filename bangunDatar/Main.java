package bangunDatar;

public class Main {
  public static void main(String[] args) {
      
      BangunDatar bangunDatar = new BangunDatar();
      Persegi persegi = new Persegi(8);
      Segitiga segitiga = new Segitiga(8, 10);
      Lingkaran lingkaran = new Lingkaran(80);
      
      bangunDatar.luas();
      bangunDatar.keliling();
      
      System.out.println("Luas persegi: " + persegi.luas());
      System.out.println("keliling persegi: " + persegi.keliling());
      System.out.println("Luas segitiga: " + segitiga.luas());
      System.out.println("\nLuas lingkaran: " + lingkaran.luas());
      System.out.println("keliling lingkaran: " + lingkaran.keliling());
      System.out.println("---------------------------------------------------");
  }
}