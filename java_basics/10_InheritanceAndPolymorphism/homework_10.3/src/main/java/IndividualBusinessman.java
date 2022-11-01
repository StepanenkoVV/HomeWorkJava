public class IndividualBusinessman extends Client {


    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void put(double amountToPut) {
        if (amountToPut < 0) {
            getAmount();
        } else if (amountToPut < 1000) {
            amount = amount + (amountToPut - (amountToPut * 0.01));
        } else if (amountToPut >= 1000) {
            amount = amount + (amountToPut - (amountToPut * 0.005));
        }

    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake > amount) {
            getAmount();
        } else if (amountToTake < amount) {
            amount = amount - amountToTake;
        }
    }

}