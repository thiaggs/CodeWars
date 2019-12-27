package CodeWarsStyleRankingSystem;

public class User {
	public int rank;
	public int progress;

	public User() {
		this.rank = -7;
		this.progress = 0;

	}

	public void incProgress(int actiRank) {
		int difRank;

		if( ((rank > 0 ) && (actiRank < 0 )) || ((rank < 0) && (actiRank > 0)) ) {
			if(rank > actiRank)
				difRank = (actiRank - rank) + 1;
			else
				difRank = (actiRank - rank) - 1;
		}else {
			difRank = actiRank - rank;
		}
		
		
		
		if (difRank <= -2) {
			System.out.println("Activity rank is to low");

		} else if (difRank == -1) {
			this.attProgress(1);

		} else if (difRank == 0) {
			this.attProgress(3);

		} else {
			int j = 10 * difRank * difRank;
			this.attProgress(j);

		}
		
		System.out.println("Rank atual: " + rank + " Progressão atual: " + progress);

	}

	private void attProgress(int increase) { 

		progress += increase;

		while (progress >= 100) {
			if(rank >= 8) {
				System.out.println("ERROR: Rank máximo atingido");
				break;
			}
			progress -= 100;
			rank++;

		}

	}

}
