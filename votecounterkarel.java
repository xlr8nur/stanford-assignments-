/**
* The VoteCounterKarel subclass cleans out the chad from
* a ballot as described in the section handout.
*/

import stanford.karel.*;

public class VoteCounterKarel extends SuperKarel {
        public void run () {
                while(frontIsClear) {
                      move();
                      if(noBeeperPresent())
                            removeChad();
                }
                move();
} 

/**
* Removes any chad from a ballot, which consists of beepers
* in the squares to right and left of Karel's current position.
*/

private void removeChad() {
        turnLeft();
        checkCorner();
        checkCorner();
        turnRight();
}  

/**
* If there is a beeper in that position, Karel must assume that the
voter did not intend to cast a vote in that column and move on to the next. If there is no
beeper in the center square, Karel must check the other two squares in the ballot and
remove any and all beepers so that the ballot can be counted correctly. */

private void checkCorner() {
        move();
        while(beeperPresent())
                pickBeeper();
        turnAround();
        move();
}

}





