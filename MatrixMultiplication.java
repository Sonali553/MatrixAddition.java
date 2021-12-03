public class MatrixMultiplication {  

 public static void main(String args[]){ 
 
  //creating two matrices    
  int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
  int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
  //creating new matrix to store the multiplication of two matrices
    
  int c[][]=new int[3][3];  
    
  //multiplying and printing multiplication of 2 matrices    
   for(int i=0;i<3;i++) {
    
    for(int j=0;j<3;j++) { 
   
     c[i][j]=0;  
    
     for(int k=0;k<3;k++) {   
   
      c[i][j]+=a[i][k]*b[k][j];   
   
     } //end of k loop  

     System.out.print(c[i][j]+" ");  //printing matrix element  
     
    }//end of j loop  
    System.out.println();//new line    
   }    
 } 
} 
