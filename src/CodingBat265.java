/*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..)
        have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
        because they each have a raised foot. Recursively return the number of "ears"
        in the bunny line 1, 2, ... n (without loops or multiplication).
        bunnyEars2(0) → 0
        bunnyEars2(1) → 2
        bunnyEars2(2) → 5*/
public class CodingBat265 {
    public int bunnyEars2(int bunnies) {
        int result;
        if(bunnies == 0){
            result =  0;
        } else if(bunnies%2==0){
            result = bunnyEars2(bunnies-1)+3;
        } else  result = bunnyEars2(bunnies-1)+2;
        return result;
    }

}
