package bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor @Getter
public abstract class Banknote {
    private Banknote nextItem;
    private int nominalle;
    public void process(int amount) {
        int quantity = amount / nominalle;
        int rest = amount % nominalle;
        if (nextItem != null) {
            nextItem.process(rest);
        } else {
            if (rest != 0) {
                throw new IllegalAccessError();
            }
        }
        System.out.println(quantity);
        
    }

    public Banknote(int nominalle) {
        this.nextItem = null;
    }
}