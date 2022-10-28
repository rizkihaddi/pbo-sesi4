package Hewan;

class Hewan {
  public void suaraHewan() {
      System.out.println("\n------- Program Jenis Hewan dan Suaranya -------");
  }
}

class Tikus extends Hewan { 
  public void suaraHewan() {
      System.out.println("Tikus bersuara : cit cit cit....");
  }
}

class Kucing extends Hewan {
  public void suaraHewan() {
      System.out.println("Kucing bersuara : miau... miau...");
  }
}

class Main {
   public static void main(String[] args) {
       Hewan hewanSaya = new Hewan();
       Hewan tikusSaya = new Tikus(); 
       Hewan kucingSaya = new Kucing();
       hewanSaya.suaraHewan();
       tikusSaya.suaraHewan();
       kucingSaya.suaraHewan();
   }
}