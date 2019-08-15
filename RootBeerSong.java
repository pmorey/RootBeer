class RootBeerSong {
  public static void main (String [] args){
    int x = 30;
    while (x > 1){
      System.out.println(x + " bottles of root beer on the wall,");
      System.out.println(x + " bottles of root beer,");
      System.out.println("take one down, pass it around,");
      x--;
      if (x > 1){
      System.out.println(x + " bottles of root beer on the wall!");
      System.out.println();
      }else{
       System.out.println(x + " bottle of root beer on the wall!");
       System.out.println();
      }
    }
      System.out.println(x + " bottle of root beer on the wall,");
      System.out.println(x + " bottle of root beer,");
      System.out.println("take one down, pass it around,");
      System.out.println("no more bottles of root beer on the wall!");
  }
}