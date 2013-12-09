package computerpath;
/**
 * @author Dan
 */
public class test2 {
    public static void main(String[] args) {
        
        int size = 4;
        int [][][] theArray = new int[size][size][size];
        int [][][] closure = new int[size][size][size];
        
        for (int k=0; k < size; k++){
            for (int i=0; i < size; i++){
                for(int j=0; j < size; j++){
                    theArray[i][j][k] = 0;
                    closure[i][j][k] = 0;
                }
            }  
        }

        ComputerPath thisCP = new ComputerPath();
        thisCP.setRelation(theArray);

      

        thisCP.setSize(size);

        theArray[0][3][0] = 1;
        theArray[1][2][0] = 1;
        theArray[2][0][0] = 1;
        theArray[3][1][0] = 1;
        
       
       
        thisCP.outputRelationSet(0);
        System.out.println("");
        
        for (int k=0; k < size; k++){
            for (int i=0; i < size; i++){
                for(int j=0; j < size; j++){
                    
                    theArray[i][j][k] = thisCP.process(i, j, k);
                }
            }
        }
       
        for(int k=0; k < size - 1; k++){
            thisCP.outputRelationSet(k);
            System.out.println("Set: "+k);
        }
        
       
        
        
        
        
    }
}