package practise;

public class T2_Batsman {
 //class Batsmans {

	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int fours;
	private int sixes;
	
	T2_Batsman(){
		
	}
	
	public T2_Batsman(String name,int runsScored,
			int centuries,
			int halfCenturies,
			int ballsFaced,
			int fours,
			int sixes) {
		this.name  = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced =  ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String Nname) {
		this.name = Nname;
	}
	public int getRuns() {
		return runsScored;
	}
	public void setRuns(int NrunsScored) {
		this.runsScored = NrunsScored;
	}
	public int getcenturies() {
		return centuries;
	}
	public void setCent(int Ncenturies) {
		this.centuries = Ncenturies;
	}
	public int getballs() {
		return ballsFaced;
	}
	public void setballs(int NballsFaced) {
		this.ballsFaced = NballsFaced;
	}
	public int gethalfcenturies() {
		return halfCenturies;
	}
	public void sethalfCent(int Nhalfcenturies) {
		this.halfCenturies = Nhalfcenturies;
	}
	public int getfours() {
		return fours;
	}
	public void setfour(int Nfours) {
		this.fours = Nfours;
	}
	public int getsixs() {
		return sixes;
	}
	public void setsixs(int Nsixes) {
		this.sixes = Nsixes;
	}
	
	public void setData(String name,int runsScored,
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
	public float getStrikeRate()
	{
		float strikerate;
		strikerate = ((runsScored * 100)/ ballsFaced);
		return strikerate;
	}
	public int getRunsScoredInBoundaries()
	{
		int boundaries;
		boundaries  = ( 4 * fours + 6 * sixes );
		return boundaries;
	}

 


	public static void main(String[] args) {

		T2_Batsman batsman1 = new T2_Batsman();
				batsman1.name = "Virak Kohli";
				batsman1.runsScored = 973;
				batsman1.centuries = 4;
				batsman1.halfCenturies = 7;
				batsman1.ballsFaced = 640;
				batsman1.fours = 83;
				batsman1.sixes = 38;

				System.out.println("Name : " + batsman1.name);
				System.out.println("Runs Scored : " + batsman1.runsScored);
				System.out.println("Balls Faced : " + batsman1.ballsFaced);
				System.out.println("Centuries : " + batsman1.centuries);
				System.out.println("Half Centuries : " + batsman1.halfCenturies);
				System.out.println("Fours : " + batsman1.fours);
				System.out.println("Sixes : " + batsman1.sixes);
				System.out.println("Strike Rate : " + batsman1.getStrikeRate());
				System.out.println("RunsScoredInBoundaries : " + batsman1.getRunsScoredInBoundaries());

				T2_Batsman batsman2 = new T2_Batsman();
				batsman2.setData("AB de Villers", 687, 1, 6, 407, 57, 37);
				System.out.println("Name : " + batsman2.name);
				System.out.println("Runs Scored : " + batsman2.runsScored);
				System.out.println("Balls Faced : " + batsman2.ballsFaced);
				System.out.println("Centuries : " + batsman2.centuries);
				System.out.println("Half Centuries : " + batsman2.halfCenturies);
				System.out.println("Fours : " + batsman2.fours);
				System.out.println("Sixes : " + batsman2.sixes);
				System.out.println("Strike Rate : " + batsman2.getStrikeRate());
				System.out.println("RunsScoredInBoundaries : " + batsman2.getRunsScoredInBoundaries());

			}




}
