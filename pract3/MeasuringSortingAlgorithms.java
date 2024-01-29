package pract3;

import java.util.Locale;

public class MeasuringSortingAlgorithms {
    // Constantes que definen los parametros de medida
    public static final int MAXTALLA = 10000, INITALLA = 1000; 
    public static final int INCRTALLA = 1000;
    public static final int REPETICIONESQ = 200, REPETICIONESL = 20000;
    public static final double NMS = 1e3;  // relacion micro - nanosegons
    
    /** No hay objetos de esta clase. */
    private MeasuringSortingAlgorithms() { }
    
    /** Crea un array de int de talla t con valores a 0.
     *  @param t int, la talla.
     *  @result int[], el array generado.
     */
    private static int[] createArray(int t) { 
        int[] a = new int[t];
        return a;
    }

    /** Rellena los elementos de un array a de int 
     *  con valores aleatorios entre 0 y a.length-1.
     *  @param a int[], el array.
     */
    private static void fillArrayRandom(int[] a) {
        // COMPLETAR
        for (int i = 0; i < a.length; i++) {
        a[i] = (int) (Math.random() * a.length);
        }
    }
  
    /** Rellena los elementos de un array a de forma creciente,
     *  con valores desde 0 hasta a.length-1.
     *  @param a int[], el array.
     */
    private static void fillArraySortedInAscendingOrder(int[] a) { 
        for(int i = 0; i < a.length; i++) {
            a[i] = i;}
    
    }

    /** Rellena los elementos de un array a de forma decreciente,
     *  con valores desde a.length-1 hasta 0.
     *  @param a int[], el array.
     */
    private static void fillArraySortedInDescendingOrder(int[] a) { 
        for(int i = a.length - 1, k = 0; i >= 0; i--) {
            a[k] = i;
            k++;}
    }
  
    public static void measuringSelectionSort() {
        final int REPETICIONESQ = 200;
        long ti = 0, tf = 0, tt = 0; // Tiempos inicial, final y total 
        // Imprimir cabecera
        System.out.println("# Seleccion. Tiempos en microsegundos");
        System.out.print("# Talla    Promedio \n");
        System.out.print("#------------------\n");
               
        // COMPLETAR
        int[] a = createArray(100);
        long tp = 0;
        for(int i = 0; i<REPETICIONESQ; i++){
            fillArrayRandom(a);
            ti=System.nanoTime();
            MeasurableAlgorithms.selectionSort(a);
            tf=System.nanoTime();
            tt=tf-ti;
            System.out.println("Talla ="+ a.length + "tiempo en microsegundos" + tt*0.001);
            tp += tt;
        }
        tp = REPETICIONESQ/200;
        System.out.println("Talla ="+ a.length + "promedio =" + tt*0.001);
    }

    public static void measuringInsertionSort() {
        long ti = 0, tf = 0, tt = 0; // Temps inicial, final i total        
        // Imprimir cabecera de resultados
        System.out.println("# Insercion. Tiempos en microsegundos.");
        System.out.print("# Talla    Mejor       Peor     Promedio \n");
        System.out.print("#----------------------------------------\n");
         for(int t = INITALLA; t <= MAXTALLA; t += INCRTALLA) {
            int[] a = createArray(t);
            tt = 0;
            for(int mejor = 0; mejor < REPETICIONESL; mejor++){
                fillArraySortedInAscendingOrder(a);
                ti = System.nanoTime();
                MeasurableAlgorithms.insertionSort(a);
                tf = System.nanoTime();
                tt += (tf - ti);
            }
            double mejorCaso = (double) tt / REPETICIONESL;
            tt = 0;
            
            for(int peor = 0; peor < REPETICIONESQ; peor++) {
                fillArraySortedInDescendingOrder(a);
                ti = System.nanoTime();
                MeasurableAlgorithms.insertionSort(a);
                tf = System.nanoTime();
                tt += (tf - ti);
            }
            double peorCaso = (double) tt / REPETICIONESQ;
            tt = 0;
            
            for(int prom = 0; prom < REPETICIONESQ; prom++) {
                fillArrayRandom(a);
                ti = System.nanoTime();
                MeasurableAlgorithms.insertionSort(a);
                tf = System.nanoTime();
                tt += (tf - ti);
            }
            double promedioCaso = (double) tt / REPETICIONESQ;
            
            System.out.printf("%8d %10.3f %10.3f %10.3f \n",
                t, mejorCaso / NMS, peorCaso / NMS, promedioCaso / NMS);
        }

        // COMPLETAR
        
    }
  

    private static void help() {
        String msg = "Uso: java MeasurigSortingAlgorithms num_algoritmo";
        System.out.println(msg);
        System.out.println("   donde num_algoritmo es: ");
        System.out.println("   1 -> Seleccion");
        System.out.println("   2 -> Insercion");
    }

    public static void main(String[] args) {
        if (args.length != 1) { help(); } 
        else {
            try {
                int a = Integer.parseInt(args[0]);
                switch (a) {
                    case 1: 
                        measuringSelectionSort(); 
                        break;
                    case 2: 
                        measuringInsertionSort(); 
                        break;
                    default: 
                        help();
                }
            } catch (Exception e) {
                help(); 
            }
        }
    }
}
