package latihan;

import java.util.Scanner;

public class GameParts {

    public char[][] area;                   //variabel lebar area
    public boolean[][] status;              //variabel status simbol '@' (makanan) apakah sudah termakan atau belum
    public byte x, y;                       //variabel ordinat dan absis dari simbol '&'
    public byte foodCount;                  //variabel jumlah makanan

    public void variableInitialisation() {
        this.area = new char[10][10];          //inisialisasi lebar area game sebesar 10 x 10 karakter (kata kunci "this" untuk merujuk instance variable di kelas ini. Gak usah dibingungi. Klo pun gak ada "this", tetep bisa dipanggil cuma "this" dipake biar baku aja)
        this.status = new boolean[10][10];     //inisialisasi lebar status simbol '@' untuk menandai apa suatu simbol '@' sudah dimakan atau belum
        this.x = 1;                             //inisialisasi lokasi simbol '&' di titik ordinat (sumbu x) 1
        this.y = 2;                             //inisialisasi lokasi simbol '&' di titik absis (sumbu y) 2
        this.foodCount = 2;                     //inisialisasi foodCount (jumlah makanan/simbol '@') sebanyak 2
    }

    public void checkingStatuses() {         //method checkingStatuses untuk mengecek lokasi simbol '&'
        if (this.y < 0 || this.area[x][y] == '#') {                  //seleksi kondisi untuk mengakhiri program ketika & menyentuh #
            System.out.println("GAME OVER! Anda menabrak tembok.");
            System.exit(0);                     //exit program
        }
        if (this.area[x][y] == '@' && this.status[x][y] == false) {     //seleksi kondisi untuk menghapus @ bila & bertemu @
            this.area[x][y] = '&';
            this.status[x][y] = true;
            this.foodCount--;
        }
    }

    public void direction() {            //method untuk menentukan arah
        char arah;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan arah simbol & [w (atas), s (bawah), a (kiri), d (kanan), q (keluar program)]: ");
        arah = in.next().charAt(0);
        if (arah == 'q' || arah == 'Q') {
            System.out.println("Terima kasih sudah bermain :)");
            System.exit(0);
        } else if (arah == 'w' || arah == 'W') {
            --this.x;
        } else if (arah == 's' || arah == 'S') {
            ++this.x;
        } else if (arah == 'a' || arah == 'A') {
            --this.y;
        } else if (arah == 'd' || arah == 'D') {
            ++this.y;
        } else {
            System.out.println("Masukkan karakter yang telah ditentukan sebelumnya.");
        }
    }

    public void gameArea(byte iteration) {
        this.checkingStatuses();            //memanggil instance method checkingStatuses()
        for (byte i = 0; i < 10; i++) {      //indeks pengendali baris (sumbu x)
            area[i][0] = '#';
            System.out.print(area[i][0]);
            if (i == 0 || i == 9) {           //indeks untuk mbkin batasan di paling atas dan paling bawah
                for (byte j = 0; j < 8; j++) { //indeks pengendali kolom
                    area[i][j] = '#';
                    System.out.print(area[i][j]);
                }
            }
            if (i != 0 && i != 9) {           //indeks untuk mbkin batasan di antara paling atas dan paling bawah
                for (byte j = 0; j < 7; j++) { //indeks pengendali kolom (sumbu y)
                    if (i == 2 && (j >= 0 && j < 2)) { //indeks untuk mbkin batasan di dalam area
                        while (j >= 0 && j < 2) {
                            area[i][j] = '#';
                            System.out.print(area[i][j]);
                            j++;
                        }
                    }
                    if (i == 2 && (j >= 4 && j <= 5)) { //indeks untuk mbkin batasan di dalam area
                        area[i][j] = '#';
                        System.out.print(area[i][j]);
                        j++;
                    }
                    if (i == 3 && (j >= 4 && j <= 5)) { //indeks untuk mbkin batasan di dalam area
                        area[i][j] = '#';
                        System.out.print(area[i][j]);
                        j++;
                    }
                    if (i == 1 && j == 3 && status[i][j] != true) { //indeks untuk mbkin "makanan" di dalam area
                        area[i][j] = '@';
                        System.out.print(area[i][j]);
                        j++;
                    }
                    if (i == 4 && j == 4 && status[i][j] != true) { //indeks untuk mbkin "makanan" di dalam area
                        area[i][j] = '@';
                        System.out.print(area[i][j]);
                        j++;
                    }
                    if (i == x && j == y) {             //indeks untuk mbkin simbol yang dikendalikan di dalam area
                        area[i][j] = '&';
                        System.out.print(area[i][j]);
                    } else {                              //indeks untuk mbkin whitespace/spasi
                        area[i][j] = ' ';
                        System.out.print(area[i][j]);
                    }
                }
                area[i][9] = '#';
                System.out.print(area[i][9]);
            }
            System.out.println();
        }
        if (this.foodCount == 0) {             //mengecek apakah semua makanan sudah dimakan     
            System.out.println("Selamat! semua '@' sudah termakan. \nTerima kasih sudah bermain :)");
            System.exit(0);
        }
        System.out.print("Kurang " + iteration + " kali lagi. ");
        this.direction();                   //memanggil instance method direction untuk menentukan arah
        System.out.println();
    }
}
