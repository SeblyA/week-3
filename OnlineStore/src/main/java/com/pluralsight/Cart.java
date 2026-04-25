package com.pluralsight;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    private List<Product> items = new ArrayList<>();
    public void addProduct(Product product) {
        if (product == null)
            throw new IllegalArgumentException("Product cannot be null.");
    items.add(product);
}
public void removeProdcut(Product product){
    items.remove(product);
}
public List<Product>getItems(){
    return Collections.unmodifiableList(items);
}
public int getItemCount() {
    return items.size();
}
/**
 * Checks whether the cart is empty.
 *
 * @return true if the cart is empty, otherwise false
 */
public boolean isEmpty() {
    return items.isEmpty();
}

/**
 * Removes all products from the cart.
 */
public void clear() {
    items.clear();
}

/**
 * Calculates the total price of all products in the cart.
 *
 * @return the total price
 */
public double getTotalPrice() {
    double total = 0;

    for (Product product : items) {
        total += product.getPrice();
    }

    return total;
}
}


