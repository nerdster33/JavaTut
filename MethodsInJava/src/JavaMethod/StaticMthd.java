
package JavaMethod;


public class StaticMthd {
    // if private is added b4 static, the MainForStatic wnt be able to access this class
    public static int perimeter(int s){
      int p = 4*s;
        return p;
    }
    
    public static int perimeter(int l,int w){
        
       int p = 2*(l+w);
        return p;
        
    }
    
  public static void perimeter(){
        System.out.println("The perimeter is the addition of all the sides of a given shape");
       
    }


}
