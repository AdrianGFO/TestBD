package Program;

import java.util.Scanner;
import Entities.ENUM;
import java.util.ArrayList;
import Entities.TaskOBJ;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList <TaskOBJ> TaskList = new ArrayList <TaskOBJ>();
        
        Scanner rogerio = new Scanner(System.in);
        int continueAdd;
       
        do{    
        System.out.print("Digite sua tarefa: ");

        String tasks = rogerio.nextLine();

        System.out.println("Níveis de Prioridade: \n1 - Alta \n2 - Média \n3 - Baixa)");
        System.out.println("Prioridade da Tarefa: ");

        int switchCaseNumber = rogerio.nextInt();
        ENUM priority = ENUM.Alta; 

        switch(switchCaseNumber){
            case 1: 
            priority = ENUM.Alta;
            break;
            case 2: 
            priority = ENUM.Média;
            break;
            case 3:
            priority = ENUM.Baixa;
            break;
        }

        LocalDate data = LocalDate.now();

        TaskOBJ myTask = new TaskOBJ(tasks, data, priority);
        
        TaskList.add(myTask);


        System.out.println("Continuar adicionando Tarefas? (1 - SIM   2 - NÃO)");
        continueAdd = rogerio.nextInt();
        rogerio.nextLine();

        }while(continueAdd == 1);

       /* for(TaskOBJ n : TaskList){
           System.out.println(TaskList.get(n));
        }*/ 
        
        for(int i = 0; i < TaskList.size(); i++){
            System.out.println(TaskList.get(i) + "\n_________________________________________________________");
        }
        


        rogerio.close();
    }
}
