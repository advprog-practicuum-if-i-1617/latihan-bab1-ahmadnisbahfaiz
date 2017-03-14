package latihan;

public class BaseGame {
    public static void main(String[] args) {
        GameParts game = new GameParts();
        byte iteration = 10;
        char arah;
        
        System.out.println("PROGRAM GAME PACMAN-LIKE");
        game.variableInitialisation();
        while(iteration > 0){
            game.gameArea(iteration);
            iteration--;
        }
        System.out.println("Sudah bermain 10 langkah. Game selesai. Terima kasih sudah bermain :)");
//        char[][] area;
//        boolean[][] status;
//        char decision;
//        area = new char[10][10];
//        status = new boolean[10][10];
//        byte x = 1, y = 2;
//        do{
//            if(area[x][y] == '#'){                  //seleksi kondisi untuk mengakhiri program ketika & menyentuh #
//                System.out.println("GAME OVER!");
//                System.exit(0);
//            }
//            if(area[x][y] == '@' && status[x][y] == false){     //seleksi kondisi untuk menghapus @ bila & bertemu @
//                area[x][y] = '&';
//                status[x][y] = true;
//            }
//            for (byte i = 0; i < 10; i++) {      //indeks pengendali baris (sumbu x)
//                area[i][0] = '#';
//                System.out.print(area[i][0]);
//                if (i == 0 || i == 9) {           //indeks untuk mbkin batasan di paling atas dan paling bawah
//                    for (byte j = 0; j < 8; j++) { //indeks pengendali kolom
//                        area[i][j] = '#';
//                        System.out.print(area[i][j]);
//                    }
//                }
//                if (i != 0 && i != 9) {           //indeks untuk mbkin batasan di antara paling atas dan paling bawah
//                    for (byte j = 0; j < 7; j++) { //indeks pengendali kolom (sumbu y)
//                        if (i == 2 && (j >= 0 && j < 2)) { //indeks untuk mbkin batasan di dalam area
//                            while (j >= 0 && j < 2) {
//                                area[i][j] = '#';
//                                System.out.print(area[i][j]);
//                                j++;
//                            }
//                        }
//                        if (i == 2 && (j >= 4 && j <= 5)) { //indeks untuk mbkin batasan di dalam area
//                                area[i][j] = '#';
//                                System.out.print(area[i][j]);
//                                j++;
//                        }
//                        if (i == 3 && (j >= 4 && j <= 5)) { //indeks untuk mbkin batasan di dalam area
//                                area[i][j] = '#';
//                                System.out.print(area[i][j]);
//                                j++;
//                        }
//                        if(i == 1 && j == 3 && status[i][j] != true){ //indeks untuk mbkin "makanan" di dalam area
//                            area[i][j] = '@';
//                            System.out.print(area[i][j]);
//                            j++;
//                        }
//                        if(i == 4 && j == 4 && status[i][j] != true){ //indeks untuk mbkin "makanan" di dalam area
//                            area[i][j] = '@';
//                            System.out.print(area[i][j]);
//                            j++;
//                        }
//                        if (i == x && j == y) {             //indeks untuk mbkin simbol yang dikendalikan di dalam area
//                            area[i][j] = '&';
//                            System.out.print(area[i][j]);
//                        } 
//                        else {                              //indeks untuk mbkin whitespace/spasi
//                            area[i][j] = ' ';
//                            System.out.print(area[i][j]);
//                        }
//                    }
//                    area[i][9] = '#';
//                    System.out.print(area[i][9]);
//                }
//                System.out.println();
//            }
//            System.out.println("Masukkan arah simbol & [w (atas), s (bawah), a (kiri), d (kanan), q (keluar program)]: ");
//             decision = in.next().charAt(0);
//            if(decision == 'q' || decision == 'Q')
//                System.exit(0);
//            else if(decision == 'w' || decision == 'W')
//                --x;
//            else if(decision == 's' || decision == 'A')
//                ++x;
//            else if(decision == 'a' || decision == 'A')
//                --y;
//            else if(decision == 'd' || decision == 'D')
//                ++y;
//            System.out.println();
//        }while(true);
        
        
//        int[][] makanan;
//        makanan = new int[10][10];
//        for(int i = 0; i < 10; i++){
//            for(int j = 0; j < 10; j++){
//                System.out.print(area[i][j]);
//            }
//        }
    }
}
