public class Str_Array_20 {
    public static void main(String[] args) 
    {
        StringBuilder str=new StringBuilder("Good");
        str.append("hii");
        System.out.println(str.length());
        System.out.println(str);
        System.out.println(str);
        
            String str1="HELLO";
            char[] ch=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++) {
                if(ch[i]==ch[j]){
            System.out.println(ch[i]);
            return;
             }
        }
    }
}
    class Str_Array_200{
        public static void main(String[] args) {
            Str_Array_200 obj= new Str_Array_200(){
                String str2="ooooooooooo";
                String newStr="";
                
                for(int k=0;k<str2.length();k++){
                 char c =str2.charAt(k);
         
                 if(newStr.indexOf(c)==-1){
                     newStr+=c;
                 }
                }
                System.out.println("String after removing duplicates: " + newStr);
            }
            
        
        }
    }
}
       
    


