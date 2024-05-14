public class day3 {
       static String sw_name;
       static float sw_price;
       static void set(String n, float p)
       {
        sw_name =  n; 
        sw_price = p;
        }
       static void get()    
       {
        System.out.println("software name is sw_name + sw_price");

       }  
       public static void main(String[] args)
       {
        day3.set("visual studio",0.0f);
        day3.get();
       }
    }
