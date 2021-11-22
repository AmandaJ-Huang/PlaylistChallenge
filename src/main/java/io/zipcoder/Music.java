package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer upCount = 0;
        Integer downCount = 0;
        Integer upIndex = startIndex;
        Integer downIndex = startIndex;

        for (int i = 0; i < playList.length; i++) {
            if (playList[upIndex].equals(selection) || playList[downIndex].equals(selection)) {
                break;
            }

            if (upIndex == 0) {
                upIndex = playList.length-1;
            } else {
                upIndex--;
            }
            upCount++;

            if (downIndex == playList.length-1) {
                downIndex = 0;
            } else {
                downIndex++;
            }
            downCount++;
        }

        if (downCount < upCount) {
            return downCount;
        }
        return upCount;
    }
}
