public class Product<T, U> {
    T item;
    U price;

    public void setItem(T item, U price){
        this.item = item;
        this.price = price;
    }

    public void setPrice(U price){
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }
}
