/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ahsaa
 */
public class FoodCategory extends FoodComponent {
    String foodCategory;
    private List<FoodComponent> foodItems;
    public FoodCategory(String foodCategory){
        this.foodCategory = foodCategory;
        this.foodItems = new ArrayList<>();
    }
    public String getFoodCategory(){
        return this.foodCategory;
    }
    @Override
    public double getPrice(){
        double sumOfPrices = 0;
        for(FoodComponent fc:foodItems){
            sumOfPrices += fc.getPrice();
        }
        return sumOfPrices;
    }
    @Override
    public void print(int level){
        for(int i = 0; i < level; i++){
            System.out.print("\tt");
        }
        System.out.println("Food Category (" + getFoodCategory() + ", " + getPrice() + ") " + "contains:");
        for(FoodComponent fc:foodItems){
            fc.print(level+1);
        }
    }
    public void add(FoodComponent fc){
        foodItems.add(fc);
    }
    public void remove(FoodComponent fc){
        foodItems.remove(fc);
    }
}
