package Java100dias;

public class Dia2 {
    public static void main(String[] args) {
        int Num = 3;
        double Flu = 3.7;
        String Nome = "Pedro";

        double media = (Num + Flu) / 2;
        System.out.println(media);
        double potencia = Math.pow(media, 2);
        System.out.println(potencia);
        System.out.println(Nome.length());
        System.out.println(Nome.substring(0,3));
    }
}
