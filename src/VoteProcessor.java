import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		int ps = 0;
		int es = 0;
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("pope francis")) {
				ps++;
			}
			else {
				es++;
			}
		}
		if(ps> es) {
		return "pope francis";}
		else if(ps== es) {
			return "TIE";
		}
		else {
			return "edward snowden";
		}
	}

}
