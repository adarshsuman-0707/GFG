package GFGLEET;
import java.util.*;

import collection.Arraylist;
import collection.Itineary;
import java.lang.*;

public class DSA5 {
    
//         public boolean isValidSudoku(char[][] board) {
//             HashSet <Character>[] rows = new HashSet[9];
//             HashSet <Character>[] cols = new HashSet[9];
//             HashSet <Character>[] boxes = new HashSet[9];

// for(int i=0;i<9;i++){
//     rows[i]=new HashSet<>();
//     cols[i]=new HashSet<>();
//     boxes[i]=new HashSet<>();
// }
// for(int i=0;i<9;i++){
//     for(int j=0;j<9;j++){
//         char num=board[i][j];
//         if(num=='.'){
//             continue;
//         }
//         if(rows[i].contains(num)){
//             return false;
//         }
//         rows[i].add(num);
//         if(cols[j].contains(num)){
//             return false;
//         }
//         cols[j].add(num);
//       int boxindex=(i/3)*3+j/3;
//       if(boxes[boxindex].contains(num)) return false;
//       boxes[boxindex].add(num);
//     }
// }



//             return true;
//         }
public List<Integer> findSubstring(String s, String[] words) {
    List <Integer> result=new ArrayList<>();
    if(s==null||s.length()==0||words==null||words.length==0){
        return result;
    }
    int wordLength=words[0].length();
    int wordcount=words.length;
    int totalLength=wordLength*wordcount;
    Map<String,Integer> wordMap=new HashMap<>();
    for(String word : words){
        wordMap.put(word, wordMap.getOrDefault(word,0)+1);
    }
    for(int i=0;i<=s.length()-totalLength;i++){
        String currentsubstring=s.substring(i,i+totalLength);
        if(isValidConcatenation(currentsubstring,wordLength,wordMap)){
            result.add(i);
        }
    }
    
    return result;


}

private boolean isValidConcatenation(String s, int wordLength, Map<String, Integer> wordMap) {

    Map<String,Integer> seenword=new HashMap<>();
    for(int j=0;j<s.length();j+=wordLength){
        String currentword=s.substring(j, j+wordLength);
        if(!wordMap.containsKey(currentword)){
            return false;
        }
        seenword.put(currentword,seenword.getOrDefault(currentword, 0)+1);
        if(seenword.get(currentword)>wordMap.get(currentword)){
            return false;
        }
    }

    return true;
}

 
}
