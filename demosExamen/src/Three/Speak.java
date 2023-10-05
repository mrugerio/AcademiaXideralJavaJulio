
package Three;

public class Speak {

    public static void main(String[] args){

        Speak speakIT = new Tell();
        Tell tellIt = new Tell();
        
        //speakIT.tellItLikeItIs(); //NO SE PUEDE
        //((Tell)speakIT).tellItLikeItIs(); //SI SE PUEDE
        //(Truth)speakIT.tellItLikeItIs(); //NO SE PUEDE, POR LOS PARENTESIS
        ((Truth)speakIT).tellItLikeItIs(); //SI SE PUEDE //1
        tellIt.tellItLikeItIs(); //SI SE PUEDE //2
        //(Truth)tellIt.tellItLikeItIs(); //NO SE PUEDE
        ((Truth)tellIt).tellItLikeItIs(); //SI SE PUEDE //3
        
        ((Truth)(Tell)tellIt).tellItLikeItIs(); //SI SE PUEDE 
        
        ((Truth)(Speak)(Tell)speakIT).tellItLikeItIs();

        
        
        
        
        

    }
}