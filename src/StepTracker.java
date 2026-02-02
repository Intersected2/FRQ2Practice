public class StepTracker{
	int requirement;
	double averagesteps = 0;
	int activedays = 0;
	double totaldays = 0;
	double totalsteps = 0;
	public StepTracker(int requirement){
		this.requirement = requirement;
  }
  public void addDailySteps(int steps) {
	  totalsteps += steps;
	  if (steps >= requirement) {
		  activedays++;
		  totaldays++;
	  } else {
		  totaldays++;
	  }
  }
  public int activeDays(){
	  return activedays;
  }
  public double averageSteps(){
		if (totaldays != 0){
			averagesteps = totalsteps / totaldays;
			return averagesteps;
		} else{
			return 0.0;
		}
  }
}
