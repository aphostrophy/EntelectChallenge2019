package za.co.entelect.challenge.command;

import za.co.entelect.challenge.command.*;
import za.co.entelect.challenge.entities.*;
import za.co.entelect.challenge.enums.CellType;
import za.co.entelect.challenge.enums.Direction;

import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;


public class Utilities {

    public Utilities() {

    }

    public int getDirtID(List<Cell> surroundingBlocks){
        for(int i=0;i<surroundingBlocks.size();i++){
            if(surroundingBlocks.get(i).type==CellType.DIRT){
                return i;
            }
        }
        return -1;
    }

    public float gradient(Worm w1, Worm w2) {
        float deltaX = Math.abs(w1.position.x - w2.position.x);
        float deltaY = Math.abs(w1.position.y - w2.position.y);
        return deltaY/deltaX;
    }
}

