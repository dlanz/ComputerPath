/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computerpath;

/**
 *
 * @author Dans
 */
public class test {
    public static void main(String[] args) {
    
       int[][] theArray = new int[6][6];
         
       
        for (int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                theArray[i][j] = 0;
            }
        }     
        
       ComputerPath thisCP = new ComputerPath();
       thisCP.setClosure(theArray);
       thisCP.setSize(6);
       thisCP.outputClosure();
       
       
       
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
       System.out.println("");
        thisCP.setRelation(theArray);
       thisCP.outputRelation();
       
      
       
       
       thisCP.process();
       //thisCP.outputClosure();
       
    }
}
