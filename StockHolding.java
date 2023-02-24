/**
 * Constuctor of the Stock object that holds the name, symbol, number of shares held, and the price of each share.
 *
 * @author (Joe Perito)
 * @version (2/22/2023)
 */
public class StockHolding
{
    private String symbol;
    private String name;
    private int numShares;
    private double price;
    /**
     * Constuctor of the ShockHolding Object.
     * takes in 4 parameters.
     * 
     * @param symbol the symbol that identifies the stock.
     * @param Name the name of the stock.
     * @param numShares the number of shares within the stock at the time.
     * @param price the price of each stock.
     */
    public StockHolding(String symbol,String name,int numShares, double price){
        this.symbol = symbol;
        this.name = name;
        this.numShares = numShares;
        this.price = price;
    }
    
    /**
     * returns the Symbol
     */
    public String getSymbol(){
        return symbol;
    }
    
    /**
     * returns the name
     */
    public String getName(){
        return name;
    }
    
    /**
     * returns the number of shares
     */
    public int getNumShares(){
        return numShares;
    }
    
    /**
     * returns the price of each stock.
     */
    public double getPrice(){
        return price;
    }
    
    /**
     * 
     */
    public void buyShares(int numShares, double price){
        this.numShares += numShares;
        this.price = price;
    }
    
    /**
     * 
     */
    public double sellShares(int sellShares, double price){
        if(numShares>=sellShares){
            this.numShares = numShares - sellShares;
            return sellShares*price;
        }
        return 0; 
    }
    
    @Override
    public String toString()
    {
        //DO NOT EDIT THIS METHOD.
        
        return String.format("%6s%25s%,10d  $%,12.2f  $%,12.2f%n",symbol, name, numShares, price, numShares * price); 
    }
}
