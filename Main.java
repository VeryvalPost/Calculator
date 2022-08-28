public class Main {
    public static void main(String args[]){
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);   // в классе Calculator, в случае если будет введен ноль, деление будет произведено на 1 и будет выведено предупреждение

        calc.println.accept(c);

    }
}
