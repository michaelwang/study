package com.test;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Describe class StreamApi here.
 *
 *
 * Created: Mon Sep 28 21:25:21 2015
 *
 * @author wangzhenhua
 * @version 1.0
 */
public class StreamApi
{

    public int sum(Stream<Integer> numbers)
    {
        return  numbers.reduce(0,(acc,elem) -> acc + elem);
    }




    public List<String> artists(Stream<Artist> artists)
    {
       return  artists
                     .map( t -> "name:"+ t.getName() + " country:" +  t.getCountry() )
                     .collect( Collectors.toList() );
    }

    public static final void main(final String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        StreamApi streamApi = new StreamApi();
        System.out.println(streamApi.sum(list.stream()));

        List<Artist> artists = new ArrayList<>();
        Artist artist = new Artist();
        artist.setName("author_a");
        artist.setCountry("country_a");
        artists.add(artist);

        Artist artistb = new Artist();
        artistb.setName("author_b");
        artistb.setCountry("country_b");
        artists.add(artistb);
        streamApi.artists(artists.stream()).forEach( t -> System.out.println(t) );
    }


}
