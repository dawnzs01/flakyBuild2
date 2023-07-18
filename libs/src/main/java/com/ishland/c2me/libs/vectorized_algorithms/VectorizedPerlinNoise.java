package com.ishland.c2me.libs.vectorized_algorithms;

import jdk.incubator.vector.DoubleVector;
import jdk.incubator.vector.VectorSpecies;

public class VectorizedPerlinNoise {

    protected static final int[][] GRADIENTS = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}, {1, 1, 0}, {0, -1, 1}, {-1, 1, 0}, {0, -1, -1}};
    private static final VectorSpecies<Double> speciesPreferred = DoubleVector.SPECIES_PREFERRED;
    private static final VectorSpecies<Double> speciesGrad = speciesPreferred.length() > 8 ? DoubleVector.SPECIES_512 : speciesPreferred;
    private static final VectorSpecies<Double> speciesPerlinFade = speciesPreferred.length() > 4 ? DoubleVector.SPECIES_256 : speciesPreferred;

    static {
        System.out.println("Using vector size of " + speciesGrad.vectorBitSize() + " bits for grad()");
        System.out.println("Using vector size of " + speciesPerlinFade.vectorBitSize() + " bits for perlinFade()");
    }

    private static double lerp(double delta, double start, double end) {
        return start + delta * (end - start);
    }

    static double sample(byte[] permutations, int sectionX, int sectionY, int sectionZ, double localX, double localY, double localZ, double fadeLocalX) {
        int i = permutations[sectionX & 0xFF] & 255;
        int j = permutations[sectionX + 1 & 0xFF] & 255;
        int k = permutations[i + sectionY & 0xFF] & 255;
        int l = permutations[i + sectionY + 1 & 0xFF] & 255;
        int m = permutations[j + sectionY & 0xFF] & 255;
        int n = permutations[j + sectionY + 1 & 0xFF] & 255;

        // grad ops
        double[] gradX = new double[] {
                GRADIENTS[permutations[k + sectionZ & 0xFF] & 15][0],
                GRADIENTS[permutations[m + sectionZ & 0xFF] & 15][0],
                GRADIENTS[permutations[l + sectionZ & 0xFF] & 15][0],
                GRADIENTS[permutations[n + sectionZ & 0xFF] & 15][0],
                GRADIENTS[permutations[k + sectionZ + 1 & 0xFF] & 15][0],
                GRADIENTS[permutations[m + sectionZ + 1 & 0xFF] & 15][0],
                GRADIENTS[permutations[l + sectionZ + 1 & 0xFF] & 15][0],
                GRADIENTS[permutations[n + sectionZ + 1 & 0xFF] & 15][0],
        };
        double[] mulX = new double[] {
                localX, localX - 1.0, localX, localX - 1.0,
                localX, localX - 1.0, localX, localX - 1.0,
        };
        double[] gradY = new double[] {
                GRADIENTS[permutations[k + sectionZ & 0xFF] & 15][1],
                GRADIENTS[permutations[m + sectionZ & 0xFF] & 15][1],
                GRADIENTS[permutations[l + sectionZ & 0xFF] & 15][1],
                GRADIENTS[permutations[n + sectionZ & 0xFF] & 15][1],
                GRADIENTS[permutations[k + sectionZ + 1 & 0xFF] & 15][1],
                GRADIENTS[permutations[m + sectionZ + 1 & 0xFF] & 15][1],
                GRADIENTS[permutations[l + sectionZ + 1 & 0xFF] & 15][1],
                GRADIENTS[permutations[n + sectionZ + 1 & 0xFF] & 15][1],
        };
        double[] mulY = new double[] {
                localY, localY, localY - 1.0, localY - 1.0,
                localY, localY, localY - 1.0, localY - 1.0,
        };
        double[] gradZ = new double[] {
                GRADIENTS[permutations[k + sectionZ & 0xFF] & 15][2],
                GRADIENTS[permutations[m + sectionZ & 0xFF] & 15][2],
                GRADIENTS[permutations[l + sectionZ & 0xFF] & 15][2],
                GRADIENTS[permutations[n + sectionZ & 0xFF] & 15][2],
                GRADIENTS[permutations[k + sectionZ + 1 & 0xFF] & 15][2],
                GRADIENTS[permutations[m + sectionZ + 1 & 0xFF] & 15][2],
                GRADIENTS[permutations[l + sectionZ + 1 & 0xFF] & 15][2],
                GRADIENTS[permutations[n + sectionZ + 1 & 0xFF] & 15][2],
        };
        double[] mulZ = new double[] {
                localZ, localZ, localZ, localZ,
                localZ - 1.0, localZ - 1.0, localZ - 1.0, localZ - 1.0,
        };

        double[] gradResArray = new double[8];
        for (int i1 = 0; i1 < gradX.length; i1 += speciesGrad.length()) {
            final DoubleVector gradXVector = DoubleVector.fromArray(speciesGrad, gradX, i1);
            final DoubleVector mulXVector = DoubleVector.fromArray(speciesGrad, mulX, i1);
            final DoubleVector resX = gradXVector.mul(mulXVector);
            final DoubleVector gradYVector = DoubleVector.fromArray(speciesGrad, gradY, i1);
            final DoubleVector mulYVector = DoubleVector.fromArray(speciesGrad, mulY, i1);
            final DoubleVector resY = gradYVector.mul(mulYVector);
            final DoubleVector gradZVector = DoubleVector.fromArray(speciesGrad, gradZ, i1);
            final DoubleVector mulZVector = DoubleVector.fromArray(speciesGrad, mulZ, i1);
            final DoubleVector resZ = gradZVector.mul(mulZVector);
            final DoubleVector res = resX.add(resY).add(resZ);
            res.intoArray(gradResArray, i1);
        }

        // fade ops
        // perlinFade(value): value * value * value * (value * (value * 6.0 - 15.0) + 10.0)
        final double[] fades = new double[]{localX, fadeLocalX, localZ, 0.0};
        final double[] fadeResArray = new double[4];
        for (int i1 = 0; i1 < fades.length; i1 += speciesPerlinFade.length()) {
            final DoubleVector vector = DoubleVector.fromArray(speciesPerlinFade, fades, i1);
            final DoubleVector res = vector
                    .mul(6.0)
                    .add(-15.0)
                    .mul(vector)
                    .add(10.0)
                    .mul(vector)
                    .mul(vector)
                    .mul(vector);
            res.intoArray(fadeResArray, i1);
        }

        // lerp(delta, start, end): start + delta * (end - start)

        return lerp(
                fadeResArray[2],
                lerp(fadeResArray[1], lerp(fadeResArray[0], gradResArray[0], gradResArray[1]), lerp(fadeResArray[0], gradResArray[2], gradResArray[3])),
                lerp(fadeResArray[1], lerp(fadeResArray[0], gradResArray[4], gradResArray[5]), lerp(fadeResArray[0], gradResArray[6], gradResArray[7]))
        );
    }

}
