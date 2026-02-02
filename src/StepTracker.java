public class StepTracker{
	int requirement;
	double averagesteps;
	int activedays;
	int totaldays;
	int totalsteps;
	public StepTracker(int requirement){
		this.requirement = requirement;
  }
  public addDailySteps(int steps){
	  totalsteps += steps;
  if (steps >= requirement){
	  activedays++;
	  totaldays++;
  } else {
	  totaldays++
  }
  public int activeDays(){
	  return activedays;
  }
  public int averageSteps(){
	  return totalsteps / totaldays;
  }
}
