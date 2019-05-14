class TapeDeck {
boolean canRecord = false;
void playType() {
System.out.println("tape playing");
}
void record
Tape() {
System.out.println("tape recording");
}
}
 class TapeDeckTestDrive {
public static void main(String[] args)
{
TapeDeck t = new TapeDeck();
t.canRecord = true;
t.playTape();
if(t.canRecord == true) {
t.recordTape();
}
}
}