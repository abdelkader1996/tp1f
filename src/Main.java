

public class Main {
    public static void main(String[] args) {

        int[] g=new int[5];
        Array a= new Array(g);
        System.out.println("taille initial :"+a.getLength());
        a.expande(5);
        System.out.println("taille final "+a.getLength());
        a.push(7);
        System.out.println("taille final "+a.getLength());





    }
}
