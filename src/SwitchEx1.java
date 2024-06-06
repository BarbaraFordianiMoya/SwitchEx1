
import javax.swing.JOptionPane;

public class SwitchEx1 {

    public static void main(String args[]) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Escolha um mes, mas escreva ele em numero"));
        
        switch (mes) {
            case 1: System.out.println("Fevereiro");
            break;
            case 2: System.out.println("Março");
            break;
            case 3: System.out.println("Abril");
            break;
            case 4: System.out.println("Maio");
            break;
            case 5: System.out.println("Junho");
            break;
            case 6: System.out.println("Julho");
            break;
            case 7: System.out.println("Agosto");
            break;
            case 8: System.out.println("Setembro");
            break;
            case 9: System.out.println("Outubro");
            break;
            case 10: System.out.println("Novembro");
            break;
            case 11: System.out.println("Dezembro");
            break;
            case 12: System.out.println("Janeiro");
            
        }
    }
    
}
