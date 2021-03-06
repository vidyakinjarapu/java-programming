
/**
 *
 * @author vidya
 */
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingradients;
    
    public Recipe(String name, int time, ArrayList<String> ingradients){
        this.name = name;
        this.time = time;
        this.ingradients = ingradients;
    }
    
    public int getTime(){
        return this.time;
    }
    
    public String getRecipe(){
        return this.name;
    }
    
    public boolean searchIngradient(String ing){
        if(this.ingradients.contains(ing)){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}
