package com.test;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Created by wangzhenhua on 15/9/28.
 */
public class ToIntegerStreamTest
{
    public static class  Album
    {
        private List<Track> track = new ArrayList<>();
    }

    public static class Track {
        private Integer length;
    }

    public static void main(String[] args)
    {
        Album album = new Album();
        Track track = new Track();
        track.length = 1;
        album.track.add(track);

        track = new Track();
        track.length = 2;
        album.track.add(track);

        track = new Track();
        track.length = 3;
        album.track.add(track);

        final IntSummaryStatistics intSummaryStatistics = album
                                                            .track
                                                            .stream()
                                                            .mapToInt(t -> t.length)
                                                            .summaryStatistics();
        System.out.printf("max: %s, min: %s, averge: %s",
                intSummaryStatistics.getMax(),intSummaryStatistics.getMin(),intSummaryStatistics.getAverage());



    }

}
