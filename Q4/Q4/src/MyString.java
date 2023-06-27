import java.util.*;

public class MyString implements IString { 
   
    

@Override
public int f1(String str){
int count = 0;
Set<Character> primeDigit = new HashSet<>(Arrays.asList('2','3','5','7'));
     for (Character ch : primeDigit) {
        if(primeDigit.contains(ch)){
            count++;
        }
    }
     return (int) count;
}

@Override
public String f2(String str){
    String[] word = str.split(" ");
    StringBuilder reversed = new StringBuilder();
    for (int i = word.length - 1; i >= 0; i--) {
        reversed.append(word[i]);
        if(i!=0){
            reversed.append(" ");
        }
    }
    return reversed.toString();
}
}

