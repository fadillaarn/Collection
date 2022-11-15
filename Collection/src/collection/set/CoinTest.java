/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.set;

import java.util.HashSet;

/**
 *
 * @author fadillarizky
 */
public class CoinTest {
    public static void main(String[] args) {
        HashSet<Coin> bagOfCoins = new HashSet<Coin>();
        
        Coin coin1 = new Coin(1);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        Coin coin50 = new Coin(50);
        
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin50);
        displayBagContents(bagOfCoins);
        findCoin(bagOfCoins, coin10);
        findCoin(bagOfCoins, coin5);
        
        displayBagDetails(bagOfCoins);
        bagOfCoins.clear();
        displayBagDetails(bagOfCoins);
    }
    
    static void findCoin(HashSet<Coin> bagOfCoins, Coin coin) {
        if(bagOfCoins.contains(coin))
            System.out.println("Ini adalah sebuah koin " + coin.getDenomination() + " di dalam dompet");
        else
            System.out.println("Tidak ada koin " + coin.getDenomination() + " di dalam dompet");
    }
    
    static void displayBagContents(HashSet<Coin> bagOfCoins) {  
    }

    private static void displayBagDetails(HashSet<Coin> bagOfCoins) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
