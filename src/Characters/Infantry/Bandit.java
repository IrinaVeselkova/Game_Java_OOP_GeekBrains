package Characters.Infantry;

public class Bandit extends Infantry {

    public Bandit(String name, int x, int y, String nameTeam) {
        super(name, x, y, nameTeam);
    }

//    @Override
//    public void getStep(ArrayList<Character> enemy, ArrayList<Character> friend) {
//        if (health <= 0) return;
//        Character target = super.getMinDistance(enemy);
//        if (Place.getDistance(this.place,target.place) < 2) {
//            this.toAttack(target);
//            return;
//        }
//        Place diff = Place.getDifference(this.place,target.place);
//        Place newposition = new Place(place.X, place.Y);
//        if (Math.abs(diff.X) > Math.abs(diff.Y)) {
//            newposition.X += diff.X < 0 ? 1 : -1;
//        } else {
//            newposition.Y += diff.Y < 0 ? 1 : -1;
//        }
//        for (Character unit : friend) {
//          if (unit.place.equals(newposition)) {
//                    unit.place.X=place.X;
//                    unit.place.Y=place.Y;
//         }
//        }
//        place = newposition;
//    }
    public  String getInfo(){
        return "Бандит";
    }
}
