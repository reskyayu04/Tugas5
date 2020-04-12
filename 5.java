import java.util.Vector;

class DemoVector { 
    public static void main (String[] args){
        Vector<Integer> deret = new Vector<Integer>();

        System.out.println("Panjang deret awal: "+deret.size());

        for (int i = 0; i < 10; i++){
            deret.add(i * 10);
        }

        System.out.println("\nPanjang deret setelah ditambah elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }

        System.out.println("\nMemeriksa apakah vector kosong: ");
        System.out.println(deret.isEmpty());    

        System.out.println("\nMencari indeks dari suatu nilai di dalam vector: ");
        System.out.println(deret.indexOf(60));  
        System.out.println(deret.indexOf(70));  
        System.out.println(deret.indexOf(80));  

        System.out.println("\nMemeriksa keberadaan suatu nilai di dalam vector: ");
        System.out.println(deret.contains(60)); 
        System.out.println(deret.contains(70)); 
        System.out.println(deret.contains(80)); 

        System.out.println("\nMencari elemen pertama dan terakhir di dalam vector: ");
        System.out.println(deret.firstElement());   
        System.out.println(deret.lastElement());    

        System.out.println("\nUpdate suatu nilai di dalam vector: ");
        deret.set(6, 600);  
        deret.set(7, 700);  
        deret.set(8, 800);  

        System.out.println(deret.get(6));   
        System.out.println(deret.get(7));   
        System.out.println(deret.get(8));   

        System.out.println("\nMenghapus suatu nilai di dalam vector... ");
        deret.remove(6);    
        deret.remove(6);    
        deret.remove(6);    

        System.out.println("\nPanjang deret setelah menghapus beberapa elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }

        System.out.println("\nMenyisipkan suatu nilai di dalam vector... ");
        deret.insertElementAt( 35005, 3 );

        System.out.println("\nPanjang deret setelah menyisipkan elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }
    }
}
Sekarang kita coba eksekusi source code diatas di konsol:
$ javac DemoVector.java
$ java DemoVector

Panjang deret awal: 0

Panjang deret setelah ditambah elemen: 10
elemen ke - 0 : 0
elemen ke - 1 : 10
elemen ke - 2 : 20
elemen ke - 3 : 30
elemen ke - 4 : 40
elemen ke - 5 : 50
elemen ke - 6 : 60
elemen ke - 7 : 70
elemen ke - 8 : 80
elemen ke - 9 : 90

Memeriksa apakah vector kosong: 
false

Mencari indeks dari suatu nilai di dalam vector: 
6
7
8
