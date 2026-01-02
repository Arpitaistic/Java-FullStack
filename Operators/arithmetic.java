package Operators;

public class arithmetic {
    public static void main(String[] args) {
        int yourSalary = 1000;
        int deduction = 500;
        int monthlyTotal = yourSalary - deduction;
        int yearlyTotal = monthlyTotal * 12;
        int perChildAllowance = yearlyTotal / 3;
        System.out.println("Monthly Total: " + monthlyTotal);
        System.out.println("Yearly Total: " + yearlyTotal);
        System.out.println("Per Child Allowance: " + perChildAllowance);

        int a = 10;
        int b = 3;
        int mod = a%b;
        System.out.println("Modulus: " + mod);
    }
}
