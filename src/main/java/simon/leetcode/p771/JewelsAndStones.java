package simon.leetcode.p771;
/**
 * https://leetcode-cn.com/problems/jewels-and-stones/description/
 * @author lsm2333
 *
 */
public class JewelsAndStones {
	public static void main(String[] args){
		SolutionP771.numJewelsInStones("aA","aAAbbbb");
	}
}

class SolutionP771 {
    public static int numJewelsInStones(String J, String S) {
    	System.out.printf("jewels type:%s,stones:%s%n",J,S);
        if(J.length()>50 || S.length()>50){
            return 0;
        }
        int count = 0;
        for(char st: S.toCharArray()){
            if(isJewels(J,st)){
                count++;
            }
        }
        System.out.printf("count:%d",count);
        return count;
    }
    
    private static boolean isJewels(String J, char stone){
        return J.indexOf(stone)<0?false:true;
    }
}