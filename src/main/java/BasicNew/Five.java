package BasicNew;

public class Five{

    public static void main(String[] args) {
        boolean fast = true;
        int i = 0;
        while (fast){
          if (i==0){
            System.out.println("go fast");
                fast = false;
          }else{
              System.out.println("go slow");
          }
          i++;
        }
    }
}


