import javax.swing.JOptionPane;
public class Venta_del_Mes {
    public static void main(String armu[]) {
        byte repetir = 1, x = 1, n = 0;
        String mes = null, nombre = null;
        float total = 0, sumaTotal = 0;
        int i = 0, j = 1, costo = 150;
        int [][]matriz;
        while (repetir == x) {
            short numProvedor = 1;
            mes=JOptionPane.showInputDialog("Ingresee el mes");
            System.out.println("   ===> " + mes + " <===");
            n=Byte.parseByte(JOptionPane.showInputDialog("¿Cuantos provedores va a ingresar?"));
            System.out.println("No  prov" + "\t" + "Distribu" + "\t" + "Cantidad" + "\t" +  "Costo   " + "\t" + "Total   ");
            i = n;
            matriz = new int [i][j];
            for (i = 0; i < n; i ++) {
                System.out.print(numProvedor + "\t" + "\t");
                nombre=JOptionPane.showInputDialog("Ingrese nombre del Provedor");
                System.out.print(nombre + "\t" + "\t");
                for (j = 0; j < 1; j ++) {
                    matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la canidad"));
                    System.out.print(matriz[i][j] + "\t" + "\t" + "$" + costo + "\t" + "\t");
                }
                total = costo * matriz[i][0];
                System.out.println(" $ " + total);
                numProvedor ++;
                sumaTotal += total;
            }
            System.out.println("Total del mes: $ " + sumaTotal);
            System.out.println("======================================================================================");
            x=Byte.parseByte(JOptionPane.showInputDialog("""
                                                                >Nuevo mes ingrese: 1
                                                                >Finalizar ingrese: 2
                                                                """));            
        }
    }
}
