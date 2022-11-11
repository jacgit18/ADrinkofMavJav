package org.example;

public class Main {
    public int main(int x, int y) {
      if(y==8){
        throw new IllegalArgumentException("no more");
    }
        return x + y;
}
}