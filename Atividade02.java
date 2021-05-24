

public class Atividade02 {

    public static void main(String[] args) {
        String[][] xadrez = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if ((i % 2 == 0) && (j % 2 == 0) || (i % 2 != 0) && (j % 2 != 0)) {
                    System.out.print(" Branca ");
                } else if ((i % 2 != 0) && (j % 2 == 0) || (i % 2 == 0) && (j % 2 != 0)) {
                    System.out.print(" Preta ");
                }
            }
          System.out.println(" ");   
        }
       
    }

}
