public class Player<T> {
    private int playerId;
    private String name;
    private int lives = 3;
    private int gameId;
    private T[] rewards;

    Player(int playerId, String name, int gameId){
        this.playerId = playerId;
        this.name = name;
        this.gameId = gameId;
    }

    public void showPlayerRewards(){
        try {
            for(T reward : this.rewards) {
                reward.mostrarRecompensa();
            }
        }catch (Exception e){
            System.out.println("Error in show rewards.");
        }
    }

    public void showPlayerLives(){
        System.out.println("Player remaining lives: "+this.lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public T[] getRewards() {
        return rewards;
    }

    public void setRewards(T[] rewards) {
        this.rewards = rewards;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}
