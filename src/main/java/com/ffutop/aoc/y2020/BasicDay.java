package com.ffutop.aoc.y2020;

import com.ffutop.aoc.y2020.util.ReaderUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fangfeng
 * @since 2020-12-01
 */
public class BasicDay {

    protected List<String> readLists() {
        String fileName = this.getClass().getSimpleName().toLowerCase() + ".in";
        List<String> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = ReaderUtil.getBufferedReader(fileName);
            String line ;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException iox) {
            System.out.println("read lists failed");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    protected List<Integer> readIntegerList() {
        List<Integer> intList = new ArrayList<>();
        List<String> list = readLists();
        for (String obj : list) {
            intList.add(Integer.parseInt(obj));
        }
        return intList;
    }

    protected List<Long> readLongList() {
        List<Long> longList = new ArrayList<>();
        List<String> list = readLists();
        for (String obj : list) {
            longList.add(Long.parseLong(obj));
        }
        return longList;
    }
}