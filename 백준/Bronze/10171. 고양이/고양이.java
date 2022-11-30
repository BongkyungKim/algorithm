public class Main {
    public static void main(String[] args) {
        String[][] cat = {
                {"\\"," "," "," "," ","/","\\"},
                {" ",")"," "," ","("," ","'",")"},
                {"("," "," ","/"," "," ",")"},
                {" ","\\","(","_","_",")","|"}
        };

        for (int i = 0; i < cat.length; i++) {
            for (int j = 0; j < cat[i].length; j++) {
                System.out.print(cat[i][j]);
            }
            System.out.println();
        }
    }
}
