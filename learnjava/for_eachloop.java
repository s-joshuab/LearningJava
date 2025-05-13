package learnjava;

public class for_eachloop {
    
    public static void main(String[] args) {
        
    String[] names = {"Taro", "Nagumo", "Shiba", "Shin"};

    for(String name : names){
        if(name.equalsIgnoreCase("Nagumo")){
        System.out.println("We found " + name);
        break;
        }
    }

    }
}
