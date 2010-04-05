package org.lucassus.jmine.enums;

/**
 * Represents Game type configuration.
 */
public enum GameType {

    /**
     * Configuration for novice player.
     */
    NOVICE(9, 9, 10),
    /**
     * Configuration for intermediate player.
     */
    INTERMEDIATE(16, 16, 40),
    /**
     * Configuration for expert player.
     */
    EXPERT(30, 16, 99),
    /**
     * Custom configuration.
     */
    USER(9, 9, 10);
    /**
     * Szerokosc pola minowego
     */
    private int mineFieldWidth;
    /**
     * Wysokosc pola minowego
     */
    private int mineFieldHeight;
    /**
     * Liczba min znajdujacych sie na polu minowym
     */
    private int numberOfMines;

    /**
     * The Constructor.
     * @param mineFieldWidth
     * @param mineFieldHeight
     * @param numberOfMines
     */
    GameType(int mineFieldWidth, int mineFieldHeight, int numberOfMines) {
        this.mineFieldWidth = mineFieldWidth;
        this.mineFieldHeight = mineFieldHeight;
        this.numberOfMines = numberOfMines;
    }

    public int getMineFieldWidth() {
        return mineFieldWidth;
    }

    public int getMineFieldHeight() {
        return mineFieldHeight;
    }

    public int getNumberOfMines() {
        return numberOfMines;
    }

    public void setMineFieldWidth(int mineFieldWidth) throws GameTypeException {
        canSetCustomGame();
        this.mineFieldWidth = mineFieldWidth;
    }

    public void setMineFieldHeight(int mineFieldHeight) throws GameTypeException {
        canSetCustomGame();
        this.mineFieldHeight = mineFieldHeight;
    }

    public void setNumberOfMines(int numberOfMines) throws GameTypeException {
        canSetCustomGame();
        this.numberOfMines = numberOfMines;
    }

    private void canSetCustomGame() throws GameTypeException {
        if (this != USER) {
            throw new GameTypeException();
        }
    }

    public int getFieldsCount() {
        return getMineFieldWidth() * getMineFieldHeight();
    }
}
