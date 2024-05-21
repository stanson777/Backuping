public class StaticInteger {
    public static void main(String args[]){
        System.out.println("Wybrane stale i metody statyczne klasy Integer");

        System.out.println("Wartosc minimalna integreru: "+Integer.MIN_VALUE);
        System.out.println("Wartosc maksymalna integreru: "+Integer.MAX_VALUE);
        System.out.println("Rozmiar integreru: "+Integer.SIZE);
        int a = 179;
        System.out.println("a = "+a);
        System.out.println("Zamiana integreru na string ktory jest binarana reprezentacja tej liczby: "+Integer.toBinaryString(a));
        System.out.println("Zamiana na system osemkowy: "+Integer.toOctalString(a));
        System.out.println("Zamiana na system szesnastkowy: "+Integer.toHexString(a));
        System.out.println("zamiana intu na Stringa: "+Integer.toString(a));
        System.out.println("Zamiana na string i reprezentacja tej liczby w systemie czworkowych: "+Integer.toString(a, 4));
        int b = Integer.parseInt(" 177");
        System.out.println("b = "+b);
        int c = Integer.parseInt("1000", 8);
        System.out.println("c = "+c);
        System.out.println("...: "+Integer.signum(a));
        System.out.println("...: "+Integer.signum(b));
        System.out.println("...: "+Integer.signum(0));
    }
}
