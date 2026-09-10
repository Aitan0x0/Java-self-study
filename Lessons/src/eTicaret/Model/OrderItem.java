package eTicaret.Model;

public class OrderItem {

    private Product product;
    private int quantity;


    ///orderItemin  qiymeti
    public double getOrderItemsTotal(){
        return product.getPrice()*quantity;

    }

    //konstruktor
    public OrderItem(Product product , int quantity){
        if(product == null)
            throw new NullPointerException("Bele Product yoxdur");
        this.product = product;
        if(product.getQuantity()<quantity || quantity<=0)
            throw new IllegalArgumentException("Say duzgun daxil edilmeyib. Stokda product sayi:"+ product.getQuantity());
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}
