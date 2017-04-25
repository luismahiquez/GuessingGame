import java.util.Random;

public class Jar {
    private String itemName;
    private int maxNumberOfItems;

    public Jar(String itemName, int maxNumberOfItems) {
        this.itemName = itemName;
        this.maxNumberOfItems = maxNumberOfItems;
    }
    
    public Jar() {}

    public int fillJar() {
        Random random = new Random();
        int itemsInJar = random.nextInt(maxNumberOfItems)+1;
        return itemsInJar;
    }
    
    public String getItemName() {
        return itemName;
    }

    public int getMaxNumberOfItems() {
        return maxNumberOfItems;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setMaxNumberOfItems(int maxNumberOfItems) {
        this.maxNumberOfItems = maxNumberOfItems;
    }
    
    
}