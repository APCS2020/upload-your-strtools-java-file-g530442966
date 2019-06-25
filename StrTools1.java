public class StrTools1{
    public static String changeFristChar(String str) {
    // String remainedStr = str.substring(1);
    // String firstChar = str.substring(0,1);
    // return f.toUpperCase()+remainStr; 
    return str.substring(0,1).toUpperCase() +
           str.substring(1);
    }
    public static String addPeriod(String str){
        return str + ".";
    }

    //replace a target word with a given word
    public static String replace(String str ,String target,String repl){
        int firstIndex = str.indexOf(target);
        int secondIndex = firstIndex + target.length();
        String firstPart = str.substring(0,firstIndex);
        String secondPart = str.substring(secondIndex);
         return firstPart + repl + secondPart;                            
    } 

    //print single character of a string
    //"abcd" return "a,b,c,d."
      public static String printSingleChar(String str){
         int index = 0;
         String tmp = "";
         while (index < str.length()-1){
         tmp += str.substring(index, index+1);
         tmp += ",";
         tmp += " ";
         index++;
     }
          return tmp + str.substring(str.length()-1) + ".";
    }
    public static void main(String[] args) {
        String str = "The dog is so cute";//chang the first charactor 't'
        String tmp = replace(str,"dog","cat");//tmp"The"
        System.out.println(tmp);
    }
    public static String reverse(String str){
        int index = str. length()- 1;
        String tmp = "";
        while(index >= 0){
            tmp += str. substring(index, index+1);
            index --;
        }
        return tmp;
    }
    public static String reverse(String str){
        String tmp = "";
        for(int i= 0; String  - StrTools. reverse(string){
            tmp += str. substring(i, i-1);
        }
        return tmp;
    }
    public static  String parliWord (String str){
        return str + reverse(str);
    }
    public static String parlidrom(String str){
        String tmp = "";
        if(str.length()%2==0)
            tmp = str.substring(0,str.length()/2);
        else
            tmp = str.substring(0,str.length()/2+1);
            return tmp + reverse (tmp);
    }
    

    public static boolean isPali(String str) {
        String half = str. substring(0, str. length()/2);
        String secondhalf = "";
        if (str.length() % 2 == 0){
            secondhalf = str.substring(0, str.length() / 2);
        }
        else{
            secondhalf = str.substring(0, str.length() / 2+1);
        }
          return reverse(secondhalf). equals(half);   
    }
}