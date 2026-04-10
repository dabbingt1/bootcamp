public class String1 {
    private char [] chs;

    public String1() {

    }

    public String1(String value) {
        this.chs = new char[value.length()];
        int idx = 0;
        for( int i = 0; i < value.length(); i++) {
            this.chs[idx] =  value.charAt(i);
            idx++;
        }
    }

    public int length() {
        return this.chs.length;
    }
    
    public char charAt(int index) {
        return this.chs[index];
    }
       
    public String1 ( char [] chs){
        this.chs = chs;
    }

    public String replace(char from, char to) {
        String afterReplace = "";
        for ( int i = 0; i < this.chs.length; i++){
            if(this.chs[i] != from){
                afterReplace += chs[i];
            } else{
                afterReplace += to;
            }
        }
       // return String.valueOf(this.chs);
       return afterReplace;
    }

   public int indexOf(char target) {
    int idx = -1;
    for ( int i = 0; i < this.chs.length; i++) {
        if ( this.chs[i] == target) {
            idx = 1;
            break;
        }
    }
    return idx;
   }

    public static void main(String[] args) {

       
       String1 str = new String1("hello");

       System.out.println(str.length());
       System.out.println(str.charAt(0));

        //length
        //charAt(0)

        //replace ('l' , 'x')
        System.out.println(str.replace('l', 'x'));
        System.out.println(str);

        //indexOf('l')
    }
}
