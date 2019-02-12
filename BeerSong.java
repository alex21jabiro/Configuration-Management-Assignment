public class Main {

    public static void main(String[] args) {
	Ninety_Nine_Bottles_of_Beer();
    }
    public static void Ninety_Nine_Bottles_of_Beer() {
         int i = 99;
        String name = "bottles";

        while (i > 0) {

            System.out.println(i + " " + name + " of beer on the wall, " + i + " " + name + " of beer");
            i = i - 1;

            if (i == 1) {
                name = "bottle";
            }

            if (i > 0) {
                System.out.println("take one down, pass it around, " + i + " " + name + " of beer of beer on the wall.");
            }
        }

        if (i == 0) {
            System.out.println(", no more bottles of beer on the wall.");
        }
    }
}
