public class Main {
    public static void main(String[] args) {
        char[][] dog = {
                {'|','\\','_','/','|'},
                {'|','q',' ','p','|',' ',' ',' ','/','}'},
                {'(',' ','0',' ',')','\"','\"','\"','\\'},
                {'|','\"','^','\"','`',' ',' ',' ',' ','|'},
                {'|','|','_','/','=','\\','\\','_','_','|'}
        };
        for (int i = 0; i < dog.length; i++) {
            for (int j=0; j< dog[i].length; j++){
                System.out.print(dog[i][j]);
            }
            System.out.println();
        }
    }
}