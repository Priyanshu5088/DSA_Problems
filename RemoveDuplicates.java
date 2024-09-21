public class RemoveDuplicates {// Asked in GOOGLE && MICROSOFT
    public static void removeDuplicates(String str , int index , StringBuilder newStr , boolean map[]){
          if(index==str.length()){
                System.out.println(newStr); 
                return ;
          }

          char currchar = str.charAt(index);// character present at this index
          if(map[currchar -'a']==true){//'a'-'a'==true.. and if a comes again  then it will see that true is stored already..
              //it is duplicate
              removeDuplicates(str, index+1, newStr, map);
          }else{
            map[currchar -'a']=true;
            removeDuplicates(str, index+1, newStr.append(currchar), map);
          }
    }

    public static void main(String[] args) {
        String str = "softwaredeveloper";
        removeDuplicates(str, 0,new StringBuilder(""),new boolean[26]);
    }
}
