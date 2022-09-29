class Solution12 {
    public long solution12(int price, int money, int count) {
        long answer;

        int totalPrice = 0;

        int changedPrice;


        for(int i=1; i<count+1; i++){
            changedPrice = i * price;
            totalPrice += changedPrice;
        }

        if(totalPrice - money > 0){
            answer = totalPrice - money;
        }

        else answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Solution12 shortage = new Solution12();
        int money = 20;
        int count = 4;
        int price = 3;
        System.out.println(shortage.solution12(price,money,count));
    }
}