package computerpath;
/**
 * @author Dan
 */
public class test {
    public static void main(String[] args) {
    
        int[][] theArray = new int[6][6];
        int [][] closure = new int[6][6];
        int size = 6;
        
        for (int i=0; i < size; i++){
            for(int j=0; j < size; j++){
                theArray[i][j] = 0;
                closure[i][j] = 0;
            }
        }     

        ComputerPath thisCP = new ComputerPath();
        thisCP.setRelation(theArray);

        thisCP.setClosure(closure);

        thisCP.setSize(size);

        theArray[0][1] = 1;
        theArray[0][5] = 1;
        theArray[1][0] = 1;
        theArray[1][2] = 1;
        theArray[1][3] = 1;
        theArray[2][1] = 1;
        theArray[2][0] = 1;
        theArray[2][3] = 1;
        theArray[3][0] = 1;
        theArray[3][4] = 1;
        theArray[4][3] = 1;
        theArray[5][4] = 1;
        theArray[5][3] = 1;
       
        thisCP.outputRelation();
        System.out.println("");
        
        thisCP.setRelation(theArray);
        
        for (int i=0; i < size; i++){
            for(int j=0; j < size; j++){
                for(int k=0; k < size; k++){
                    closure[i][j] = thisCP.process(i, j, k);
                }
            }
        }
        
        for (int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                 if(j == 5){
                    System.out.println("'"+theArray[i][j]+"'");
                 }else{
                     System.out.print("'"+theArray[i][j]+"'");
                 }
            }
        }  
    }
}