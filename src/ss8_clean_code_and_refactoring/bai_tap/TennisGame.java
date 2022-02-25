package ss8_clean_code_and_refactoring.bai_tap;

public class TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int scorePlayerOne, int scorePlayerTwo) {
        String score = "";
        int tempScore = 0;
        if (scorePlayerOne == scorePlayerTwo) {
            score = displayDrawPoint(scorePlayerOne);
        } else if (scorePlayerOne >= 4 || scorePlayerTwo >= 4) {
            score = displayACloseWinner(scorePlayerOne, scorePlayerTwo);
        } else {
            score = displayScore(scorePlayerOne, scorePlayerTwo, score);
        }
        return score;
    }

    private static String displayDrawPoint(int scorePlayerOne) {
        String score;
        switch (scorePlayerOne) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private static String displayACloseWinner(int scorePlayerOne, int scorePlayerTwo) {
        String score;
        int minusResult = scorePlayerOne - scorePlayerTwo;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String displayScore(int scorePlayerOne, int scorePlayerTwo, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scorePlayerOne;
            else {
                score += "-";
                tempScore = scorePlayerTwo;
            }
            switch (tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}