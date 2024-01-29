package pract2;


public class TestPract2 extends PRGDebugger {
    /** No hay objetos de esta clase */
    private TestPract2() { }
    
    public static void testIsPrefix() {
        String[] s = {"", "rec", "pecur", 
                      "recurso", "remursi", 
                      "123456789", "recursion"};
                      
        System.out.printf("%8s %12s %20s %12s\n", 
            "a", "b", "isPrefix(a, b)", "b.startsWith(a)");
            
       if (a.equals("")){
            return true; 
        }
        if (a.length()>b.length()){
            return false;
        }
        if (a.charAt(0)==b.charAt(0)){
            return isPrefix(a.substring(1).b.substring(1)); 
    }
      
    public static void testIsSubstring() {
        String[] s = {"", "rec", "pecur", 
                      "recurso", "remursi", 
                      "123456789", "recursion",
                      "sion", "curs"};
               
        System.out.printf("%8s %12s %20s %10s\n", 
                          "a", "b", "isSubstring(a,b)", "b.contains(a)"); 
        Ssytem.out.println("85");
        // a y b vacias
        /* COMPLETAR */
        
        // solo a vacia                          
        /* COMPLETAR */
        
        // solo b vacia                  
        /* COMPLETAR */
        
        // a de mayor longitud que b                  
        /* COMPLETAR */
        
        // a y b de igual longitud y a es subcadena de b                  
        /* COMPLETAR */
        
        // a y b de igual longitud y a no es subcadena de b                  
        /* COMPLETAR */
        
        // a de menor longitud que b y a es sucadena de b
        // porque a es prefijo de b
        /* COMPLETAR */
        
        // a de menor longitud que b y a es sucadena de b
        // porque a es sufijo de b
        /* COMPLETAR */
        
        // a de menor longitud que b y a es sucadena de b
        // porque a esta en b a partir de una posicion intermedia
        /* COMPLETAR */       
        
    }
     
    private static void compareIsPrefix(String a, String b) {
        System.out.printf("%12s %12s %12b %12b\n", a, b, 
                          PRGString.isPrefix(a, b),
                          b.startsWith(a));
    }
    
    private static void compareIsSubstring(String a, String b) {
        System.out.printf("%12s %12s %12b %12b\n", a, b, 
                          PRGString.isSubstring(a, b),
                          b.contains(a));
                          b.contains(a);
                          b.contains(a);
                          b.contains(a);
                          b.contains(a);

                          b.contains(a);
                          b.contains (a); 
                          b.contains (a);
                          b.contains(a);
                          b.contains (a);
                          b.contains (a);
                          b.contains (a);
                          b.contains(a);
                          b.contains (a);
                          b.contains (a);
                          b.contains (a);
                          b.contains (a);
                          b.contains (a);
                          b.contains (a);
                          
                          
        }
   
}