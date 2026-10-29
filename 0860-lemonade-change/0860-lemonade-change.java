class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                map.put(5,map.getOrDefault(5,0)+1);
            }
            else{
                map.put(bills[i],map.getOrDefault(bills[i],0)+1);
                if(bills[i]==10){
                    if(map.containsKey(5)){
                        if(map.get(5)==1){
                            map.remove(5);
                        }
                        else{
                            map.put(5,map.get(5)-1);
                        }
                    }
                    else return false;
                }
                else{
                    if(map.containsKey(10) && map.containsKey(5)){
                        if(map.get(10)==1){
                            map.remove(10);
                        }
                        else{
                            map.put(10,map.get(10)-1);
                        }
                        if(map.get(5)==1){
                            map.remove(5);
                        }
                        else {
                        map.put(5,map.get(5)-1);
                        }
                    }
                    else if(map.containsKey(5)){
                        if(map.get(5)<3){
                            return false;
                        }
                        else if(map.get(5)==3){
                            map.remove(5);
                        }
                        else{
                            map.put(5,map.get(5)-3);
                        }
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}