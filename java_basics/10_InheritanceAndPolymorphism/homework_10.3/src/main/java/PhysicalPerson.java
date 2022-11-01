public class PhysicalPerson extends Client {

    @Override
    public double getAmount() {
        return amount;
    }


    @Override
    public void put(double amountToPut) {
        if (amountToPut < 0.0) {
            getAmount();
        } else {
            amount += amountToPut;
        }

    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake > getAmount()) {
            getAmount();
        } else {
            amount = amount - amountToTake;
        }
    }

}
