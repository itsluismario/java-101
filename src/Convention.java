public class Convention {
    public static void main(String[] args) {
        // Sensitive case
        int celPhone = 1234;
        int celphone = 1234;

        // Symbols allowed at the begining
        String $countryName = "Canada";
        String _backgroundColor = "Arena";

        // Symbols are allowed after the first string
        String currency$ = "123";
        String background_color = "Arena";

        // Constants
        int VALUE = -5;
        final String OTHER_VALUE = "5";
    }
}
