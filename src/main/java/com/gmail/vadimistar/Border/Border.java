package com.gmail.vadimistar.Border;

import org.bukkit.World;

public class Border implements Runnable {
    private final World world;
    private boolean isPaused = false;

    private final int startWidth;
    private final int endWidth;
    private final int startPhaseInMinutes;
    private final int shrinkPhaseInMinutes;

    private GamePhase phase = GamePhase.START;

    public Border(World world,
                  int startWidth,
                  int endWidth,
                  int startPhaseInMinutes,
                  int shrinkPhaseInMinutes
                  ) {
        this.world = world;
        this.startWidth = startWidth;
        this.endWidth = endWidth;
        this.startPhaseInMinutes = startPhaseInMinutes;
        this.shrinkPhaseInMinutes = shrinkPhaseInMinutes;
    }

    public void run() {
        // TODO: 17.02.2022
        /*
        * timer startPhaseInMinutes
        *
        *
        * */
    }

    public World getWorld() {
        return world;
    }

    public boolean isPaused() {
        return isPaused;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }

    public int getStartWidth() {
        return startWidth;
    }

    public int getEndWidth() {
        return endWidth;
    }

    public int getStartPhaseInMinutes() {
        return startPhaseInMinutes;
    }

    public int getShrinkPhaseInMinutes() {
        return shrinkPhaseInMinutes;
    }
}
