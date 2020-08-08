package com.learnProgramming.Arrays;

//There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
//You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1).
// You begin the journey with an empty tank at one of the gas stations.
//Return the starting gas station’s index if you can travel around the circuit once in the clockwise direction, otherwise return -1.
public class GasStationProblem {

    public static int minStartingGasStation(int[] gas, int[] cost){

        if(gas.length==0){
            return  -1;
        }
        if(gas.length==1){
            return gas[0]-cost[0]<0 ? -1:0;
        }

        int start=0;
        int end=1;
        int curr = gas[0]-cost[0];

        while (start!=end){
            while(curr<0 && start!=end){
                curr=curr-(gas[start]-cost[start]);
                start=(start+1)%gas.length;
                if(start==0){
                    return -1;
                }
            }
            curr+=gas[end]-cost[end];
            end=(end+1)%gas.length;
        }

        if(curr<0){
            return -1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] gas = {1,2};
        int[] cost = {2,1};
        System.out.println(minStartingGasStation(gas,cost));

    }
}
