package practise;

public abstract class Player implements Comparable {
	private int id;
	private String name;
	private static int idGenerator = 100000;

	public abstract float calcStrikeRate(); 
	public Player() {} 
	public Player(String name) {

		this.id = ++idGenerator;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public String toString(){
		
		return name+ " " + id + " " + idGenerator ;  	
	}
	//@Override
//	public int compare(Player a, Player b) 
  //  { 
	//	return a.name.compareTo(b.name); 
  //  } 
}
class Bman extends Player  {
	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int sixes;
	private int fours;
	private int ballsFaced;

	public Bman(String name,int runsScored,
			int centuries,
			int halfCenturies,
			int ballsFaced,
			int fours,
			int sixes)
	{
		this.name  = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced =  ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
		
	}
	
	public int getRunsScored() {
		return runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public int getSixes() {
		return sixes;
	}

	public int getFours() {
		return fours;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}
	public String toString(){
		return name+ runsScored +  centuries + halfCenturies + ballsFaced + fours + sixes; 
	}
	public float calcStrikeRate() {
		float strike_rate;
		strike_rate = (runsScored / ballsFaced) ;
		return strike_rate;
	}
	
}

class Bowler extends Player {

	private String name;
	private int ballsBowled;
	private int runsLeaked;
	private int wickets;

	public Bowler(String name, int ballsBowled, int runsLeaked, int wickets){
		
		this.name = name;
		this.ballsBowled = ballsBowled;
		this.runsLeaked = runsLeaked;
		this.wickets = wickets;
	}
	
	public int getBallsBowled() {
		return ballsBowled;
	}

	public int getRunsLeaked() {
		return runsLeaked;
	}

	public int getWickets() {
		return wickets;
	}
	public String toString() {
		return name + ballsBowled + runsLeaked + wickets; 
	}
	public float calcStrikeRate() {
		float res = 10;
		return res; 
	}
	
}
