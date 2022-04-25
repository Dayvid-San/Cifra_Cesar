
public class Main
{
    public static void main(String[] args) {
        String str = "Testando e tentando";
        String[] arrStr = str.split("");

        for (String a: arrStr)
            System.out.println(a);
        
        char character = 'a';
        int ascii = (int) character;
        System.out.println(ascii);

        int as = (char) arrStr[0];
        int ascii = (int) as;
        System.out.println(ascii);
    }
}
