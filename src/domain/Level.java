package domain;

public class Level {
    private int levelId;
    private String levelName;
    private String levelDescription;
    private Challenge[] levelChallenges;
    private boolean levelCompleted = false;

    // Constructor
    public Level(int levelId, String levelName, String levelDescription, Challenge[] levelChallenges) {
        this.levelId = levelId;
        this.levelName = levelName;
        this.levelDescription = levelDescription;
        this.levelChallenges = levelChallenges;
    }

    // Method to start and play the level
    public boolean playLevel(Player gamePlayer) {
        System.out.println("\n Level " + levelId + ": " + levelName);
        System.out.println(levelDescription);

        for (Challenge currentChallenge : levelChallenges) {
            currentChallenge.showStatement();
            String playerAnswer = gamePlayer.enterAnswer(); // method to be implemented in Player
            if (currentChallenge.checkAnswer(playerAnswer)) {
                System.out.println("Challenge completed");
            } else {
                gamePlayer.modifyLives(-1);
                System.out.println("You failed, try again...");
                return false;
            }
        }
        this.levelCompleted = true;
        System.out.println("You have successfully completed this level!");
        return true;
    }

    // Show list of challenges
    public void showChallengeList() {
        System.out.println("List of challenges:");
        for (int challengeIndex = 0; challengeIndex < levelChallenges.length; challengeIndex++) {
            System.out.println((challengeIndex + 1) + ". " + levelChallenges[challengeIndex].getStatement());
        }
    }

    // Validate if the level has been completed
    public boolean validateLevel(Player gamePlayer) {
        return levelCompleted && gamePlayer.getLives() > 0;
    }

    // Getters and setters
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String newLevelName) {
        this.levelName = newLevelName;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int newLevelId) {
        this.levelId = newLevelId;
    }

    public String getLevelDescription() {
        return levelDescription;
    }

    public void setLevelDescription(String newLevelDescription) {
        this.levelDescription = newLevelDescription;
    }

    public Challenge[] getLevelChallenges() {
        return levelChallenges;
    }

    public void setLevelChallenges(Challenge[] newLevelChallenges) {
        this.levelChallenges = newLevelChallenges;
    }

    public boolean isLevelCompleted() {
        return levelCompleted;
    }

    public void setLevelCompleted(boolean newLevelCompleted) {
        this.levelCompleted = newLevelCompleted;
    }
}
