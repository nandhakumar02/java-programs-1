
public class Digit {

    
    public static void main(String[] args) {
        String number = "467";
        int numlength = number.length();
        System.out.println(numlength);
        String numberToword = "";
        
        
        for(int j = 0;j<numlength; j++) {
            switch (number.charAt(j)) {
                case '1':{
                    numberToword = numberToword +"one";
                    break;
                }
                case '2':{
                    numberToword = numberToword +"Two";
                    break;
                }
                case '3':{
                    numberToword = numberToword +"Three";
                    break;
                }
                case '4':{
                    numberToword = numberToword +"Four";
                    break;
                }
                 case '5':{
                    numberToword = numberToword +"Five";
                    break;
                }
                 case '6':{
                    numberToword = numberToword +"Six";
                    break;
                }
                 case '7':{
                    numberToword = numberToword +"Seven";
                    break;
                }
                  case '8':{
                    numberToword = numberToword +"Eight";
                    break;
                  }
                 case '9':{
                    numberToword = numberToword +"Nine";
                    break;
                 }
                 default: {
                     numberToword = numberToword +"Zero";
                 }
            }
        }
        System.out.println(numberToword);
    }
        
                     
                 }
            
        
        // TODO code application logic here
    }
    
    
}
