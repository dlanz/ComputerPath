/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computerpath;

/**
 *
 * @author Dans
 */
public class ComputerPath {
    private int[][]relation;
    public void setRelation(int[][] relation){
        this.relation = relation;
    }    
    public int[][]getRelation(){
        return this.relation;
    }
    
    private int size;
    public void setSize(int size){
        this.size = size;
    }    
    public int getSize(){
        return this.size;
    }
    
    private int[][] closure;
    public int[][] getClosure(){
        return this.closure;
    }
    public void setClosure(int[][] closure){
        this.closure = closure;
    }
    
    
    public void process() {
    
        for(int k = 0; k < this.size-1; k++){
           for(int i = 0; i < this.size; i++){
               for(int j = 0; j < this.size; j++){
                   if(this.relation[i][k] == 1 || this.relation[k][j] == 1){
                        this.closure[i][j] = 1;    
                   }
               } 
               this.relation = this.closure;
           }
       }
    }
    
    public void outputRelation(){
        
        for (int i=0; i < this.size; i++){
            for(int j=0; j < this.size; j++){
                 if(j == this.size-1){
                    System.out.println("'"+this.relation[i][j]+"'");
                 }else{
                     System.out.print("'"+this.relation[i][j]+"'");
                 }
            }
        }  
    }
    
    public void outputClosure(){
        
        
        for (int i=0; i < this.size; i++){
            for(int j=0; j < this.size; j++){
                 if(j == this.size-1){
                    System.out.println("'"+this.closure[i][j]+"'");
                 }else{
                     System.out.print("'"+this.closure[i][j]+"'");
                 }
            }
        }  
    }
}
