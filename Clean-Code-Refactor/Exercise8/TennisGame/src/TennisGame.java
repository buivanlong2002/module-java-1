public class TennisGame {

    private static final String[] SCORE_NAMES = {"Love", "Fifteen", "Thirty", "Forty"};
    private static final String TIE_SCORE = "Deuce";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (isTie(player1Score, player2Score)) {
            return getTieScore(player1Score);
        }

        if (isAdvantageOrWin(player1Score, player2Score)) {
            return getAdvantageOrWinScore(player1Score, player2Score);
        }

        return getNormalScore(player1Score, player2Score);
    }

    private static boolean isTie(int player1Score, int player2Score) {
        return player1Score == player2Score;
    }

    private static boolean isAdvantageOrWin(int player1Score, int player2Score) {
        return player1Score >= 4 || player2Score >= 4;
    }

    private static String getTieScore(int score) {
        switch (score) {
            case 0: return "Love-All";
            case 1: return "Fifteen-All";
            case 2: return "Thirty-All";
            case 3: return "Forty-All";
            default: return TIE_SCORE;
        }
    }

    private static String getAdvantageOrWinScore(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) {
            return "Advantage player1";
        } else if (scoreDifference == -1) {
            return "Advantage player2";
        } else if (scoreDifference >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getNormalScore(int player1Score, int player2Score) {
        return SCORE_NAMES[player1Score] + "-" + SCORE_NAMES[player2Score];
    }
}