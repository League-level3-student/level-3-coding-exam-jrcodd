
import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int total = 0;
		for (String key : hashmap1.keySet()) {
			if (hashmap2.containsKey(key)) {
					if (hashmap2.containsValue(hashmap1.get(key))) {
						total++;
					}
				}
			}

		return total;
	}

}
