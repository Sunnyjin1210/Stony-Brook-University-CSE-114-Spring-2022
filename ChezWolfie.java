//Sunny Jin 114452827
public class ChezWolfie {
    public static double cafe_day(int[][] orders){
        double sum = 0;

        for(int row = 0; row < orders.length; row++){
            if(orders[row].length == 4){
                sum += total(orders, row); 
            }

            }
        return sum;      
        }

    public static double total(int[][] orders, int row){
        int drinkLarge = orders[row][1], drinkMedium = orders[row][2], drinkSmall = orders[row][3];
        double l = 3.5, m = 2.5, s = 1.25;
        int membership = orders[row][0];


        if(membership == 2 ){
            if(drinkLarge >= 3 || drinkMedium >= 4){
                if(drinkSmall < 3){
                    drinkSmall = 0;
                }else{
                    drinkSmall = drinkSmall - 3;
                }
            }
            return (double) l * drinkLarge + m * drinkMedium + s * drinkSmall;

        }else if(membership == 1){
            if(drinkLarge + drinkMedium + drinkSmall >= 10){
                return (double) (l * drinkLarge + m * drinkMedium + s * drinkSmall) * 0.8;
            }else{
                return (double) l * drinkLarge + m * drinkMedium + s * drinkSmall;
            }
        }else if(membership == 0){
            return (double)(l * drinkLarge + m * drinkMedium + s * drinkSmall) * 0.98;
        }else{
            return 0;
        }
    }

    public static void main(String[] args){
        double case1 = cafe_day(new int[][]{{5, 1, 2, 3}, {2, 5, 0, 4}, {1, 4, 4, 2}});//39.95
        double case2 = cafe_day(new int[][]{{1, 4, 3, 2}, {0, 0, 0, 10}, {2, 1, 4, 3}});//49.75
        System.out.print(case2);
        
    }

    }

/*
2. (15 points) ChezWolfie.java: Write a function cafe_day(orders) which takes one argument, orders, which is a double dimensional array of int drink orders for the day at a cafe. The array orders contains one or more sub-arrays, in which each sub-array represents a particular drink order. In each sub-array, there are four elements, in this order:
An integer that indicates the customer’s membership, which will be one of these three categories: 
Platinum membership is represented by the number 2
Gold membership is represented by the number 1
Silver membership is represented by the number 0
An integer that represents the number of large drinks for the particular order.
An integer that represents the number of medium drinks for the particular order. 
An integer that represents the number of small drinks for the particular order.
Your function should process all orders, then return a floating-point number that represents the revenue generated for the day in dollars. Don’t round the return value! The prices for different sizes are as follows:
Drink Size Price
Large $3.50
Medium $2.50 
Small $1.25   
Platinum: If the customer purchases 3 or more large drinks, OR 4 or more medium drinks, then he/she gets at most 3 free small drinks.
Gold: If the customer purchases at least 10 drinks (in any combination of small, medium and large), then he/she gets a 20% discount.
Silver: The customer receives 2% off of total price regardless of number of drinks ordered.
Invalid values: Your function should be able to handle invalid values outlined below. In these cases, skip the entire drink order and continue to the next one. Valid drink orders have the following characteristics:
Each sub-list has exactly four values.
The first element in the sub-list, which is the membership, is one of the three ints 2, 1 or 0 (all lowercase letters are invalid).
The number of drinks for all three sizes is greater than or equal to zero.
If the orders list is empty, the function should simply return 0.0.
Examples
cafe_day(new int[][]{{5, 1, 2, 3}, {2, 5, 0, 4}, {1, 4, 4, 2}}) 
39.95
because:
{5, 1, 2, 3}, is invalid because membership cannot be 5
{2, 5, 0, 4} is platinum,  purchases 3 or more large drinks, so  he/she gets at most 3 free small drinks
5 *  $3.50 + 1 *  $1.25 = $18.75
{1, 4, 4, 2}}) is Gold membershis,  purchases 10 drinks, so he/she gets a 20% discount.
(4 *  $3.50 + 4 *  $2.50 + 2 *    $1.25) * 80% = 21.2 US$
$18.75 + $ 21.2 = $39.95
   
cafe_day(new int[][]{{1, 4, 3, 2}, {0, 0, 0, 10}, {2, 1, 4, 3}})
49.75
because:
{1, 4, 3, 2}, is gold, but not 10 drinks, so no 20% off
(4 * $3.50 + 3 * $2.50 + 2 *  $1.25) * 100% = $24
{0, 0, 0, 10}, is silver, so 2% off
(10 * $1.25) * 98% = 12.25 US
{2, 1, 4, 3}  is platinum, 4 medium drinks, so he/she gets at most 3 free small drinks
(1 * $3.50 + 4 * $2.50) = 13.5
24 + 12.25 +  13.5 = 49.75
Total: 30 points
*/