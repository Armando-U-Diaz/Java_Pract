import javax.swing.JOptionPane;
public class Factorial {
    public static void main(String []arm) {
        byte resp, num, x;
        int fac;
        do{
            num=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un numero"));
            fac = 1;
            for (x = num; x >= 1; x --) {
            fac *= x;
            System.out.print(fac + "\t");
            }
            System.out.println("");
            resp=Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 para continuar"));
        } while(resp == 1);
    }
}
