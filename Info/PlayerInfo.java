package com.company.Info;

public class PlayerInfo {
    private String name;
    private boolean isThrown;

    public PlayerInfo(String name, boolean isThrown) {
        this.name = name;
        this.isThrown = isThrown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isThrown() {
        return isThrown;
    }

    public void setThrown(boolean thrown) {
        isThrown = thrown;
    }
}
