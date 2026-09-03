import java.util.Scanner;

public class Cuadricula {
    private int x; // COLUMNAS
    private int y; // FILAS
    char relleno = '●';
    char vacio = '◯';
    char[][] cuadricula_vacia;

    public Cuadricula(int y, int x) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() { return this.y; }

    public void setX(int x) { this.x = x; }

    public void setY(int y) { this.y = y; }

    public void inicializar(int y, int x) {
        cuadricula_vacia = new char[y][x];
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                cuadricula_vacia[i][j] = vacio;
            }
        }
    }

    public void imprimir() {
        System.out.println("Cuadricula (" + x + " x " + y + ")");
        for(int i = 0; i < cuadricula_vacia.length; i++){
            for(int j = 0; j < cuadricula_vacia[i].length; j++) {
                System.out.print(" " + cuadricula_vacia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void rellenar_casillas() {
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("¿Cuantas casillas desea rellenar?");
            n = sc.nextInt();
            sc.nextLine();
            System.out.println();
        }while(n < 0);

        for(int i = 0; i < n; i++){
            do{
                System.out.println("Digite la fila " + (i+1) + " que desea rellenar");
                y = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite la columna " + (i+1) + " que desea rellenar");
                x = sc.nextInt();
                sc.nextLine();
                System.out.println();

                if (y < 0 || x < 0 || x >= cuadricula_vacia.length || y >= cuadricula_vacia.length){
                    System.out.println("ERROR");
                    System.out.println("Coordenada fuera de rango");
                    System.out.println();
                }
            }while(y < 0 || x < 0 || x >= cuadricula_vacia.length || y >= cuadricula_vacia.length);
            cuadricula_vacia[y][x] = relleno;
        }

        for(int i = 0; i < cuadricula_vacia.length; i++){
            for(int j = 0; j < cuadricula_vacia[i].length; j++) {
                System.out.print(" " + cuadricula_vacia[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void reiniciar_cuadricula(){
        System.out.println("Reiniciando cuadricula...");
        for(int i = 0; i < cuadricula_vacia.length; i++){
            for(int j = 0; j < cuadricula_vacia[i].length; j++) {
                cuadricula_vacia[i][j] = vacio;
                System.out.print(" " + cuadricula_vacia[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Cuadricula reiniciada");
        System.out.println();

    }
}