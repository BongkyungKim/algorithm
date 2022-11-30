public class Main{
    public static void main(String[] args) {
        String[][] s = {
                {"         ",",","r","'","\"","7"},
                {"r","`","-","_","  "," ",",","'","  ",",","/"},
                {" ","\\","."," ","\"","."," ","L","_","r","'"},
                {"   ","`","~","\\","/"},
                {"      |"},
                {"      |"}
        };

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j <s[i].length; j++ ) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}
