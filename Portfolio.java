import java.util.ArrayList;

/**
 * Write a description of class Portfolio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Portfolio
{
    ArrayList<StockHolding> stocks;
    private double lifeTimeInv;
    private double lifeTimePayout;

    public Portfolio(){
        ArrayList<StockHolding> stocks = new ArrayList<StockHolding>();
        this.lifeTimeInv=0;
        this.lifeTimePayout=0;
    }   

    public double getLiftTimeInv(){
        return lifeTimeInv;
    }

    public double getLifeTimePayout(){
        return lifeTimePayout;
    }

    private int getIndex(String symbol){
        for(int i = 0; i<stocks.size(); i++){
            if(stocks.get(i).getSymbol().equals( symbol)){
                return i;
            }
        }
        return -1;
    }

    public double buyStock(String symbol,String name,int numShares, double price){
        int index = getIndex(symbol);
        if(index != -1){
            stocks.get(index).buyShares(numShares, price);
        }else{
            stocks.add(new StockHolding(symbol,name, numShares, price));
        }
        this.lifeTimePayout++;
        
        return "num shares: " + stocks.get(index).getNumShares() + "\n" + "Price: " + stocks.get(index).getPrice();

    }
    
    public double sellStock(String symbol,int numShares){
        
    }
    
    public double getCurrentValue(){
        double portfolio;
        for(int i = 0; i<stocks.size(); i++){
            portfolio += stocks.get(i).getNumShares() * stocks.get(i).getPrice();
        }
        return portfolio;
    }

    @Override
    public String toString()
    {
        //DO NOT EDIT THIS METHOD.
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%6s%25s%10s%15s%15s%n", 
                "Symbol", "Name", "Shares", "@Price", "Total"));
        sb.append("-----------------------------------------------------------------------\n");

        for(StockHolding s : stocks){
            sb.append(s.toString());
        }
        return sb.toString();
    }
}
