package practise;


	public class Player_Problem {

		public static void main(String[] args) {
			
			Bman batsman = new Bman("Dhoni", 1122, 4, 8, 23, 28, 612);
			System.out.println("BatsmanId:"+batsman.getId());
			System.out.println("BatsmanName:"+batsman.getName());
			System.out.println("BatsmanRunsScored:"+batsman.getRunsScored());
			System.out.println("BatsmanCenturies:"+batsman.getCenturies());
			System.out.println("BatsmanhalfCenturies:"+batsman.getHalfCenturies());
			System.out.println("BatsmanFours:"+batsman.getFours());
			System.out.println("BatsmanSixes:"+batsman.getSixes());
			System.out.println("BatsmanbBallsFaced:"+batsman.getBallsFaced());
			System.out.println();
			Bowler bowler = new Bowler("Ravindra Jadeja", 234, 178, 25);
			System.out.println("BowlerId:"+bowler.getId());
			System.out.println("BowlerName:"+bowler.getName());
			System.out.println("BowlerBallsBowled:"+bowler.getBallsBowled());
			System.out.println("BowlerWickets:"+bowler.getWickets());
		}

	}



