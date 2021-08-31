public class Order {
    public static final int MAX = 10;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX];

    public Order() { }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX) {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("Add disc successfully!");
        } else {
            System.out.println("Error! The order is already full!");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(disc.getTitle().equals(itemsOrdered[i].getTitle())) {
                for(int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                System.out.println("Delete successfully!");
                return;
            }
        }
        System.out.println("Error! Disc is not exist!");
    }

    public float totalCost() {
        float total = 0.0f;
        for(DigitalVideoDisc d : itemsOrdered) {
            total += d.getCost();
        }
        return total;
    }

    public DigitalVideoDisc findDisc(String title) {
        DigitalVideoDisc disc = new DigitalVideoDisc();
        return disc;
    }
}
