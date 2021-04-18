public class Output {
    public static int match(String w, String pattern){
        int count =0;
        int p =4;
        while(p >=0){
            p = w.indexOf(pattern,p);
            if(p>=0){
                p++;
            }
        }
        return p;
    }

    public static void main(String []args){
        int a = match("UR_pic_is_nice!","i");
        System.out.println(a);
    }
}
