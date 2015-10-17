package com.test;

import java.util.stream.Stream;
import java.util.List;

/**
 * Describe interface Performance here.
 *
 *
 * Created: Mon Sep 28 19:21:46 2015
 *
 * @author <a href="mailto:wangzhenhua@wangzhenhuadeMacBook-Pro.local">王震华</a>
 * @version 1.0
 */
public interface Performance
{

    public String getName();

    public Stream<Artist> getMusicians();

    public List<String>  getAllMusicials();
}
