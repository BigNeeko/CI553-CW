package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class BetterBasket here.
 *
 * @author  Your Name
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable {
  private static final long serialVersionUID = 1L;

  @Override
  public boolean add(Product p1) {

    for (Product p2 : this) {
      if (p1.getProductNum().equals(p2.getProductNum())) {
        p2.setQuantity(p2.getQuantity() + p1.getQuantity());
        return (true);
      }
    }

    super.add(p1);
    return (true);
  }

  public boolean removeProduct(String productNum) {
    for (Product pr : this) {
      if (pr.getProductNum().equals(productNum)) {
        return super.remove(pr);
      }
    }
    return false;  // Product not found in the basket
  }




}
