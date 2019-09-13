public class ex34
{
    public static void main(){
        int z = 0;
        for(int x = 0; x < 5; x++){
            for(int y = 0; y <9 ; y++){
                if(x == 0 && z< 9 ){
                    System.out.print("*");
                    
                }                
                else if(x == 1 && y>0 && y<8 ){
                    System.out.print("*");
                }
                else if(x == 2 && y>1 && y<7 ){
                    System.out.print("*");
                }
                else if(x == 3 && y>2 && y<6 ){
                    System.out.print("*");
                }
                else if(x == 4 && y>3 && y<5 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }      
    }
}
