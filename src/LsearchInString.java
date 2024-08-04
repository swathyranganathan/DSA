public class LsearchInString {
    public static void main(String[] args) {
        String name="shalini";
        char target='i';
        System.out.println(search(name,target));
    }
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }
        for (int i=0;i<name.length();i++){
            if(target==name.charAt(i)){ //compare each char in the string with target char
                //charAt(i) method: return the character at the specific index in a string
                /* 1st iteration (i=0):
                   name.charAt(0)is 's'
                    if(i==s) is false ...so on*/
                return true;
            }
        }
        return false;

    }
}
