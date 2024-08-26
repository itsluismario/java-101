public class Casting {
    public static void main(String[] args) {
        // In one year, helping 30 dogs to find a place
        // How many I help per month?
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // Estimated
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // Exact
        int a = 12;
        int b = 13;
        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);

    }
}
