package Program;

import java.util.Scanner;
import Entities.ENUM;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Object> TaskList = new ArrayList<Object>;

        Scanner rogerio = new Scanner(System.in);
        
        System.out.print("Digite sua tarefa: ");

        String tasks = rogerio.nextLine();

        System.out.println("Níveis de Prioridade: (Baixa, Média, Alta)");
        System.out.println("Prioridade da Tarefa: ");

        String priority = rogerio.next();



    }
}
