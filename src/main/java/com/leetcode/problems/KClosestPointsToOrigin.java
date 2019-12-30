/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import javafx.scene.layout.Priority;

/**
 *
 * @author kb7290
 */
public class KClosestPointsToOrigin {

    public static void main(String[] args) {
        //int[][] points = new int[][]{{1, 3}, {-2, 2}};
        // int[][] points = new int[][]{{1, 0}, {0, 1}};
        int[][] points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        kClosestPoints(points, 2);
    }

    public static void kClosestPoints(int[][] points, int k) {

        PriorityQueue<Point> pq = new PriorityQueue<>((Point p1, Point p2) -> p1.getDistanceFromOrigin() > p2.getDistanceFromOrigin() ? 1 : -1);

        for (int[] point : points) {
            pq.add(new Point(point));
        }
        int[][] finalpoints = new int[k][2];
        for (int i = 0; i < k; i++) {
            finalpoints[i] = pq.remove().getPoint();
        }
        System.out.println(Arrays.deepToString(finalpoints));

    }

    public static class Point {

        private final int[] point;

        public Point(int[] point) {
            this.point = point;
        }

        public double getDistanceFromOrigin() {
            return Math.hypot(point[0], point[1]);
        }

        public int[] getPoint() {
            return point;
        }

    }

}
