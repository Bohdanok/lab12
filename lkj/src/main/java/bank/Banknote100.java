package bank;

import lombok.NoArgsConstructor;

public class Banknote100 extends Banknote {
    private Banknote nextItem;

    public Banknote100(Banknote nextItem) {
        super(nextItem, 100);
    }

    public Banknote100() {
        super(100);
    }

    // @Override
    // public void process(int amount) {
    //     int quantity = amount / 100;
    //     System.out.println(quantity);
    //     nextItem.process(amount % 100);
    // }
}
