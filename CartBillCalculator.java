package mypack;

enum CustomerType
{
    regular, premium;
}
public class CartBillCalculator {
    
    public static void main (String[] args) {
    
        System.out.println ("Customer shopping cart bill :"+bill (5000, CustomerType.regular));
        System.out.println ("Customer shopping cart bill :"+bill (8000, CustomerType.regular));
        System.out.println ("Customer shopping cart bill :"+bill (10000, CustomerType.regular));
        System.out.println ("Customer shopping cart bill :"+bill (15000, CustomerType.regular));
        System.out.println ("Customer shopping cart bill :"+bill (4000, CustomerType.premium));
        System.out.println ("Customer shopping cart bill :"+bill (8000, CustomerType.premium));
        System.out.println ("Customer shopping cart bill :"+bill (12000, CustomerType.premium));
        System.out.println ("Customer shopping cart bill :"+bill (20000, CustomerType.premium));
    
    }
    
    private static int bill (int purchaseAmount, CustomerType customerType) {
        int discountedBill = 0;
        int discount = 0;
    
        if (customerType.equals (CustomerType.regular)) { //customerType == "regular"
            if (purchaseAmount < 5000) {
                return 0;
            }
            else if(purchaseAmount > 5000 && purchaseAmount <= 10000) {
                discount = ((purchaseAmount - 5000)*10)/100 ;
            }
            else if (purchaseAmount > 10000 ) {
                discount = ((purchaseAmount - 10000)*20)/100 ;
                discount = discount + 500; //adding slab discount
            }
        } else if (customerType.equals (CustomerType.premium)) {
            if (purchaseAmount <= 4000) {
                discount = (purchaseAmount* 10)/100;
            }
            else if (purchaseAmount > 4000 && purchaseAmount <= 8000) {
                discount = ((purchaseAmount - 4000)*15)/100 ;
                discount = discount + 400;//adding slabs discount
            }
            else if (purchaseAmount > 8000 && purchaseAmount <= 12000) {
                discount = ((purchaseAmount - 8000)*20)/100 ;
                discount = discount + 1000;//adding slabs discount
            }
            else if (purchaseAmount > 12000 ) {
                discount = ((purchaseAmount - 12000)*30)/100 ;
                discount = discount + 1800;//adding slabs discount
            }
        }
            discountedBill = purchaseAmount - discount;
    
        return discountedBill;
    }
}


