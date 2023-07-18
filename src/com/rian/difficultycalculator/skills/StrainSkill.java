package com.rian.difficultycalculator.skills;

import com.rian.difficultycalculator.beatmap.hitobject.DifficultyHitObject;
import com.rian.difficultycalculator.math.Interpolation;
import com.rian.difficultycalculator.math.MathUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

import ru.nsu.ccfit.zuev.osu.game.mods.GameMod;

/**
 * Used to processes strain values of difficulty hit objects, keep track of strain levels caused by
 * the processed objects and to calculate a final difficulty value representing the difficulty of
 * hitting all the processed objects.
 */
public abstract class StrainSkill extends Skill {
    /**
     * The strain peaks of each sections.
     */
    protected final ArrayList<Double> strainPeaks = new ArrayList<>();

    private double currentSectionPeak;
    private double currentSectionEnd;

    /**
     * @param mods The mods that this skill processes.
     */
    public StrainSkill(EnumSet<GameMod> mods) {
        super(mods);
    }

    @Override
    public void process(DifficultyHitObject current) {
        // The first object doesn't generate a strain, so we begin with an incremented section end
        int sectionLength = 400;
        if (current.index == 0) {
            currentSectionEnd = Math.ceil(current.startTime / sectionLength) * sectionLength;
        }

        while (current.startTime > currentSectionEnd) {
            saveCurrentPeak();
            startNewSectionFrom(currentSectionEnd, current);
            currentSectionEnd += sectionLength;
        }

        currentSectionPeak = Math.max(strainValueAt(current), currentSectionPeak);
        saveToHitObject(current);
    }

    @Override
    public double difficultyValue() {
        ArrayList<Double> strains = getCurrentStrainPeaks();
        Collections.sort(strains, (d1, d2) -> Double.compare(d2, d1));

        if (getReducedSectionCount() > 0) {
            // We are reducing the highest strains first to account for extreme difficulty spikes.
            for (int i = 0; i < Math.min(strains.size(), getReducedSectionCount()); ++i) {
                double scale = Math.log10(Interpolation.linear(1d, 10, MathUtils.clamp((float) i / getReducedSectionCount(), 0, 1)));

                strains.set(i, strains.get(i) * Interpolation.linear(getReducedSectionBaseline(), 1, scale));
            }

            Collections.sort(strains, (d1, d2) -> Double.compare(d2, d1));
        }

        // Difficulty is the weighted sum of the highest strains from every section.
        // We're sorting from highest to lowest strain.
        double difficulty = 0;
        double weight = 1;

        for (double strain : strains) {
            difficulty += strain * weight;
            weight *= getDecayWeight();
        }

        return difficulty * getDifficultyMultiplier();
    }

    /**
     * Returns a list of the peak strains for each <code>sectionLength</code> section of the beatmap,
     * including the peak of the current section.
     */
    public ArrayList<Double> getCurrentStrainPeaks() {
        ArrayList<Double> strains = new ArrayList<>(strainPeaks);
        strains.add(currentSectionPeak);

        return strains;
    }

    /**
     * Gets the final multiplier to be applied to the final difficulty value after all other calculations.
     */
    protected double getDifficultyMultiplier() {
        return 1.06;
    }

    /**
     * Gets the weight by which each strain value decays.
     */
    protected double getDecayWeight() {
        return 0.9;
    }

    /**
     * Calculates the strain value at the hit object.
     * This value is calculated with or without respect to previous objects.
     *
     * @param current The hit object to calculate.
     * @return The strain value at the hit object.
     */
    protected abstract double strainValueAt(DifficultyHitObject current);

    /**
     * Retrieves the peak strain at a point in time.
     *
     * @param time The time to retrieve the peak strain at.
     * @param current The current hit object.
     * @return The peak strain.
     */
    protected abstract double calculateInitialStrain(double time, DifficultyHitObject current);

    /**
     * Saves the current strain to a hit object.
     *
     * @param current The hit object to save to.
     */
    protected abstract void saveToHitObject(DifficultyHitObject current);

    /**
     * Gets the number of sections with the highest strains, which the peak strain reductions will apply to.
     * This is done in order to decrease their impact on the overall difficulty of the beatmap for this skill.
     */
    protected int getReducedSectionCount() {
        return 10;
    }

    /**
     * Gets the baseline multiplier applied to the section with the biggest strain.
     */
    protected double getReducedSectionBaseline() {
        return 0.75;
    }

    /**
     * Saves the current peak strain level to the list of strain peaks,
     * which will be used to calculate an overall difficulty.
     */
    private void saveCurrentPeak() {
        strainPeaks.add(currentSectionPeak);
    }

    /**
     * Sets the initial strain level for a new section.
     *
     * @param time The beginning of the new section, in milliseconds.
     * @param current The current hit object.
     */
    private void startNewSectionFrom(double time, DifficultyHitObject current) {
        // The maximum strain of the new section is not zero by default.
        // This means we need to capture the strain level at the beginning of the new section, and use that as the initial peak level.
        currentSectionPeak = calculateInitialStrain(time, current);
    }
}
