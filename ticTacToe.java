import java.util.Random;
import java.util.Scanner;

public class ticTacToe {
        public static void main(String[] args) {
          
            String[][]ticTac=new String[3][3]; //makes a three by three 
           ticTac[0][0]=1+"";
           ticTac[0][1]=2+""; 
           ticTac[0][2]=3+"";
           ticTac[1][0]=4+""; 
           ticTac[1][1]=5+"";
           ticTac[1][2]=6+""; 
           ticTac[2][0]=7+""; 
           ticTac[2][1]=8+""; 
           ticTac[2][2]=9+"";
         
            for(int i =0;i<ticTac.length;i++){ 
                for(int j=0;j<ticTac[i].length;j++){ 
                    ticTac[i][j]=" "; //prints empty spots
                }
            }
    
           for(int i=0;i<ticTac.length;i++){ 
                for(int j=0;j<ticTac[i].length;j++){ 

                    System.out.print(ticTac[i][j]);
                    if(j<ticTac[i].length-1){ 
                        System.out.print("  |  "); //prints except for the last column 
                    }
                }
                System.out.println();
                if(i<ticTac.length-1){ 
                    System.out.println("---------------"); //prints except for the last row
                }
           }

        
            int num1;
           Scanner toe=new Scanner(System.in); 
          boolean isXTurn=true;
           
           while(true){ 
            System.out.println("Enter a number between 1 to 9"); 
           
            num1=toe.nextInt(); 
                 if(num1>9||num1<1){ 
                     System.out.println("I said a number between 1 to 9 silly goose");
                     continue;
                 } 
            int row=(num1-1)/3; 
            int column=(num1-1)%3; 
          
                 if(ticTac[row][column].equals("X")|| ticTac[row][column].equals("O")){ 
                         System.out.println("Spot already taken"); 
                         continue;
                  }
           

                    if(isXTurn){ 
                       ticTac[row][column]="X";
                     }
                         else{
                            ticTac[row][column]="O";
                             }
            isXTurn=!isXTurn; //switch to O
            
                  for(int i=0;i<ticTac.length;i++){ 
                     for(int j=0;j<ticTac[i].length;j++){ 

                      System.out.print(ticTac[i][j]);
                         if(j<ticTac[i].length-1){ 
                            System.out.print("  |  "); //prints the board 
                          }
                      }
                          System.out.println();
                      if(i<ticTac.length-1){ 
                             System.out.println("--------------");
                      }
                  }
             

      

               

               for(int i =0;i<ticTac.length;i++){ 
                     if(ticTac[i][0].equals("X")&& ticTac[i][1].equals("X")&&ticTac[i][2].equals("X")){ 
                        System.out.println("X wins");
                       return;
                     }
                      if(ticTac[i][0].equals("O")&& ticTac[i][1].equals("O")&&ticTac[i][2].equals("O")){ 
                        System.out.println("O wins");
                         return;
                      }
    
                    
               }

               for(int i =0;i<ticTac.length;i++){ 
                    if(ticTac[0][i].equals("X")&&ticTac[1][i].equals("X")&&ticTac[2][i].equals("X")){ 
                        System.out.println("X wins");
                        return;
                    }
                    if(ticTac[0][i].equals("O")&&ticTac[1][i].equals("O")&&ticTac[2][i].equals("O")){ 
                        System.out.println("O wins");
                        return;
                    }
                
               }
               if(ticTac[0][0].equals("X")&&ticTac[1][1].equals("X")&&ticTac[2][2].equals("X")){ 
                    System.out.println("X Wins"); 
                    return;
               } 
               if(ticTac[0][0].equals("O")&&ticTac[1][1].equals("O")&&ticTac[2][2].equals("O")){ 
                    System.out.println("O Wins"); 
                    return;

             } 
             if(ticTac[0][2].equals("X")&&ticTac[1][1].equals("X")&&ticTac[2][0].equals("X")){ 
                System.out.println("X Wins");
                return;
             }
             if(ticTac[0][2].equals("O")&&ticTac[1][1].equals("O")&&ticTac[2][0].equals("O")){ 
                System.out.println("O Wins");
                return;
             } 

            boolean isDraw=true; 
            for(int i =0;i<ticTac.length;i++){ 
                for(int j =0;j<ticTac[i].length;j++){ 
                    if(ticTac[i][j].equals(" ")){ 
                        isDraw=false;
                        break;
                    }
                    
                }
                if(!isDraw){ 
                    break;
                }
                
            }
            if(isDraw){ 
                System.out.println("It's a draw, you both lost.");
            }

           
       }
           
    } 

   
    
        

}


    
    
    
    


 
          
       

       

           

           

        
    
    

