package com.learnProgramming.DynamicProgramming;

//Say you have an array for which the ith element is the price of a given stock on day i.
//If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
// design an algorithm to find the maximum profit.
//Note that you cannot sell a stock before you buy one.
public class BuySellStock {

    public static int maxProfit(int[] prices) {

        //Double for loop
        /*int max = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit = prices[j]-prices[i];
                if(profit>max){
                    max = profit;
                }
            }
        }

        return max;*/

        //Single for loop
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            if(prices[i]-minPrice > maxProfit){
                maxProfit = prices[i]-minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
