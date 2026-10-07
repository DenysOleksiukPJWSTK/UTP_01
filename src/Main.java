 // TODO: musimy dodac brakujace klasy!

 // OK, ja dodam ‘Adder‘, a s31637 doda ‘Subtractor‘.


 public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(34, 45));

        Subtractor subtractor = new Subtractor();

        System.out.println(subtractor.subtract(3, 3));

    }
}
