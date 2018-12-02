package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public int numUniqueEmails(String[] emails) {
		Set<String> ans = new HashSet<String>();

		for (String s : emails) {
			String[] ss = s.split("@");
			String name = ss[0].substring(0, ss[0].indexOf("+")).replaceAll(".", "");
			ans.add(name + ss[1]);
		}
		return ans.size();
	}
}
