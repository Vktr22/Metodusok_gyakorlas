
package metodusok_gyak;


public class Metodusok_gyak {

   
    public static void main(String[] args) {
        int osszeg = elso10szamosszege();
        String kimenet = "Az első 10 szám összege: " + osszeg + "\n";
        kiir(kimenet);
        
        int szam1 = 7, szam2 =4;
        osszeg = osszead(szam1, szam2);
        kiir("%d +%d = %d\n".formatted(szam1, szam2, osszeg));
        
        osszeg = osszead(1,2);
        osszeg = osszead(osszeg, 3);
        osszeg = osszead(osszeg, 4);
        kiir("1+2+3+4="+osszeg+"\n");
        
        int a=3, b=4, c=2;
        osszeg = osszead(a, b);
        osszeg = osszead(osszeg, c);
        String s = "%d+%d+%d gyöke:".formatted(a,b,c);
        double gyok = Math.sqrt(osszeg);
        kimenet = String.format("%s %.4\n", s, gyok);
        kiir(kimenet);
        
        
        
    }
    



    private static int elso10szamosszege() {
        //összead
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }

    private static int osszead(int a, int b) {
        return a+b;
    }
    
    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }

}