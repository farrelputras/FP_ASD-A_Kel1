package TTTGraphicOOP;

/**
 * ES234317-Algorithm and Data Structures
 * Semester Ganjil, 2023/2024
 * Group Capstone Project
 * Group #1
 * 1 - 5026221035 - Mufidhatul Nafisa
 * 2 - 5026221120 - M. Shalahuddin Arif Laksono
 * 3 - 5026221102 - Fernandio Farrel Putra S.
 */

/**
 * This enum is used by:
 * 1. Player: takes value of CROSS or NOUGHT
 * 2. TTT_Tutorial.Cell content: takes value of CROSS, NOUGHT, or NO_SEED.
 *
 * Ideally, we should define two enums with inheritance, which is,
 *  however, not supported.
 */
public enum Seed {   // to save as "TTT_Tutorial.Seed.java"
    CROSS, NOUGHT, NO_SEED
}