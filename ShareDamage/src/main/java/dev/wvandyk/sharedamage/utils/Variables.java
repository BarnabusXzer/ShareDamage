package dev.wvandyk.sharedamage.utils;

public class Variables {

    private boolean status;
    private String mode;
    private String difficulty;
    private boolean showCause;

    public boolean getShowCause() {
        return this.showCause;
    }

    public void setShowCause(boolean showCause) {
        this.showCause = showCause;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getMode() {
        return this.mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void clearAll() {
        this.status = false;
        this.difficulty = null;
        this.mode = null;
    }
}
