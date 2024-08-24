public class UpdatingVar {
    public static void main(String[] args) {
        int salary = 1000;

        // Bono $200
        salary = salary + 200;
        System.out.println(salary);

        // Pension -$50
        salary = salary - 50;
        System.out.println(salary);

        // 2 hrs extra: $30 each
        // Food: -$45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        // Updating strings
        String employeeName = "luis mario";
        employeeName = employeeName + " campos";
        System.out.println(employeeName);

    }
}
