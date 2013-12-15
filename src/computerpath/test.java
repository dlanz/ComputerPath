package computerpath;
/**
 * @author Daniel Lanza
 * 
 * Group Members:
 * Daniel Lanza
 * Antonio Jemmott
 * Chanakya Chakravartula
 * Mihir Satish Sakhardande
 * Alldrin D'Costa
 */
public class test {
    public static void main(String[] args) {
        
        int size = 4;
        // Primitive values are auto initialized to zero
        int [][] theArray = new int[size][size];
        int [][] closure = new int[size][size];
        
        //Turn on particular values for the initial relation
        theArray[0][3] = 1;
        theArray[1][2] = 1;
        theArray[2][0] = 1;
        theArray[3][1] = 1;
        
        //Create instance of ComputerPath class
        ComputerPath thisCP = new ComputerPath();
        thisCP.setSize(size);
        thisCP.setRelation(theArray);
        thisCP.setClosure(closure);
        
        System.out.println("Initial Relation");
        thisCP.outputRelationSet();
        System.out.println("");
  
        for (int k=0; k < size; k++){
            for (int j=0; j < size; j++){
                for (int i=0; i < size; i++){
                    thisCP.process(i, j, k);
                }
            }
        }
        
        System.out.println("Transitive Closure");
        thisCP.outputClosureSet();
    }
}