class CustomException{
   int x,y;

   public CustomException(int x,int y){
       this.x = x;
       this.y = y;
   }
   
   int getVal(){
       return (x/y);
   
   }
}

class OrderOfCatchBlocks{

   public static void main(String args[]){
       try{
        CustomException CusEx =new CustomException(12,0);
            int ret = CusEx.getVal();
            System.out.println("Val = "+ret);
       }
       
       catch(Exception e){
           System.out.println(e);
       }
       catch(ArithmeticException e){
           System.out.println(e);
       }
       catch(NullPointerException n){
           System.out.println(n);
       
       }
   }
}