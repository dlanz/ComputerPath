package computerpath;
/**
 * @author Dan
 */
public class test {
    public static void main(String[] args) {
        
        int size = 4;
        int [][][] theArray = new int[size][size][size];
        int [][] closure = new int[size][size];
        
        for (int k=0; k < size; k++){
            for (int i=0; i < size; i++){
                for(int j=0; j < size; j++){
                    theArray[i][j][k] = 0;
                    
                }
            }  
        }
        
        for (int i=0; i < size; i++){
            for(int j=0; j < size; j++){
               
                closure[i][j] = 0;
            }
        }  

        ComputerPath thisCP = new ComputerPath();
        thisCP.setRelation(theArray);

      

        thisCP.setSize(size);

        theArray[0][3][0] = 1;
        theArray[1][2][0] = 1;
        theArray[2][0][0] = 1;
        theArray[3][1][0] = 1;
        
       
        System.out.println("Initial Relation");
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
            System.out.println("Set: "+k);
            thisCP.outputRelationSet(k);
            
        }
        
        
        int add;
        
        int[][][] relation;
        
        relation = thisCP.getRelation();
        
        for (int i=0; i < size; i++){
            for(int j=0; j < size; j++){
                add = 0;
                for(int k=0; k < size-1; k++){
                    
                    if(relation[i][j][k] == 1){
                        add = 1;
                    }
                }
                if(add == 1){
                    closure[i][j] = 1;
                }
            }
        }
        
        System.out.println();
        System.out.println("Transitive Closure");
        for (int i=0; i < size; i++){
            for(int j=0; j < size; j++){
                if(j == size-1){
                    System.out.println("'"+closure[i][j]+"'");
                }else{
                    System.out.print("'"+closure[i][j]+"'");
                }
            }
        }
        

        
       
        
        
        
        
    }
}