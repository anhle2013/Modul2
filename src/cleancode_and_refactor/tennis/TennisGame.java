package cleancode_and_refactor.tennis;

public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        StringBuilder score = new StringBuilder();
        int tempScore=0;
        if (scorePlayer1==scorePlayer2)
        {
            switch (scorePlayer1)
            {
                case 0:
                    score = new StringBuilder(LOVE_ALL);
                    break;
                case 1:
                    score = new StringBuilder(FIFTEEN_ALL);
                    break;
                case 2:
                    score = new StringBuilder(THIRTY_ALL);
                    break;
                case 3:
                    score = new StringBuilder(FORTY_ALL);
                    break;
                default:
                    score = new StringBuilder(DEUCE);
                    break;

            }
        }
        else if (scorePlayer1>=4 || scorePlayer2>=4)
        {
            int minusResult = scorePlayer1-scorePlayer2;
            if (minusResult==1) score = new StringBuilder("Advantage player: " + player1Name);
            else if (minusResult ==-1) score = new StringBuilder("Advantage player: " + player2Name);
            else if (minusResult>=2) score = new StringBuilder("Win for player: " + player1Name);
            else score = new StringBuilder("Win for player: " + player2Name);
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scorePlayer1;
                else { score.append("-"); tempScore = scorePlayer2;}
                switch(tempScore)
                {
                    case 0:
                        score.append(LOVE);
                        break;
                    case 1:
                        score.append(FIFTEEN);
                        break;
                    case 2:
                        score.append(THIRTY);
                        break;
                    case 3:
                        score.append(FORTY);
                        break;
                }
            }
        }
        return score.toString();
    }
}