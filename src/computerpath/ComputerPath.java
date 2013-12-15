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
public class ComputerPath {
    
    private int[][] relation;
    public void setRelation(int[][] relation){
        this.relation = relation;
    }    
    public int[][] getRelation(){
        return this.relation;
    }
    
    private int[][] closure;
    public void setClosure(int[][] closure){
        this.closure = closure;
    }    
    public int[][] getClosure(){
        return this.closure;
    }
    
    private int size;
    public void setSize(int size){
        this.size = size;
    }    
    public int getSize(){
        return this.size;
    }
    
    //Process to see if there is a path of length k from node i to node j
    public int process(int i, int j, int k) {
        if(k == 0){
            if(this.relation[i][j] == 1){
                this.closure[i][j] = 1;
                return 1;
            }
            return 0;
        }

        for(int middle = 0; middle < this.size; middle++){
            if(this.relation[i][middle] == 1){
                if(process(middle,j,k-1) == 1){
                    this.closure[i][j] = 1;
                    return 1;
                }
            }   
        }
        return 0;
    } 
    
    //Output the relational set
    public void outputRelationSet(){
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
    
    //Output the closure set
    public void outputClosureSet(){
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