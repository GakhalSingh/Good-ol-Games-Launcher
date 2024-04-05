public class Review {
    private int gameplayScore;
    private int graphicsScore;
    private int storylineScore;

    public Review(int gameplayScore, int graphicsScore, int storylineScore) {
        this.gameplayScore = gameplayScore;
        this.graphicsScore = graphicsScore;
        this.storylineScore = storylineScore;
    }

    public double getAverageScore() {
        return (gameplayScore + graphicsScore + storylineScore) / 3.0;
    }
}

