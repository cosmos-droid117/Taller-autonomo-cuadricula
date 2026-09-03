import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuadricula cuadro_vacio = new Cuadricula(0, 0);
        int filas;
        int columnas;
        int opcion = 0;

        while(opcion != 5){
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Definir tamaño e imprimir cuadricula");
        System.out.println("2. Elegir que coodenadas rellenar");
        System.out.println("3. Reiniciar cuadricula");
        System.out.println("4. Mostrar coordenadas seleccionadas");
        System.out.println("5. Salir");
        System.out.println();

        System.out.println("Seleccione una opcion");
        opcion = sc.nextInt();
        sc.nextLine();
        System.out.println();

            switch(opcion){
                case 1:
                    do{
                        System.out.println("Introduzca la cantidad de filas");
                        filas = sc.nextInt();
                        sc.nextLine();
                        cuadro_vacio.setY(filas);

                        System.out.println("Introduzca la cantidad de columnas");
                        columnas = sc.nextInt();
                        sc.nextLine();
                        cuadro_vacio.setX(columnas);
                        System.out.println();

                        if (filas < 0 || columnas < 0){
                            System.out.println("ERROR: No ingresar datos negativos");
                            System.out.println("Vuelva a intentarlo");
                            System.out.println();
                        }

                    }while(filas < 0 || columnas < 0);

                    cuadro_vacio = new Cuadricula(filas, columnas);

                    cuadro_vacio.inicializar(cuadro_vacio.getY(), cuadro_vacio.getX());
                    cuadro_vacio.imprimir();
                    System.out.println();
                    break;

                case 2:
                    if (cuadro_vacio.cuadricula_vacia == null) {
                        System.out.println("ERROR: Primero debe crear la cuadricula (opcion 1)");
                        System.out.println();
                        break;
                    }
                    cuadro_vacio.rellenar_casillas();

                    break;

                case 3:
                    if (cuadro_vacio.cuadricula_vacia == null) {
                        System.out.println("ERROR: Primero debe crear la cuadricula (opcion 1)");
                        System.out.println();
                        break;
                    }

                    cuadro_vacio.reiniciar_cuadricula();
                    break;

                case 4:
                    if (cuadro_vacio.cuadricula_vacia == null) {
                        System.out.println("ERROR: Primero debe crear la cuadricula (opcion 1)");
                        System.out.println();
                        break;
                    }

                    cuadro_vacio.mostrar_coordenadas_seleccionadas();
                    break;
                default:
                    if(opcion > 5 || opcion < 0) {
                        System.out.println("ERROR: Opcion incorrecta");
                        System.out.println("Vuelva a intentarlo");
                        System.out.println();
                        break;
                }
            }
        }
    }
}
