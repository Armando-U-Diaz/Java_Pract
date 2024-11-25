import javax.swing.JOptionPane;
public class ArrayCalifica {
    public static void main(String[] args) {
        String[] materias = {"MateDisc", "Calcdife", "FundInve", "FundProg","Quimica","DesaSust"};
        String[] unidades = {"Asignatura","U1", "U2", "U3", "U4", "U5"};
        byte[][] matrix = new byte[6][4];


        for (byte i = 0; i < materias.length; i++) {
            System.out.println("Calificacion de " + materias[i]);
            for (byte j = 0; j < unidades.length; j  ++) {
                matrix[i][j] = Byte.parseByte(JOptionPane.showInputDialog("Calificacion de " + unidades[j]));
            }
        }

        System.out.println("Calificiones");
        System.out.println("Asignatura   U1-U2-U3-U4-U5--Final");

        for (int i = 0; i < materias.length; i++) {
            System.out.print(materias[i] + ": ");
            double suma = 0;
            for (int j = 0; j < unidades.length; j++) {
                System.out.print(matrix[i][j] + " ");
                suma += matrix[i][j];
            }
            double promedio = suma / unidades.length;
            System.out.println(" " + promedio);
        }
    }
}
