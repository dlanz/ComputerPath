package computerpath;
/**
 * @author Dan
 */
public class ComputerPath {
    private int[][][] relation;
    public void setRelation(int[][][] relation){
        this.relation = relation;
    }    
    public int[][][] getRelation(){
        return this.relation;
    }
    
    private int size;
    public void setSize(int size){
        this.size = size;
    }    
    public int getSize(){
        return this.size;
    }
    
    
    
    public int process(int i, int j, int k) {
       
        int path = 0;
        
        if(k == 0){
            if(this.relation[i][j][0] == 1){
                return 1;
            }else{ 
                return 0;
            }
        }else{
        
            for(int step = k; step >= 0; step--){
                for(int middle = 0; middle < this.size; middle++){
//                    System.out.println("i = "+i+": j = "+j+": k = "+k+": middle = "+middle);
//                    System.out.println(this.relation[i][middle][0]);
                    if(this.relation[i][middle][0] == 1){
                        if(this.process(middle, j, k-1) == 1){
                            return 1;
                        }
                    }
                }
                return 0;
            }
            return 0;
        }
    }
    
    public void outputRelationSet(int k){
        
        for (int i=0; i < this.size; i++){
            for(int j=0; j < this.size; j++){
                 if(j == this.size-1){
                    System.out.println("'"+this.relation[i][j][k]+"'");
                 }else{
                     System.out.print("'"+this.relation[i][j][k]+"'");
                 }
            }
        }  
    }  
}
