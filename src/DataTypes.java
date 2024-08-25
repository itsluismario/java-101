public class DataTypes {
    public static void main(String[] args) {
        // Integer
        byte nB = 123;
        short nS = 12345;
        int nInt = 1234567890;
        long nL = 1234567890123456L;

        // Float
        float nF = 1.1234567890123456789123456789F;
        double nD = 1.123456789;

        // var is a keyword that allows Java to infer the most appropriate data type based on the assigned value.
        var salary = 10; // int
        var pension = salary*0.03; // double
        var totalSalary = salary - pension; // double

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);
    }
}
