package simon.leetcode.p811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/subdomain-visit-count/description/
 * @author lsm2333
 *
 */
public class SubdomainVisitCount {
	public static void main(String[] args){
		SolutionP811.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
	}
}

class SolutionP811 {
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<String>();
        Map<String, Integer> resultM = new HashMap<String, Integer>();
        for (String domains : cpdomains) {
            String[] countDm = domains.split(" ");
            if (countDm.length > 1) {
                putKey(resultM, countDm[1], countDm[0]);
                String[] dm = countDm[1].split("\\.");
                if (dm.length == 2) {
                    putKey(resultM, dm[1], countDm[0]);
                } else if (dm.length == 3) {
                    putKey(resultM, dm[1] + "." + dm[2], countDm[0]);
                    putKey(resultM, dm[2], countDm[0]);
                } else {
                    //throw new Exception("");
                }
            }
        }
        for (String key : resultM.keySet()) {
            result.add(resultM.get(key) + " " + key);
            System.out.println(resultM.get(key) + " " + key);
        }
        return result;
    }

    private static void putKey(Map<String, Integer> resultM, String key, String val) {
        if (resultM.containsKey(key)) {
            resultM.put(key, resultM.get(key) + Integer.parseInt(val));
        } else {
            resultM.put(key, Integer.parseInt(val));
        }
    }

}