public class Game  
{  
private Level levelOne;  
private Level levelTwo;  
private Level levelThree;
private boolean bonus;

/** Postcondition: All instance variables have been initialized. */  
public Game()  
{ 
    levelOne = new Level();
    levelTwo = new Level();
    levelThree = new Level();
}  

public boolean isBonus()
{
    return bonus;
}

public void makeBonus()
{
    bonus = true;
}

public Level getLevel(int i)
{
    if (i == 1) return levelOne;
    if (i == 2) return levelTwo;
    if (i == 3) return levelThree;
    return null;
}

public void play()  
{ /* implementation not shown */ }  


public int getScore()
{ 
    int points = 0;
    if (levelOne.goalReached())
    {
        points += levelOne.getPoints();
        if (levelTwo.goalReached())
        {
            points += levelTwo.getPoints();
            if (levelThree.goalReached())
            {
                points += levelThree.getPoints();
            }
        }
    } if (isBonus()) points *= 3;
    return points;
}  
/** Simulates the play of num games and returns the highest score earned, as 
* described in part (b) 
* Precondition: num > 0 
*/ 

//public int playManyTimes(int num)  
//{ /* to be implemented in part (b) */ }  
// There may be instance variables, constructors, and methods that are not shown. 
//}
}  
