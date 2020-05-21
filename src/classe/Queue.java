package classe;

public class Queue {
    private int [] values;
    private int first;
    private int last;
    
    public Queue(int element) {
    	values = new int[element];
    	first = 0;
    	last = -1;
    }
    
    public void insertQueue(int element) {
        int  size = values.length;
        
        if (last < size-1) {
        	last++;
           values[last] = element;
        } else {
            System.out.println("Status: Fila Cheia");
        }
    }

    public int removeQueue() {
        int element;
        
        if (last != -1) {
        	element = values[first];
            first++;
            if (first > last) {
            	first = 0;
            	last = -1;
            }
            return(element);
        } else {
            System.out.println("Status: Fila Vazia");
            return(-1);
        }
    }

    public void showQueue() {
        System.out.print("Fila: ");
        for (int i = first;i <= last;i++) {
            System.out.print(values[i] + " ");
        }
        if (last == -1) {
            System.out.print("Vazia");
        }
        System.out.println();
    }
}