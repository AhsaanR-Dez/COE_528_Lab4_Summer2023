/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author ahsaa
 */
public class FoodItem extends FoodComponent{
    String itemName;
    double itemPrice;
    public FoodItem(String itemName, double itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    @Override
    public double getPrice(){
        return this.itemPrice;
    }
    public String getFoodItem(){
        return this.itemName;
    }
    @Override
    public void print(int level){
        for(int i = 0; i < level; i++){
            System.out.print("\t");
        }
        System.out.println("Food Item: " + this.itemName + ", " + this.itemPrice);
    }
    public void add(FoodComponent fc){}
    public void remove(FoodComponent fc){}
}
