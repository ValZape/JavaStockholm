
package poly;


public class Horse extends Animal{
    
    public Horse(){
        
        System.out.println("HELLO FROM CONSTRUCTOR HORSE CLASS");
    }
    
//    @Override
//     public void sleep() {
//       
//       System.out.println("An HORSE sleeps.");
//   
//   }
   
    @Override
   public void eat(){
   
       System.out.println("An HORSE eats.....");
   }
   
  
    
   public void makeNoise(){
   
       System.out.println("An HORSE SOUNDS HEEEYAAHHHAAAA.....");
   }
    
    
    
}
