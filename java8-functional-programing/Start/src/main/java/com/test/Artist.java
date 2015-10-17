package com.test;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

/**
 * Describe class Artist here.
 *
 *
 * Created: Mon Sep 28 19:26:09 2015
 *
 * @author <a href="mailto:wangzhenhua@wangzhenhuadeMacBook-Pro.local">王震华</a>
 * @version 1.0
 */
public class Artist {
    /**
     * Describe name here.
     */
    private String name;
    /**
     * Describe country here.
     */
    private String country;

    /**
     * Get the <code>Country</code> value.
     *
     * @return a <code>String</code> value
     */
    public final String getCountry() {
        return country;
    }

    /**
     * Set the <code>Country</code> value.
     *
     * @param country The new Country value.
     */
    public final void setCountry(final String country) {
        this.country = country;
    }

    /**
     * Get the <code>Name</code> value.
     *
     * @return a <code>String</code> value
     */
    public final String getName() {
        return name;
    }

    /**
     * Set the <code>Name</code> value.
     *
     * @param name The new Name value.
     */
    public final void setName(final String name) {
        this.name = name;
    }


    static class PerformanceImpl implements Performance
    {

        public String getName()
        {
            return "test";
        }

        public Stream<Artist> getMusicians()
        {
            List<Artist> artists = new ArrayList<>();
            Artist artist = new Artist();
            artist.name = "The jiakechong";
            artists.add(artist);
            return  artists.stream();
        }

        public List<String> getAllMusicials()
        {
            List<String> musicians = new ArrayList<>();
            musicians.add("a");
            musicians.add("b");
            musicians.add("c");
            return musicians;
        }
    }

    public static final void main(final String[] args)
    {
        Performance performance = new PerformanceImpl();
        //        performance.getMusicians().filter(t -> "The jiakechong".equals(t.getMusicians()))
        //  .collect(getAllMusicials());

        //        performance.getMusicians();
    }


}
