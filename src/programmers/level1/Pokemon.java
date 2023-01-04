package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {

    public int solution(int[] nums) {
        int pokemonNum = nums.length / 2;

        Set<Integer> kindOfPokemon = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            kindOfPokemon.add(nums[i]);
        }

        if(kindOfPokemon.size() < pokemonNum){
            return kindOfPokemon.size();
        }

        return pokemonNum;
    }
}


