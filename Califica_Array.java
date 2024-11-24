import javax.swing.JOptionPane;
public class Califica_Array {
    public static void main(String args[]) {
        String[] materias = {"MateDisc", "CalcDife", "FundProg", "Quimica", "FundInve", "DesaSust"};
        String[] unidades = {"U1", "U2", "U3", "U4", "5"};
        int[][] calificaciones = new int[6][5];
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Calificacion " + materias[i]);
            for (int j = 0; j < unidades.length; j  ++) {
                calificaciones[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Calificacion " + unidades[j]));
            }
        }
        System.out.println("\n" + "Calificacion de estudiantes");
        System.out.println("Asignatura" + "\t" + "U1" + "\t" + "U2" + "\t" + "U3" + "\t" + "U4" + "\t" + "U5" + "\t" + "Final");
        for (int i = 0; i < materias.length; i++) {
            System.out.print(materias[i] + "\t");
            double suma = 0;
            for (int j = 0; j < unidades.length; j++) {
                System.out.print(calificaciones[i][j] + "\t");
                suma += calificaciones[i][j];
            }
            double promedio = suma / unidades.length;
            System.out.println("\t" + promedio);
        }
    }
}
