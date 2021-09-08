class Main {
  public static void main(String[] args) {
    System.out.println("Homework 2");

    int numberBitesOfCookie = 5;
    double weightOfCookie = 1.9860;
    String flavorOfCookie = "Chocolate Chip";
    
    System.out.println("My cookie is " + flavorOfCookie + ", "+ weightOfCookie + " ounces, " + "and it took me " + numberBitesOfCookie + " bites to eat.");





    //constants
    //data you want to store, where the value doesn't change
    //final <type> NAME_OF_DATA

    //final double PI = 3.1415;
    //double diameter = PI + (4.5*4.5);

    //examples of constants:
    //any other math constants, like e, dimensions, measurements
    int num = 69;

    int sum = 0;
    sum += num;
    //System.out.println(sum);

    sum -= 2; // sum = sum - 2
    sum++; //sum = sum+1;

    // == test to see if equal
    // != 

    int a = 4;
    int b =5;

    if (a==b){
      //System.out.println("they are equal");
    }

    if(a!= b){
      //System.out.println("they are not equal");
    }

    boolean check = false;
    if (check){ //check is true
      //System.out.println("check is true");
    }

    // -----------------------------------------------

    // || or
    // && and
    // ! not

    if (a<b && check == false){
        //System.out.println("a is less than b and check is false");
    }

    // % modules / modulo

    int mod = 10 % 3;
    //System.out.println(mod);


  }
}
