/**
  * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    public String newName;
    public double quizScore;
    public int quizzes; 
 
    public Student(String name)
    {
        newName = name;
        quizScore = 0;
        quizzes = 0;
    }
    
    public String getName()
    {
        return newName;
    }
    
    public void addQuiz(int score)
    {
        quizzes = quizzes + 1;
        quizScore = quizScore + score;
    }
    
    public double getTotalScore()
    {
        return quizScore;
    }
    
    public double getAverageScore()
    {
        return quizScore / quizzes;
    }
}
