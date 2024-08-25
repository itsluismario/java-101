public class IncrementDescrement {
    public static void main(String[] args) {
        int lives = 3;
        System.out.println("Intial lives:" + lives); // 3

        // Postfijo
        lives--;
        System.out.println("Descrement:" + lives); // 2

        lives++;
        System.out.println("Increment:" + lives); // 3

        // Prefijo
        System.out.println("Ejem. de :" + 100 + lives++); // Postfijo 1003
        System.out.println("Ejem. de :" + 100 + lives); // 1004
        System.out.println("Ejem. de :" + 100 + ++lives); // Prefijo
    }
}
