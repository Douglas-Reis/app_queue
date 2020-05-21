package main;

import javax.swing.JOptionPane;

import classe.Queue;

public class Main {
	
	public static void main(String[] args) {     
        int sizeQueue, positionQueue, options;
        
        sizeQueue = Integer.parseInt(JOptionPane.showInputDialog("Inicie com o tamanho da fila"));   
        Queue queue = new Queue (sizeQueue);
        
        do{
        	options = Integer.parseInt(JOptionPane.showInputDialog("Menu: " + "\n 1. Inserir" + "\n 2. Remover" + "\n 3. Exibir" + "\n 4. finalizar"));

           switch (options) {
              
               case 1:
            	   positionQueue = Integer.parseInt(JOptionPane.showInputDialog("Número a adicionar"));
            	   queue.insertQueue(positionQueue);
            	   queue.showQueue();
           
            	   if(positionQueue == 0){
            		   break;
            	   }
                   break;
                   
               case 2:
            	   queue.removeQueue();
                   break;
                   
               case 3:
            	   queue.showQueue();
                   break;
                
               case 4:
            	   System.exit(0);
            	   break;
            	   
               default:
            	   JOptionPane.showMessageDialog(null, "O núemro digitado não corresponde ao menu", "OPS...", JOptionPane.WARNING_MESSAGE);
           }
            
        }while(true);
	}
}